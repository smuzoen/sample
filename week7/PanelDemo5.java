package week7;

import javax.swing.*;

/**
 * Separation of GUI and Controller from Model
 */
public class PanelDemo5 {

   public static void main(String[] args) {

      // create an instance of the model 
      PanelDemoModel model = new PanelDemoModel();

      // register the model with the GUI
      PanelDemoGUI gui = new PanelDemoGUI();

      // set up the controller
      PanelDemoController controller = new PanelDemoController(model, gui);

      // make the GUI visible
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setVisible(true);
   }

}