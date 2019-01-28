package gestioneprogetto.classes;

import gestioneprogetto.exceptions.ProgettoException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe che si occupa del calcolo di ES, EF, LS e LF con le relative date, oltre che al calcolo della durata del progetto con la relativa data di inizio/fine.
 * @author Claudio Metelli
 */
public class Calcolatore {
    /**
     * Durata totale in giorni del progetto.
     */
    private int durataTotale;
    /**
     * HashMap che rappresenta il progetto con tutte le sue attività.
     * La chiave primaria è l'id con il quale l'attività viene identificata, mentre il valore è l'attività in questione.
     */
    private HashMap <String, Attivita> progetto;
    /**
     * HashMap che rappresenta  le attività con le quali inizia il progetto, ovvero quelle senza predecessori.
     * Un'attività iniziale può anche essere finale.
     */
    private HashMap <String, Attivita> iniziali;
    /**
     * HashMap che rappresenta  le attività con le quali finisce il progetto, ovvero quelle che non hanno attività dirattamente successive a quella in questione.
     * Un'attività finale può anche essere iniziale.
     */
    private HashMap <String, Attivita> finali;
    /**
     * Attività utilizzata nel caso in cui vi sia più di un'attività finale.
     * Per eseguire l'algoritmo di calcolo è necessario che essa sia una sola, quindi verrà utilizzato questa attività fittizia per raggruppare tutte le attività finali.
     */
    private Attivita fittizzia;
    /**
     * Data fornita in input di inizio oppure di fine del progetto a seconda della modalità.
     */
    private GregorianCalendar dataInput;
    /**
     * Data da fornire in output di fine oppure inizio del progetto a seconda della modalità.
     */
    private GregorianCalendar dataOutput;
    /**
     * Valore intero che rappresenta la modalità di calcolo del progetto,
     * ovvero il calcolo della data di fine di questo se si conosce la data di inizio,
     * oppure quella di inizio se si conosce la data di fine.
     * Nel primo caso il valore sarà 1, nel secondo sarà -1.
     */
    private int inizioFine;
    /**
     * Lista contente i numeri interi corrispondenti ai giorni della settimana nella classe GregorianCalendar che sono di riposo.
     */
    private ArrayList<Integer> giorniRiposo;
    /**
     * Lista di date di giorni festivi nei non si lavora al progetto.
     */
    private ArrayList<GregorianCalendar> giorniFeriali;
    
    /**
     * Costruttore della classe Calcolatore che inizializza tutti gli attributi con parametri fittizzi che saranno poi settati successivamente.
     */
    public Calcolatore() {
        this.durataTotale = 0;
        this.progetto = new HashMap<>();
        this.iniziali = new HashMap<>();
        this.finali = new HashMap<>();
        this.fittizzia = new Attivita(0, "");
        this.dataInput = new GregorianCalendar();
        this.dataOutput = new GregorianCalendar();
        this.inizioFine = 0;
        this.giorniRiposo = new ArrayList<Integer>();
        this.giorniFeriali = new ArrayList<GregorianCalendar>();
    }
    
    /**
     * Metodo che richiama tutti gli altri metodi della classe per il calcolo di ES, EF, LS e LF con le relative date, oltre che al calcolo della durata del progetto con la relativa data di inizio/fine.
     * @throws ProgettoException se la lista è vuota oppure se non sono trovate attività finali(abbastanza impossibile ma non si sa mai).
     */
    public void start() throws ProgettoException{
        if(progetto.isEmpty())
            throw new ProgettoException("Non è stata inserita nessuna attività.");
        trovaIniziali();
        for(Map.Entry<String, Attivita> attivita : iniziali.entrySet())
            trovaFinali(attivita.getKey());
        if(finali.size() == 1)
            calcoloSingoloFinale();
        else if(finali.size() > 1)
            calcoloMultiFinale();
        else
            throw new ProgettoException("Non sono presenti attività finali, è accaduto un errore non previsto.");
        setProgettoConDate();
        dataOutput = trovaData(durataTotale);
        setCritica();
    }
    
    /**
     * Metodo che trova quali sono le attività iniziali del progetto e le inserisce nell'attributo iniziali.
     */
    private void trovaIniziali(){
        for(Map.Entry<String, Attivita> attivita : progetto.entrySet())
            if(attivita.getValue().getPredecessori().isEmpty())
                iniziali.put(attivita.getKey(), attivita.getValue());
    }
    
