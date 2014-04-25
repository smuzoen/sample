package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo extends JFrame implements ActionListener {

   /**
	 * 
	 */
	private static final long serialVersionUID = -7031008862559936404L;
public static final int WIDTH = 300;
   public static final int HEIGHT = 200;

   private JPanel redPanel;
   private JPanel bluePanel;
   private JPanel whitePanel;

   public PanelDemo() {
      super("Panel Demonstration");
      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());

      JPanel biggerPanel = new JPanel();
      biggerPanel.setLayout(new GridLayout(1, 3));

      redPanel = new JPanel();
      redPanel.setBackground(Color.LIGHT_GRAY);
      biggerPanel.add(redPanel);

      bluePanel = new JPanel();
      bluePanel.setBackground(Color.LIGHT_GRAY);
      biggerPanel.add(bluePanel);

      whitePanel = new JPanel();
      whitePanel.setBackground(Color.LIGHT_GRAY);
      biggerPanel.add(whitePanel);

      add(biggerPanel, BorderLayout.CENTER);

      JPanel buttonPanel = new JPanel();
      buttonPanel.setBackground(Color.LIGHT_GRAY);
      buttonPanel.setLayout(new FlowLayout());

      JButton redButton = new JButton("Red");
      redButton.setBackground(Color.RED);
      redButton.addActionListener(this);
      buttonPanel.add(redButton);

      JButton blueButton = new JButton("Blue");
      blueButton.setBackground(Color.BLUE);
      blueButton.addActionListener(this);
      buttonPanel.add(blueButton);

      JButton whiteButton = new JButton("White");
      whiteButton.setBackground(Color.WHITE);
      whiteButton.addActionListener(this);
      buttonPanel.add(whiteButton);

      add(buttonPanel, BorderLayout.SOUTH);
   }

   public void actionPerformed(ActionEvent e) {
      String buttonString = e.getActionCommand();

      if (buttonString.equals("Red")) {
         redPanel.setBackground(Color.RED);
      } else if (buttonString.equals("Blue")) {
         bluePanel.setBackground(Color.BLUE);
      } else if (buttonString.equals("White")) {
         whitePanel.setBackground(Color.WHITE);
      } else {
         System.err.println("Unexpected Error");
      }
   }


   public static void main(String[] args) {
      PanelDemo gui = new PanelDemo();
      gui.setVisible(true);
   }

}