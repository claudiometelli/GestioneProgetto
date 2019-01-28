package gestioneprogetto.exceptions;

import javax.swing.JLabel;

public class EmptyIdException extends Exception {

    private JLabel lbl;
    private String error;
    
    public EmptyIdException(JLabel lbl, String error) {
        this.lbl = lbl;
        this.error = error;
    }
    
    public void showError(){
        lbl.setText(error);
    }
}
