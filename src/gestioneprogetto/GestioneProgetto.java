package gestioneprogetto;

import gestioneprogetto.classes.Attivita;
import gestioneprogetto.classes.Calcolatore;
import gestioneprogetto.exceptions.EmptyIdException;
import gestioneprogetto.exceptions.NumericInputException;
import gestioneprogetto.exceptions.ProgettoException;
import java.awt.Color;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Classe principale contente tutta la parte grafica del progetto ed i relativi controlli sugli input.
 * @author Claudio Metelli
 */
public class GestioneProgetto extends javax.swing.JFrame {
    
    /**
     * Calcolatore che presi in input i dati forniti dalla questa classe ritorna i risultati calcolati in output.
     */
    private Calcolatore calcolatore;
    
    /**
     * Costruttore della classe che inizializza la parte grafica, inserisce gli anni nelle combo box adatte ed inizializza il calcolatore.
     */
    public GestioneProgetto() {
        initComponents();
        setComboBoxes();
        calcolatore = new Calcolatore();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startFinishBttGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        attivitaTable = new javax.swing.JTable();
        formPanel = new javax.swing.JPanel();
        idTxtField = new javax.swing.JTextField();
        descrizioneTxtField = new javax.swing.JTextField();
        durataSpinner = new javax.swing.JSpinner();
        inputBtt = new javax.swing.JButton();
        DurataLbl = new javax.swing.JLabel();
        predecessoriCheckBox = new javax.swing.JCheckBox();
        EmptyIdLbl = new javax.swing.JLabel();
        formPanelSeparator = new javax.swing.JSeparator();
        eliminaAttivitaCmbBox = new javax.swing.JComboBox<>();
        eliminaAttivitaBtt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        superPanel = new javax.swing.JPanel();
        giornidiRiposoPanel = new javax.swing.JPanel();
        giorniDiRiposoLbl = new javax.swing.JLabel();
        lunCheckBox = new javax.swing.JCheckBox();
        domCheckBox = new javax.swing.JCheckBox();
        sabCheckBox = new javax.swing.JCheckBox();
        venCheckBox = new javax.swing.JCheckBox();
        gioCheckBox = new javax.swing.JCheckBox();
        merCheckBox = new javax.swing.JCheckBox();
        marCheckBox = new javax.swing.JCheckBox();
        giorniFerialiPanel = new javax.swing.JPanel();
        inserisciDataLbl = new javax.swing.JLabel();
        annoCmbBox = new javax.swing.JComboBox<>();
        meseCmbBox = new javax.swing.JComboBox<>();
        giornoCmbBox = new javax.swing.JComboBox<>();
        annoLbl = new javax.swing.JLabel();
        meseLbl = new javax.swing.JLabel();
        giornoLbl = new javax.swing.JLabel();
        inserisciDataFerialeBtt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        giorniFerialiTxtArea = new javax.swing.JTextArea();
        eliminaGiorniFerialiPanel = new javax.swing.JPanel();
        eliminaGiornoCmbBox = new javax.swing.JComboBox<>();
        eliminaGiorniLbl = new javax.swing.JLabel();
        eliminaGiornoBtt = new javax.swing.JButton();
        inizioProgettoPanel = new javax.swing.JPanel();
        dataInizioRdBtt = new javax.swing.JRadioButton();
        dataFineRdBtt = new javax.swing.JRadioButton();
        annoInizioCmbBox = new javax.swing.JComboBox<>();
        inizioCalcoloBtt = new javax.swing.JButton();
        meseInizioCmbBox = new javax.swing.JComboBox<>();
        annoInizioLbl = new javax.swing.JLabel();
        giornoInizioCmbBox = new javax.swing.JComboBox<>();
        meseInizioLbl = new javax.swing.JLabel();
        giornoInizioLbl = new javax.swing.JLabel();
        risultatiPanel = new javax.swing.JPanel();
        durataProgettoLbl = new javax.swing.JLabel();
        dataInizioLbl = new javax.swing.JLabel();
        dataFineLbl = new javax.swing.JLabel();
        risultatiLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Progetto");
        setResizable(false);

        attivitaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Breve Descrizione", "Durata", "Precedecessori", "Early Start", "Early Finish", "Late Start", "Late Finish", "Critica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attivitaTable);

        formPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        formPanel.setEnabled(false);
        formPanel.setName(""); // NOI18N

