package gestioneprogetto.exceptions;

import javax.swing.JOptionPane;

public class NumericInputException extends Exception {
    
    private String error;

    public NumericInputException(String error) {
        this.error = error;
    }
    
    public void showError(){
        JOptionPane.showMessageDialog(null, error);
    }
    
    public static boolean isNumeric(String str){  
        try{  
            int n = Integer.parseInt(str);  
        }catch(NumberFormatException ex){  
            return false;
        }
        return true;  
    }
}
