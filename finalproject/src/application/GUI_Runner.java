package finalproject.application;

public class GUI_Runner {    

    /**
     * Launches this GUI application. 
     */    
    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              new GUI_Main();
            }
        }); 
    }
}