    /**
     * Metodo che trova i finali dell'attività inserita e li aggiunge all'attributo finali.
     * @param id Id dell'attività iniziale di cui si vogliono calcolare i finali.
     */
    private void trovaFinali(String id){
        HashMap<String, Attivita> successivi = new HashMap<>();
        for(Map.Entry<String, Attivita> attivita : progetto.entrySet())
            if(attivita.getValue().getPredecessori().contains(progetto.get(id)))
                successivi.put(attivita.getKey(), attivita.getValue());
        if(successivi.isEmpty()){
            if(!finali.containsKey(id))
                finali.put(id, progetto.get(id));
        }
        else
            for(Map.Entry<String, Attivita> attivita : successivi.entrySet())
                trovaFinali(attivita.getKey());
        
    }
    
    /**
     * Metodo ricorsivo che calcola la durata totale del progetto.
     * @param attivitaFinale L'attività finale inserita inizialmente, che nella ricorsione diventa l'attività sulla quale si opera.
     * @param durata_tot Il totale progressivo de percorso fino a quel momento calcolato.
     * @param durata_max La durata massima del progetto fino ad ora trovata.
     * @return 
     */
    private int sommaTot(Attivita attivitaFinale, int durata_tot, int durata_max){
        if(attivitaFinale.getPredecessori().isEmpty())
            if(durata_tot > durata_max)
                durata_max = durata_tot;
        for(Attivita a : attivitaFinale.getPredecessori()){
            int tmp = sommaTot(a, durata_tot + a.getDurata(), durata_max);
            if(durata_max < tmp)
                durata_max = tmp;
        }
        return durata_max;
    }
    
    /**
     * Metodo ricorsivo che imposta ES e EF di tutte le attività.
     * @param id Id dell'attività su cui si sta operando.
     * @param attivita L'attività stessa su cui si opera.
     * @param durataSpec La durata dell'attività in questione.
     * @param durataTot La durata totale del percorso fino a quel momento svolto.
     */
    private void setEarly(String id, Attivita attivita, int durataSpec, int durataTot){
        HashMap<String, Attivita> successivi = new HashMap<>();
        if(attivita.getES() == -1 || durataTot > attivita.getES()){
            attivita.setES(durataTot);
            attivita.setEF(durataTot + durataSpec);
        }
        for(Map.Entry<String, Attivita> a : progetto.entrySet())
            if(a.getValue().getPredecessori().contains(progetto.get(id))){
                successivi.put(a.getKey(), a.getValue());
            }
        if(!successivi.isEmpty()){
            for(Map.Entry<String, Attivita> a : successivi.entrySet())
                setEarly(a.getKey(), a.getValue(), a.getValue().getDurata(), durataTot + durataSpec);
        }
    }
    
    /**
     * Metodo ricorsivo che imposta LS e LF di tutte le attività.
     * @param attivita attivita l'attività stessa su cui si opera.
     * @param durataSpec La durata dell'attività in questione.
     * @param durataTot La durata totale del percorso fino a quel momento svolto.
     */
    private void setLate(Attivita attivita, int durataSpec, int durataTot){
        if(attivita.getLF() == -1 || (durataTotale - durataTot) < attivita.getLF()){
            attivita.setLF(durataTotale - durataTot);
            attivita.setLS(durataTotale - durataTot - durataSpec);
        }
        for(Attivita a : attivita.getPredecessori())
            setLate(a, a.getDurata(), (durataSpec + durataTot));
    }
    
    /**
     * Calcolo di ES, EF, LS, LF e durata totale del progetto nel caso vi sia una sola attività finale.
     */
    private void calcoloSingoloFinale(){
        for(Map.Entry<String, Attivita> attivita : finali.entrySet()){
            durataTotale = sommaTot(attivita.getValue(), attivita.getValue().getDurata(), attivita.getValue().getDurata());
            for(Map.Entry<String, Attivita> a : iniziali.entrySet())
                setEarly(a.getKey(), a.getValue(), a.getValue().getDurata(), 0);
            setLate(attivita.getValue(), attivita.getValue().getDurata(), 0);
        }
    }
    
    /**
     * Calcolo di ES, EF, LS, LF e durata totale del progetto nel caso vi sia più di un attività finale.
     */
    private void calcoloMultiFinale(){
        for(Map.Entry<String, Attivita> attivita : finali.entrySet())
            fittizzia.getPredecessori().add(attivita.getValue());
        durataTotale = sommaTot(fittizzia, fittizzia.getDurata(), fittizzia.getDurata());
        setLate(fittizzia, fittizzia.getDurata(), 0);
        for(Map.Entry<String, Attivita> a : iniziali.entrySet())
            setEarly(a.getKey(), a.getValue(), a.getValue().getDurata(), 0);
    }
    
