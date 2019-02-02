package gestioneprogetto.classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Classe Attivita che rappresenta un attività del progetto.
 * Per ogni parametro è inoltre presente un metodo Getter ed uno Setter.
 * @author Claudio Metelli
 */
public class Attivita {
    /**
     * Durata dell'attività.
     */
    private int durata;
    /**
     * Valore intero e dunque assoluto dell'Early Start nel sistema finale.
     */
    private int ES;
    /**
     * Valore intero e dunque assoluto dell'Early Finish nel sistema finale.
     */
    private int EF;
    /**
     * Valore intero e dunque assoluto del Late Start nel sistema finale.
     */
    private int LS;
    /**
     * Valore intero e dunque assoluto del Late Finish nel sistema finale.
     */
    private int LF;
    /**
     * Valore in Data e dunque relativo dell'Early Start nel sistema finale.
     */
    private GregorianCalendar ESDate;
    /**
     * Valore in Data e dunque relativo dell'Early Finish nel sistema finale.
     */
    private GregorianCalendar EFDate;
    /**
     * Valore in Data e dunque relativo del Late Start nel sistema finale.
     */
    private GregorianCalendar LSDate;
    /**
     * Valore in Data e dunque relativo del Late Finish nel sistema finale.
     */
    private GregorianCalendar LFDate;
    /**
     * Variabile Booleana che indica se l'attività è critica o meno.
     */
    private boolean critica;
    /**
     * Lista delle attività che sono i predecessori dell'attività attuale.
     */
    private ArrayList<Attivita> predecessori;
    
    /**
     * Metodo che istanzia una nuova attività con i dati forniti.
     * Quelli non forniti come ad esempio ES, EF, LS, LF e relative date devono ancora essere calcolati e pertanto assumono dei valori di default.
     * @param durata La durata dell'attività.
     * @param nome La descrizione dell'attività.
     * @param predecessori La lista delle attività che sono predecessori di quella che si sta per istanziare.
     */
    public Attivita(int durata, ArrayList<Attivita> predecessori) {
        this.durata = durata;
        this.ES = -1;
        this.EF = -1;
        this.LS = -1;
        this.LF = -1;
        this.ESDate = new GregorianCalendar();
        this.LSDate = new GregorianCalendar();
        this.EFDate = new GregorianCalendar();
        this.LFDate = new GregorianCalendar();
        this.critica = false;
        this.predecessori = predecessori;
    }

    /**
     * Metodo che istanzia una nuova attività con i dati forniti.
     * Quelli non forniti come ad esempio ES, EF, LS, LF e relative date devono ancora essere calcolati e pertanto assumono dei valori di default.
     * Non essendo fornite attività che sono predecessori la lista viene istanziata vuota.
     * @param durata La durata dell'attività.
     * @param nome La descrizione dell'attività.
     */
    public Attivita(int durata, String nome) {
        this.durata = durata;
        this.ES = -1;
        this.EF = -1;
        this.LS = -1;
        this.LF = -1;
        this.ESDate = new GregorianCalendar();
        this.LSDate = new GregorianCalendar();
        this.EFDate = new GregorianCalendar();
        this.LFDate = new GregorianCalendar();
        this.critica = false;
        this.predecessori = new ArrayList<Attivita>();
    }
    
    public int getDurata() {return durata;}
    public int getES() {return ES;}
    public int getEF() {return EF;}
    public int getLS() {return LS;}
    public int getLF() {return LF;}
    public GregorianCalendar getESDate() {return ESDate;}
    public GregorianCalendar getEFDate() {return EFDate;}
    public GregorianCalendar getLSDate() {return LSDate;}
    public GregorianCalendar getLFDate() {return LFDate;}
    public boolean isCritica() {return critica;}
    public ArrayList<Attivita> getPredecessori() {return predecessori;}
    
    public void setDurata(int durata) {this.durata = durata;}
    public void setES(int ES) {this.ES = ES;}
    public void setEF(int EF) {this.EF = EF;}
    public void setLS(int LS) {this.LS = LS;}
    public void setLF(int LF) {this.LF = LF;}
    public void setESDate(GregorianCalendar ESDate) {this.ESDate = ESDate;}
    public void setEFDate(GregorianCalendar EFDate) {this.EFDate = EFDate;}
    public void setLSDate(GregorianCalendar LSDate) {this.LSDate = LSDate;}
    public void setLFDate(GregorianCalendar LFDate) {this.LFDate = LFDate;}
    public void setCritica(boolean critica) {this.critica = critica;}
    public void setPredecessori(ArrayList<Attivita> predecessori) {this.predecessori = predecessori;}
    
}