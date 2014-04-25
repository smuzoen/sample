package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo2 extends JFrame {

   private static final long serialVersionUID = 9006115720535126818L;

   public static final int WIDTH = 300;

   public static final int HEIGHT = 200;

   private JPanel redPanel;

   private JPanel bluePanel;

   private JPanel whitePanel;

   private JButton redButton;

   private JButton blueButton;

   private JButton whiteButton;

   public PanelDemo2() {
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

      redButton = new JButton("Red");
      redButton.setBackground(Color.RED);
      redButton.addActionListener(new ColourListener());
      buttonPanel.add(redButton);

      blueButton = new JButton("Blue");
      blueButton.setBackground(Color.BLUE);
      blueButton.addActionListener(new ColourListener());
      buttonPanel.add(blueButton);

      whiteButton = new JButton("White");
      whiteButton.setBackground(Color.WHITE);
      whiteButton.addActionListener(new ColourListener());
      buttonPanel.add(whiteButton);

      add(buttonPanel, BorderLayout.SOUTH);
   }

   public static void main(String[] args) {
      PanelDemo2 gui = new PanelDemo2();
      gui.setVisible(true);
   }

   private class ColourListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         Component source = (Component) e.getSource();
         if (source == redButton) {
            redPanel.setBackground(Color.RED);
         } else if (source == blueButton) {
            bluePanel.setBackground(Color.BLUE);
         } else if (source == whiteButton) {
            whitePanel.setBackground(Color.WHITE);
         }
      }
   }

}