package week7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class WorkerGui extends JFrame implements Runnable {

   private static WorkerGui gui;

   private JTextField filename;

   private JTextArea fileContents;

   private static String string;

   public WorkerGui() {
      initComponents();
      gui = this;
   }

   private void initComponents() {
      JPanel filePanel = new JPanel();
      JLabel file = new JLabel("Enter Filename: ");
      filename = new JTextField(30);
      filename.addKeyListener(new FileNameListener());
      filePanel.add(file);
      filePanel.add(filename);

      fileContents = new JTextArea(string);

      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BorderLayout());

      JScrollPane scroller = new JScrollPane(fileContents);
      scroller
            .setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

      mainPanel.add(filePanel, BorderLayout.NORTH);
      mainPanel.add(scroller, BorderLayout.CENTER);

      getContentPane().add(mainPanel);
   }
   
   public void addContents(String text) {
      fileContents.setText(text);
   }

   class FileNameListener extends KeyAdapter {
      public void keyReleased(KeyEvent key) {
         if (key.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingWorker<String, Void> data = new FileContentReader(filename
                  .getText(), gui);
            data.execute();
            filename.setText("");
         }
      }
   }

   public void run() {
      createAndShowGUI();
   }

   private static void createAndShowGUI() {

      JFrame.setDefaultLookAndFeelDecorated(true);

      // Display the window.
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setPreferredSize(new Dimension(500, 200));
      gui.setLocation(new Point(200, 200));
      gui.pack();
      gui.setVisible(true);
   }

   public static void main(String[] args) {

      // Schedule a job for the event-dispatching thread:
      // creating and showing this application's GUI.
      javax.swing.SwingUtilities.invokeLater(new WorkerGui());
   }
}