        idTxtField.setForeground(new java.awt.Color(102, 102, 102));
        idTxtField.setText("Inserisci l'id");
        idTxtField.setToolTipText("");
        idTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTxtFieldFocusLost(evt);
            }
        });

        descrizioneTxtField.setForeground(new java.awt.Color(102, 102, 102));
        descrizioneTxtField.setText("Inserisci una descrizione");
        descrizioneTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descrizioneTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descrizioneTxtFieldFocusLost(evt);
            }
        });

        durataSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        durataSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(durataSpinner, ""));

        inputBtt.setText("Inserisci in tabella");
        inputBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBttActionPerformed(evt);
            }
        });

        DurataLbl.setText("Durata dell'attività");

        predecessoriCheckBox.setText("L'attività ha predecessori?");

        eliminaAttivitaBtt.setText("Elimina attività");
        eliminaAttivitaBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaAttivitaBttActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Inserisci un'attività");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Elimina un'attività");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formPanelSeparator)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(predecessoriCheckBox)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addComponent(durataSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DurataLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(descrizioneTxtField)
                                    .addComponent(idTxtField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmptyIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(eliminaAttivitaBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(eliminaAttivitaCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputBtt))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmptyIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descrizioneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durataSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurataLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(predecessoriCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputBtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addComponent(formPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminaAttivitaCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(eliminaAttivitaBtt)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        superPanel.setBackground(new java.awt.Color(41, 41, 45));

        giorniDiRiposoLbl.setText("Giorni di Riposo");

        lunCheckBox.setText("Lunedì");

        domCheckBox.setSelected(true);
        domCheckBox.setText("Domenica");

        sabCheckBox.setSelected(true);
        sabCheckBox.setText("Sabato");

        venCheckBox.setText("Venerdì");

        gioCheckBox.setText("Giovedì");

        merCheckBox.setText("Mercoledì");

        marCheckBox.setText("Martedì");

        javax.swing.GroupLayout giornidiRiposoPanelLayout = new javax.swing.GroupLayout(giornidiRiposoPanel);
        giornidiRiposoPanel.setLayout(giornidiRiposoPanelLayout);
        giornidiRiposoPanelLayout.setHorizontalGroup(
            giornidiRiposoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giornidiRiposoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(giornidiRiposoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(giorniDiRiposoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(giornidiRiposoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lunCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(marCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(merCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gioCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(venCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sabCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(domCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        giornidiRiposoPanelLayout.setVerticalGroup(
            giornidiRiposoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giornidiRiposoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(giorniDiRiposoLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lunCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(merCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gioCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(venCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sabCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(domCheckBox)
                .addContainerGap())
        );

        inserisciDataLbl.setText("Inserisci qui i giorni feriali o di chiusura");

        meseCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE" }));
        meseCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meseCmbBoxActionPerformed(evt);
            }
        });

        giornoCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        annoLbl.setText("Anno");

        meseLbl.setText("Mese");

        giornoLbl.setText("Giorno");

        inserisciDataFerialeBtt.setText("Inserisci");
        inserisciDataFerialeBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciDataFerialeBttActionPerformed(evt);
            }
        });

        giorniFerialiTxtArea.setEditable(false);
        giorniFerialiTxtArea.setColumns(20);
        giorniFerialiTxtArea.setRows(5);
        giorniFerialiTxtArea.setText("I giorni feriali da te inseriti al momento sono:");
        jScrollPane2.setViewportView(giorniFerialiTxtArea);

        eliminaGiorniLbl.setText("Elimina i giorni feriali qui");

        eliminaGiornoBtt.setText("Elimina");
        eliminaGiornoBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaGiornoBttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eliminaGiorniFerialiPanelLayout = new javax.swing.GroupLayout(eliminaGiorniFerialiPanel);
        eliminaGiorniFerialiPanel.setLayout(eliminaGiorniFerialiPanelLayout);
        eliminaGiorniFerialiPanelLayout.setHorizontalGroup(
            eliminaGiorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminaGiorniFerialiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eliminaGiorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminaGiornoCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminaGiorniLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminaGiorniFerialiPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eliminaGiornoBtt)))
                .addContainerGap())
        );
        eliminaGiorniFerialiPanelLayout.setVerticalGroup(
            eliminaGiorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminaGiorniFerialiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminaGiorniLbl)
                .addGap(20, 20, 20)
                .addComponent(eliminaGiornoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminaGiornoBtt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout giorniFerialiPanelLayout = new javax.swing.GroupLayout(giorniFerialiPanel);
        giorniFerialiPanel.setLayout(giorniFerialiPanelLayout);
        giorniFerialiPanelLayout.setHorizontalGroup(
            giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserisciDataLbl)
                    .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inserisciDataFerialeBtt)
                        .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                            .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                                    .addComponent(giornoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(meseCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                                    .addComponent(giornoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(meseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6)
                            .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(annoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(annoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminaGiorniFerialiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        giorniFerialiPanelLayout.setVerticalGroup(
            giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(giorniFerialiPanelLayout.createSequentialGroup()
                        .addComponent(inserisciDataLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giornoLbl)
                            .addComponent(meseLbl)
                            .addComponent(annoLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(giorniFerialiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giornoCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meseCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(inserisciDataFerialeBtt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(eliminaGiorniFerialiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        startFinishBttGroup.add(dataInizioRdBtt);
        dataInizioRdBtt.setSelected(true);
        dataInizioRdBtt.setText("Data di Inizio Progetto");

        startFinishBttGroup.add(dataFineRdBtt);
        dataFineRdBtt.setText("Data di Fine Progetto");

        inizioCalcoloBtt.setText("Inizia");
        inizioCalcoloBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inizioCalcoloBttActionPerformed(evt);
            }
        });

        meseInizioCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE" }));
        meseInizioCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meseInizioCmbBoxActionPerformed(evt);
            }
        });

        annoInizioLbl.setText("Anno");

        giornoInizioCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        meseInizioLbl.setText("Mese");

        giornoInizioLbl.setText("Giorno");

        javax.swing.GroupLayout inizioProgettoPanelLayout = new javax.swing.GroupLayout(inizioProgettoPanel);
        inizioProgettoPanel.setLayout(inizioProgettoPanelLayout);
        inizioProgettoPanelLayout.setHorizontalGroup(
            inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inizioProgettoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inizioCalcoloBtt))
                    .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                        .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataFineRdBtt)
                            .addComponent(dataInizioRdBtt)
                            .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                                .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                                        .addComponent(giornoInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meseInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                                        .addComponent(giornoInizioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(meseInizioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annoInizioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(annoInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inizioProgettoPanelLayout.setVerticalGroup(
            inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inizioProgettoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giornoInizioLbl)
                    .addComponent(meseInizioLbl)
                    .addComponent(annoInizioLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inizioProgettoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giornoInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meseInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annoInizioCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dataInizioRdBtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataFineRdBtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inizioCalcoloBtt)
                .addContainerGap())
        );

        risultatiPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        durataProgettoLbl.setText("Il progetto avrà una durata totale di : ");

        dataInizioLbl.setText("La data di inizio del progetto è:");

        dataFineLbl.setText("La data di fine del progetto è:");

        risultatiLbl.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        risultatiLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        risultatiLbl.setText("RISULTATI");

        javax.swing.GroupLayout risultatiPanelLayout = new javax.swing.GroupLayout(risultatiPanel);
        risultatiPanel.setLayout(risultatiPanelLayout);
        risultatiPanelLayout.setHorizontalGroup(
            risultatiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(risultatiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(risultatiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(risultatiPanelLayout.createSequentialGroup()
                        .addGroup(risultatiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(durataProgettoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataInizioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataFineLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(risultatiLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
        risultatiPanelLayout.setVerticalGroup(
            risultatiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(risultatiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(risultatiLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(durataProgettoLbl)
                .addGap(18, 18, 18)
                .addComponent(dataInizioLbl)
                .addGap(18, 18, 18)
                .addComponent(dataFineLbl)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout superPanelLayout = new javax.swing.GroupLayout(superPanel);
        superPanel.setLayout(superPanelLayout);
        superPanelLayout.setHorizontalGroup(
            superPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(giornidiRiposoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giorniFerialiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inizioProgettoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(risultatiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        superPanelLayout.setVerticalGroup(
            superPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(superPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(giornidiRiposoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(giorniFerialiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inizioProgettoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(risultatiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(superPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * SetTextField sulla JTextField della descrizione.
     * @param evt L'evento quando is perde il focus.
     */
    private void descrizioneTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descrizioneTxtFieldFocusLost
        SetTextField("Inserisci una descrizione", descrizioneTxtField);
    }//GEN-LAST:event_descrizioneTxtFieldFocusLost
    
    /**
     * UnsetTextField sulla JTextField della descrizione.
     * @param evt L'evento quando is fa il focus.
     */
    private void descrizioneTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descrizioneTxtFieldFocusGained
        UnsetTextField("Inserisci una descrizione", descrizioneTxtField);
    }//GEN-LAST:event_descrizioneTxtFieldFocusGained
    
    /**
     * SetTextField sulla JTextField dell'id.
     * @param evt L'evento quando is perde il focus.
     */
    private void idTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTxtFieldFocusLost
        SetTextField("Inserisci l'id", idTxtField);
    }//GEN-LAST:event_idTxtFieldFocusLost
    
    /**
     * UnsetTextField sulla JTextField dell'id.
     * @param evt L'evento quando is fa il focus.
     */
    private void idTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTxtFieldFocusGained
        UnsetTextField("Inserisci l'id", idTxtField);
    }//GEN-LAST:event_idTxtFieldFocusGained
    
    /**
     * Chiama il metodo insertTable per inserire i dati in tabella.
     * @param evt L'evento generato con il click del pulsante.
     */
    private void inputBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBttActionPerformed
        try {
            insertIntoTable();
        } catch (EmptyIdException ex) {
            ex.showError();
        } catch (NumericInputException ex) {
            ex.showError();
        }
    }//GEN-LAST:event_inputBttActionPerformed
    
    /**
     * Metodo usato per aggiornare il numero di giorni selezionabili nella comboBox dei giorni in base al mese scelto.
     * @param evt L'evento generato quando si seleziona un mese nella combo box.
     */
    private void meseCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meseCmbBoxActionPerformed
        giornoCmbBox.removeAllItems();
        for(int i = 1; i <= 28; i++)
           giornoCmbBox.addItem(Integer.toString(i));
        if(meseCmbBox.getSelectedItem().equals("GENNAIO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("MARZO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("APRILE")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
        }
        else if(meseCmbBox.getSelectedItem().equals("MAGGIO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("GIUGNO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
        }
        else if(meseCmbBox.getSelectedItem().equals("LUGLIO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("AGOSTO")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("SETTEMBRE")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
        }
        else if(meseCmbBox.getSelectedItem().equals("OTTOBRE")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
        else if(meseCmbBox.getSelectedItem().equals("NOVEMBRE")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
        }
        else if(meseCmbBox.getSelectedItem().equals("DICEMBRE")){
            giornoCmbBox.addItem("29");
            giornoCmbBox.addItem("30");
            giornoCmbBox.addItem("31");
        }
    }//GEN-LAST:event_meseCmbBoxActionPerformed

    /**
     * Metodo usato per aggiornare il numero di giorni selezionabili nella comboBox dei giorni di inzio progetto in base al mese scelto.
     * @param evt L'evento generato quando si seleziona un mese nella combo box.
     */
    private void meseInizioCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meseInizioCmbBoxActionPerformed
        giornoInizioCmbBox.removeAllItems();
        for(int i = 1; i <= 28; i++)
           giornoInizioCmbBox.addItem(Integer.toString(i));
        if(meseInizioCmbBox.getSelectedItem().equals("GENNAIO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("MARZO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("APRILE")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("MAGGIO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("GIUGNO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("LUGLIO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("AGOSTO")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("SETTEMBRE")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("OTTOBRE")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("NOVEMBRE")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
        }
        else if(meseInizioCmbBox.getSelectedItem().equals("DICEMBRE")){
            giornoInizioCmbBox.addItem("29");
            giornoInizioCmbBox.addItem("30");
            giornoInizioCmbBox.addItem("31");
        }
    }//GEN-LAST:event_meseInizioCmbBoxActionPerformed
    
    /**
     * Metodo usato per inserire la data di un giorno feriale nella lista dei giorni feriali.
     * @param evt L'evento generato quando si clicca sul bottone.
     */
    private void inserisciDataFerialeBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciDataFerialeBttActionPerformed
        int mese = 0;
        if(meseCmbBox.getSelectedItem().equals("GENNAIO"))
             mese = GregorianCalendar.JANUARY;
        else if(meseCmbBox.getSelectedItem().equals("FEBBRAIO"))
            mese = GregorianCalendar.FEBRUARY;
        else if(meseCmbBox.getSelectedItem().equals("MARZO"))
            mese = GregorianCalendar.MARCH;
        else if(meseCmbBox.getSelectedItem().equals("APRILE"))
            mese = GregorianCalendar.APRIL;
        else if(meseCmbBox.getSelectedItem().equals("MAGGIO"))
            mese = GregorianCalendar.MAY;
        else if(meseCmbBox.getSelectedItem().equals("GIUGNO"))
            mese = GregorianCalendar.JUNE;
        else if(meseCmbBox.getSelectedItem().equals("LUGLIO"))
            mese = GregorianCalendar.JULY;
        else if(meseCmbBox.getSelectedItem().equals("AGOSTO"))
            mese = GregorianCalendar.AUGUST;
        else if(meseCmbBox.getSelectedItem().equals("SETTEMBRE"))
            mese = GregorianCalendar.SEPTEMBER;
        else if(meseCmbBox.getSelectedItem().equals("OTTOBRE"))
            mese = GregorianCalendar.OCTOBER;
        else if(meseCmbBox.getSelectedItem().equals("NOVEMBRE"))
            mese = GregorianCalendar.NOVEMBER;
        else if(meseCmbBox.getSelectedItem().equals("DICEMBRE"))
            mese = GregorianCalendar.DECEMBER;
        GregorianCalendar a = new GregorianCalendar(Integer.parseInt(annoCmbBox.getSelectedItem().toString()), mese, Integer.parseInt(giornoCmbBox.getSelectedItem().toString()));
        boolean x = false;
        for(GregorianCalendar date : calcolatore.getGiorniFeriali())
            if(date.equals(a) && !x){
                JOptionPane.showMessageDialog(null, "Una data come questa è già stata inserita");
                x = true;
        }
        if(!x){
            calcolatore.getGiorniFeriali().add(a);
            eliminaGiornoCmbBox.addItem(a.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (a.get(GregorianCalendar.MONTH) + 1) + "/" + a.get(GregorianCalendar.YEAR));
            giorniFerialiTxtArea.setText(giorniFerialiTxtArea.getText() + "\n-" + giornoCmbBox.getSelectedItem() + "/" + (mese + 1) + "/" + annoCmbBox.getSelectedItem());
        }
    }//GEN-LAST:event_inserisciDataFerialeBttActionPerformed

    /**
     * Metodo utilizzato per eliminare un giorno dalla lista dei giorni feriali.
     * @param evt L'evento generato quando si clicca sul bottone.
     */
    private void eliminaGiornoBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaGiornoBttActionPerformed
        String s = eliminaGiornoCmbBox.getSelectedItem().toString();
        String[] str = s.split("/");
        GregorianCalendar a = new GregorianCalendar(Integer.parseInt(str[2]), Integer.parseInt(str[1]) - 1, Integer.parseInt(str[0]));
        boolean eli = false;
        for(GregorianCalendar date : calcolatore.getGiorniFeriali())
            if(date.equals(a) && !eli){
                String string = giorniFerialiTxtArea.getText().replace("\n-" + s, "");
                giorniFerialiTxtArea.setText(string);
                eliminaGiornoCmbBox.removeItem(s);
                JOptionPane.showMessageDialog(null, "ELIMINATO");
            }
        calcolatore.getGiorniFeriali().remove(a);
    }//GEN-LAST:event_eliminaGiornoBttActionPerformed

    /**
     * Metodo che elimina l'attività seleionata nella combo box.
     * @param evt L'evento generato quando si clicca sul bottone.
     */
    private void eliminaAttivitaBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaAttivitaBttActionPerformed
        if(eliminaAttivitaCmbBox.getSelectedItem() == null)
            JOptionPane.showMessageDialog(null, "Non ci sono attività da eliminare");
        else{
            for(int i = 0; i < attivitaTable.getRowCount(); i++)
                if(attivitaTable.getModel().getValueAt(i, 0) != null)
                    if(attivitaTable.getModel().getValueAt(i, 0).equals(eliminaAttivitaCmbBox.getSelectedItem())){
                       attivitaTable.getModel().setValueAt(null, i, 0);
                       attivitaTable.getModel().setValueAt(null, i, 1);
                       attivitaTable.getModel().setValueAt(null, i, 2);
                       attivitaTable.getModel().setValueAt(null, i, 3);
                       attivitaTable.getModel().setValueAt(null, i, 4);
                       attivitaTable.getModel().setValueAt(null, i, 5);
                       attivitaTable.getModel().setValueAt(null, i, 6);
                       attivitaTable.getModel().setValueAt(null, i, 7);
                       attivitaTable.getModel().setValueAt(null, i, 8);
                    }
            calcolatore.getProgetto().remove(eliminaAttivitaCmbBox.getSelectedItem().toString());
            eliminaAttivitaCmbBox.removeItem(eliminaAttivitaCmbBox.getSelectedItem());
        }
    }//GEN-LAST:event_eliminaAttivitaBttActionPerformed

    /**
     * La funzione che fa partire il calcolo utilizzando la classe calcolatore con il meodo start.
     * @param evt l'evento generato al click del bottone.
     */
    private void inizioCalcoloBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inizioCalcoloBttActionPerformed
        raccogliDati();
        try {
            calcolatore.start();
            aggiornaTabella();
            aggiornaRisultati();
        } catch (ProgettoException ex) {
            ex.showError();
        }
    }//GEN-LAST:event_inizioCalcoloBttActionPerformed
    /**
     * Inserisce i dati presi in input dal form di inserimento in tabella e nella hashmap del progetto.
     * @throws EmptyIdException Eccezione chiamata quando vi è un errore riguardante l'inserimento del testo nella casella di ID o di descrizione.
     * @throws NumericInputException Eccezione chiamata quando ell'inserimento dei predecessori non viene inserito un valido numero.
     */
    private void insertIntoTable() throws EmptyIdException, NumericInputException{
        boolean annullato = false;
        if(calcolatore.getProgetto().size() > 19)
            throw new EmptyIdException(EmptyIdLbl, "Numero massimo di attività raggiunto");
        if(idTxtField.getText().length() > 10)
            throw new EmptyIdException(EmptyIdLbl, "L'id Deve avere al massimo 10 caratteri");
        if(idTxtField.getText().equals("Inserisci l'id") && idTxtField.getForeground().equals(new Color(102, 102, 102)))
            throw new EmptyIdException(EmptyIdLbl, "Inserisci un ID");
        else if(calcolatore.getProgetto().containsKey(idTxtField.getText()))
            throw new EmptyIdException(EmptyIdLbl, "Esiste già un attività con questo ID");
        String descrizione;
        if(descrizioneTxtField.getText().equals("Inserisci una descrizione") && descrizioneTxtField.getForeground().equals(new Color(102, 102, 102)))
            descrizione = "";
        else
            descrizione = descrizioneTxtField.getText();
        if(descrizione.length() > 20)
            throw new EmptyIdException(EmptyIdLbl, "La descrizione deve avere al massimo 10 caratteri");
        int durata = (int) durataSpinner.getValue();
        ArrayList<String> predecessoriId = new ArrayList<String>();
        
        if(predecessoriCheckBox.isSelected()){
            String n = JOptionPane.showInputDialog(null, "Inserisci il numero di precedenze dell'attività che vuoi inserire" , "Pannello di input", JOptionPane.QUESTION_MESSAGE);
            if(n == null){
                annullato = true;
                JOptionPane.showMessageDialog(null, "L'inserimento è stato annullato");
            }
            if(!annullato){
                if(!NumericInputException.isNumeric(n))
                    throw new NumericInputException("Inserire un valore numerico intero");
                int nPredecessori = Integer.parseInt(n);
                if(nPredecessori <= 0)
                    throw new NumericInputException("Inserire un valore numerico positivo intero");
                for(int i = 0; i < nPredecessori; i++){
                    String p = JOptionPane.showInputDialog(null, "Inserisci il predecessore" , "Pannello di input", JOptionPane.QUESTION_MESSAGE);
                    boolean annullatissimo = false;
                    if(p == null){
                        i = nPredecessori;
                        annullato = true;
                        annullatissimo = true;
                        JOptionPane.showMessageDialog(null, "L'inserimento è stato annullato");
                    }
                    if(!annullatissimo){
                        if(predecessoriId.contains(p))
                            throw new NumericInputException("Questo predecessore è già stato inserito");
                        if(!calcolatore.getProgetto().containsKey(p))
                            throw new NumericInputException("L'attività inserita non esiste oppure non è ancora stata inserita");
                        predecessoriId.add(p);
                    }
                }
            }
        }
        if(!annullato){
            ArrayList<Attivita> predecessori = new ArrayList<Attivita>();
            for(String s : predecessoriId)
                predecessori.add(calcolatore.getProgetto().get(s));
            calcolatore.getProgetto().put(idTxtField.getText(), new Attivita(durata, descrizione, predecessori));
            int i = 0;
            while(attivitaTable.getModel().getValueAt(i, 0) != null){
                i++;
            }
            eliminaAttivitaCmbBox.addItem(idTxtField.getText());
            attivitaTable.getModel().setValueAt(idTxtField.getText(), i, 0);
            JButton btt = new JButton("Visualizza la descrizione");
            attivitaTable.getModel().setValueAt(btt, i, 1);
            attivitaTable.getModel().setValueAt(durata, i, 2);
            String str = "";
            for(String s : predecessoriId)
                str += s + ",";
            if(!str.equals(""))
                str = str.substring(0, str.length() - 1);
            attivitaTable.getModel().setValueAt(str, i, 3);
        }
    }
    
    /**
     * Inizializza le combo box contenti gli anni inserendo gli anni dal 2000 al 2050.
     */
    private void setComboBoxes(){
        for(int i = 2000; i < 2051; i++){
            annoCmbBox.addItem(Integer.toString(i));
            annoInizioCmbBox.addItem(Integer.toString(i));
        }
    }
    
    /**
     * Metodo che raccoglie vari dati come ad esempio i giorni di riposo o se il progetto viene calcolato partendo dall'inizio oppure dalla fine impostandoli nel calcolatore.
     */
    private void raccogliDati(){
        if(dataInizioRdBtt.isSelected())
            calcolatore.setInizioFine(1);
        else
            calcolatore.setInizioFine(-1);
        
        if(meseInizioCmbBox.getSelectedItem().equals("GENNAIO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.JANUARY, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("FEBBRAIO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.FEBRUARY, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("MARZO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.MARCH, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("APRILE"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.APRIL, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("MAGGIO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.MAY, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("GIUGNO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.JUNE, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("LUGLIO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.JULY, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("AGOSTO"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.AUGUST, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("SETTEMBRE"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.SEPTEMBER, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("OTTOBRE"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.OCTOBER, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("NOVEMBRE"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.NOVEMBER, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        else if(meseInizioCmbBox.getSelectedItem().equals("DICEMBRE"))
            calcolatore.setDataInput(new GregorianCalendar(Integer.parseInt(annoInizioCmbBox.getSelectedItem().toString()), GregorianCalendar.DECEMBER, Integer.parseInt(giornoInizioCmbBox.getSelectedItem().toString())));
        
        calcolatore.getGiorniRiposo().clear();
        if(lunCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.MONDAY);
        if(marCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.TUESDAY);
        if(merCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.WEDNESDAY);
        if(gioCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.THURSDAY);
        if(venCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.FRIDAY);
        if(sabCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.SATURDAY);
        if(domCheckBox.isSelected())
            calcolatore.getGiorniRiposo().add(GregorianCalendar.SUNDAY);
    }
    
    /**
     * Metodo che aggiorna la tabella aggiungendo ES, EF, LS, LF e criticità a seguito del calcolo.
     */
    private void aggiornaTabella(){
        for(int i = 0; i < attivitaTable.getRowCount(); i++)
            if(attivitaTable.getModel().getValueAt(i, 0) != null){
                int giorno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getESDate().get(GregorianCalendar.DAY_OF_MONTH);
                int mese = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getESDate().get(GregorianCalendar.MONTH);
                int anno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getESDate().get(GregorianCalendar.YEAR);
                String s = giorno + "/" + (mese + 1) + "/" + anno;
                attivitaTable.getModel().setValueAt(s, i, 4);
                giorno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getEFDate().get(GregorianCalendar.DAY_OF_MONTH);
                mese = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getEFDate().get(GregorianCalendar.MONTH);
                anno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getEFDate().get(GregorianCalendar.YEAR);
                s = giorno + "/" + (mese + 1) + "/" + anno;
                attivitaTable.getModel().setValueAt(s, i, 5);
                giorno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLSDate().get(GregorianCalendar.DAY_OF_MONTH);
                mese = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLSDate().get(GregorianCalendar.MONTH);
                anno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLSDate().get(GregorianCalendar.YEAR);
                s = giorno + "/" + (mese + 1) + "/" + anno;
                attivitaTable.getModel().setValueAt(s, i, 6);
                giorno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLFDate().get(GregorianCalendar.DAY_OF_MONTH);
                mese = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLFDate().get(GregorianCalendar.MONTH);
                anno = calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).getLFDate().get(GregorianCalendar.YEAR);
                s = giorno + "/" + (mese + 1) + "/" + anno;
                attivitaTable.getModel().setValueAt(s, i, 7);
                if(calcolatore.getProgetto().get(attivitaTable.getModel().getValueAt(i, 0)).isCritica())
                    attivitaTable.getModel().setValueAt("SI", i, 8);
                else
                    attivitaTable.getModel().setValueAt("NO", i, 8);
            }
        
    }
    
    /**
     * Metodo che mostra i risultati ottenuti nelle label.
     */
    private void aggiornaRisultati(){
        durataProgettoLbl.setText("Il progetto avrà una durata totale di: " + calcolatore.getDurataTotale());
        if(dataInizioRdBtt.isSelected()){
            dataInizioLbl.setText("La data di inizio del progetto è: " + calcolatore.getDataInput().get(GregorianCalendar.DAY_OF_MONTH) + "/" + (calcolatore.getDataInput().get(GregorianCalendar.MONTH) + 1) + "/" + calcolatore.getDataInput().get(GregorianCalendar.YEAR));
            dataFineLbl.setText("La data di inizio del progetto è: " + calcolatore.getDataOutput().get(GregorianCalendar.DAY_OF_MONTH) + "/" + (calcolatore.getDataOutput().get(GregorianCalendar.MONTH) + 1) + "/" + calcolatore.getDataOutput().get(GregorianCalendar.YEAR));
        }
        else{
            dataInizioLbl.setText("La data di inizio del progetto è: " + calcolatore.getDataOutput().get(GregorianCalendar.DAY_OF_MONTH) + "/" + (calcolatore.getDataOutput().get(GregorianCalendar.MONTH) + 1) + "/" + calcolatore.getDataOutput().get(GregorianCalendar.YEAR));
            dataFineLbl.setText("La data di fine del progetto è: " + calcolatore.getDataInput().get(GregorianCalendar.DAY_OF_MONTH) + "/" + (calcolatore.getDataInput().get(GregorianCalendar.MONTH) + 1) + "/" + calcolatore.getDataInput().get(GregorianCalendar.YEAR));
        }
    }
    
    /**
     * Metodo utilizzato per il placeholder quando si scrive nella JTextField.
     * @param s La stringa già presente come placeholer.
     * @param txtField La JTextField assegnata.
     */
    private void UnsetTextField(String s, JTextField txtField){
        if(txtField.getText().equals(s) && txtField.getForeground().equals(new Color(102, 102, 102))) {
            txtField.setText("");
            txtField.setForeground(Color.BLACK);
        }
    }
    
    /**
     * Metodo utilizzato per il placeholder quando deve essere impostato.
     * @param s La stringa da inserire come placeholer.
     * @param txtField La JTextField assegnata.
     */
    private void SetTextField(String s, JTextField txtField){
        if(txtField.getText().isEmpty()) {
            txtField.setForeground(new Color(102, 102, 102));
            txtField.setText(s);
        }
    }
    
    /**
     * Classe main che avvia il programma.
     * @param args Eventuali argomenti passati in input da riga di comando(non utiizzato).
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestioneProgetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioneProgetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioneProgetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioneProgetto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioneProgetto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DurataLbl;
    private javax.swing.JLabel EmptyIdLbl;
    private javax.swing.JComboBox<String> annoCmbBox;
    private javax.swing.JComboBox<String> annoInizioCmbBox;
    private javax.swing.JLabel annoInizioLbl;
    private javax.swing.JLabel annoLbl;
    private javax.swing.JTable attivitaTable;
    private javax.swing.JLabel dataFineLbl;
    private javax.swing.JRadioButton dataFineRdBtt;
    private javax.swing.JLabel dataInizioLbl;
    private javax.swing.JRadioButton dataInizioRdBtt;
    private javax.swing.JTextField descrizioneTxtField;
    private javax.swing.JCheckBox domCheckBox;
    private javax.swing.JLabel durataProgettoLbl;
    private javax.swing.JSpinner durataSpinner;
    private javax.swing.JButton eliminaAttivitaBtt;
    private javax.swing.JComboBox<String> eliminaAttivitaCmbBox;
    private javax.swing.JPanel eliminaGiorniFerialiPanel;
    private javax.swing.JLabel eliminaGiorniLbl;
    private javax.swing.JButton eliminaGiornoBtt;
    private javax.swing.JComboBox<String> eliminaGiornoCmbBox;
    private javax.swing.JPanel formPanel;
    private javax.swing.JSeparator formPanelSeparator;
    private javax.swing.JCheckBox gioCheckBox;
    private javax.swing.JLabel giorniDiRiposoLbl;
    private javax.swing.JPanel giorniFerialiPanel;
    private javax.swing.JTextArea giorniFerialiTxtArea;
    private javax.swing.JPanel giornidiRiposoPanel;
    private javax.swing.JComboBox<String> giornoCmbBox;
    private javax.swing.JComboBox<String> giornoInizioCmbBox;
    private javax.swing.JLabel giornoInizioLbl;
    private javax.swing.JLabel giornoLbl;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JButton inizioCalcoloBtt;
    private javax.swing.JPanel inizioProgettoPanel;
    private javax.swing.JButton inputBtt;
    private javax.swing.JButton inserisciDataFerialeBtt;
    private javax.swing.JLabel inserisciDataLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox lunCheckBox;
    private javax.swing.JCheckBox marCheckBox;
    private javax.swing.JCheckBox merCheckBox;
    private javax.swing.JComboBox<String> meseCmbBox;
    private javax.swing.JComboBox<String> meseInizioCmbBox;
    private javax.swing.JLabel meseInizioLbl;
    private javax.swing.JLabel meseLbl;
    private javax.swing.JCheckBox predecessoriCheckBox;
    private javax.swing.JLabel risultatiLbl;
    private javax.swing.JPanel risultatiPanel;
    private javax.swing.JCheckBox sabCheckBox;
    private javax.swing.ButtonGroup startFinishBttGroup;
    private javax.swing.JPanel superPanel;
    private javax.swing.JCheckBox venCheckBox;
    // End of variables declaration//GEN-END:variables
}