    /**
     * Metodo che imposta i valori ESDate, EFDate, LSDate e LFDate per ogni attività utilizzando il metodo trovaData.
     */
    private void setProgettoConDate(){
        for(Attivita attivita : progetto.values()){
            attivita.setESDate(trovaData(attivita.getES()));
            attivita.setEFDate(trovaData(attivita.getEF()));
            attivita.setLSDate(trovaData(attivita.getLS()));
            attivita.setLFDate(trovaData(attivita.getLF()));
        }
        if(inizioFine == -1)
            for(Attivita attivita : progetto.values()){
                GregorianCalendar a = attivita.getESDate();
                attivita.setESDate(attivita.getEFDate());
                attivita.setEFDate(a);
                GregorianCalendar b = attivita.getLSDate();
                attivita.setLSDate(attivita.getLFDate());
                attivita.setLFDate(b);
            }
        
    }
    
    /**
     * Metodo che trova la data corrispondente nel progetto del valore inserito, escludendo i giorni feriali e festivi impostati.
     * @param durata Il valore assoluto nel sistema di cui si vuole calcoare l'attività.
     * @return La data trovata.
     */
    private GregorianCalendar trovaData(int durata){
        GregorianCalendar dataAttuale = new GregorianCalendar(dataInput.get(GregorianCalendar.YEAR), dataInput.get(GregorianCalendar.MONTH), dataInput.get(GregorianCalendar.DAY_OF_MONTH));
        for(int i = 0; i < durata; i++){
            boolean isFeriale = false;
            for(GregorianCalendar d : giorniFeriali)
                if(!isFeriale && d.equals(dataAttuale))
                    isFeriale = true;
            while(giorniRiposo.contains(dataAttuale.get(GregorianCalendar.DAY_OF_WEEK)) || isFeriale){
                System.out.println("INKIKA");
                dataAttuale.add(GregorianCalendar.DAY_OF_MONTH, inizioFine);
                isFeriale = false;
                for(GregorianCalendar d : giorniFeriali)
                    if(!isFeriale && d.equals(dataAttuale))
                        isFeriale = true;
            }
            dataAttuale.add(GregorianCalendar.DAY_OF_MONTH, inizioFine);
        }
        boolean isFeriale = false;
        for(GregorianCalendar d : giorniFeriali)
            if(!isFeriale && d.equals(dataAttuale))
                isFeriale = true;
        while(giorniRiposo.contains(dataAttuale.get(GregorianCalendar.DAY_OF_WEEK)) || isFeriale){
            dataAttuale.add(GregorianCalendar.DAY_OF_MONTH, inizioFine);
            isFeriale = false;
            for(GregorianCalendar d : giorniFeriali)
                if(!isFeriale && d.equals(dataAttuale))
                    isFeriale = true;
        }
        return dataAttuale;
    }
    
    /**
     * Metodo che valuta se le attività del progetto siano critica o meno.
     */
    private void setCritica(){
        for(Attivita attivita : progetto.values())
            if(attivita.getES() == attivita.getLS())
                attivita.setCritica(true);
        
    }

    public int getDurataTotale() {return durataTotale;}
    public HashMap<String, Attivita> getProgetto() {return progetto;}
    public GregorianCalendar getDataInput() {return dataInput;}
    public GregorianCalendar getDataOutput() {return dataOutput;}
    public ArrayList<Integer> getGiorniRiposo() {return giorniRiposo;}
    public ArrayList<GregorianCalendar> getGiorniFeriali() {return giorniFeriali;}

    public void setDurataTotale(int durataTotale) {this.durataTotale = durataTotale;}
    public void setProgetto(HashMap<String, Attivita> progetto) {this.progetto = progetto;}
    public void setDataInput(GregorianCalendar dataInput) {this.dataInput = dataInput;}
    public void setDataOutput(GregorianCalendar dataOutput) {this.dataOutput = dataOutput;}
    public void setInizioFine(int inizioFine) {this.inizioFine = inizioFine;}
    public void setGiorniRiposo(ArrayList<Integer> giorniRiposo) {this.giorniRiposo = giorniRiposo;}
    public void setGiorniFeriali(ArrayList<GregorianCalendar> giorniFeriali) {this.giorniFeriali = giorniFeriali;}
    
}
