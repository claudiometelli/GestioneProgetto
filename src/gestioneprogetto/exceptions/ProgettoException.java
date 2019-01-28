package gestioneprogetto.exceptions;

import javax.swing.JOptionPane;

/**
 * Classe utilizzata in caso di errori riguardanti il progetto, e più in partcolare nel caso in cui questo sia vuoto oppure non abbia attività finali.
 * @author Claudio Metelli
 */
public class ProgettoException extends Exception {
    /**
     * Stringa di errore da mostrare a schermo
     */
    String error;

    /**
     * Costruttore che inizializza la stringa di errore.
     * @param error La stringa di errore da mostrare a schermo
     */
    public ProgettoException(String error) {
        this.error = error;
    }
    
    /**
     * Mostra una schermata di dialogo con l'errore
     */
    public void showError(){
        JOptionPane.showMessageDialog(null, error);
    }

    /**
     * Metodo getter che ritorna il parametro error, ovvero la stringa di errore.
     * @return String - La stringa di errore. 
     */
    public String getError() {
        return error;
    }
    
}
