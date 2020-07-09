/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shut.down;

/**
 *
 * @author Darsheet Patel
 */
public class ShutDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Shut().setVisible(true);
            }
        });
    }
}
