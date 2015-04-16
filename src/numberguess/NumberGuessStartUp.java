/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;

import javax.swing.UIManager;

/**
 *
 * @author nagnello
 */
public class NumberGuessStartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumberGuessService game = new NumberGuessService();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
        
        }
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run(){
                    new RangeGUI().setVisible(true);
                }
            });
            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    new NumberGuessGUI().setVisible(true);
//                }
//            });
    }
    
}
