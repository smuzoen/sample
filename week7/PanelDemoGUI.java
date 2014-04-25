package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

public class PanelDemoGUI extends JFrame implements Observer {

   private static final long serialVersionUID = -8851746420097089647L;

   public static final int WIDTH = 300;

   public static final int HEIGHT = 200;

   private JPanel redPanel;

   private JPanel bluePanel;

   private JPanel whitePanel;

   private JButton redButton;

   private JButton blueButton;

   private JButton whiteButton;

   private JMenuItem redChoice;

   private JMenuItem blueChoice;

   private JMenuItem whiteChoice;

   public PanelDemoGUI() {
      super("Panel Demonstration");
      initComponents();
   }

   private void initComponents() {

      setSize(WIDTH, HEIGHT);
      setLayout(new BorderLayout());

      redPanel = new JPanel();
      redPanel.setBackground(Color.LIGHT_GRAY);
      bluePanel = new JPanel();
      bluePanel.setBackground(Color.LIGHT_GRAY);
      whitePanel = new JPanel();
      whitePanel.setBackground(Color.LIGHT_GRAY);

      JPanel biggerPanel = new JPanel();
      biggerPanel.setLayout(new GridLayout(1, 3));
      biggerPanel.add(redPanel);
      biggerPanel.add(bluePanel);
      biggerPanel.add(whitePanel);
      add(biggerPanel, BorderLayout.CENTER);

      redButton = new JButton("Red");
      blueButton = new JButton("Blue");
      whiteButton = new JButton("White");
      redButton.setBackground(Color.RED);
      blueButton.setBackground(Color.BLUE);
      whiteButton.setBackground(Color.WHITE);

      JPanel buttonPanel = new JPanel();
      buttonPanel.setBackground(Color.LIGHT_GRAY);
      buttonPanel.setLayout(new FlowLayout());
      buttonPanel.add(redButton);
      buttonPanel.add(blueButton);
      buttonPanel.add(whiteButton);
      add(buttonPanel, BorderLayout.SOUTH);

      redChoice = new JMenuItem("Red");
      blueChoice = new JMenuItem("Blue");
      whiteChoice = new JMenuItem("White");
      JMenu colourMenu = new JMenu("Add Colours");
      colourMenu.add(redChoice);
      colourMenu.add(blueChoice);
      colourMenu.add(whiteChoice);

      JMenuBar bar = new JMenuBar();
      bar.add(colourMenu);
      setJMenuBar(bar);
   }

   public JButton getBlueButton() {
      return blueButton;
   }

   public JMenuItem getBlueChoice() {
      return blueChoice;
   }

   public JButton getRedButton() {
      return redButton;
   }

   public JMenuItem getRedChoice() {
      return redChoice;
   }

   public JButton getWhiteButton() {
      return whiteButton;
   }

   public JMenuItem getWhiteChoice() {
      return whiteChoice;
   }

   public void addActionListener(ActionListener listener) {
      redButton.addActionListener(listener);
      blueButton.addActionListener(listener);
      whiteButton.addActionListener(listener);
      redChoice.addActionListener(listener);
      blueChoice.addActionListener(listener);
      whiteChoice.addActionListener(listener);
   }

   public void update(Observable o, Object arg) {
      PanelDemoModel model = (PanelDemoModel) o;
      if (model.getRed()) {
         redPanel.setBackground(Color.RED);
      } else {
         redPanel.setBackground(Color.LIGHT_GRAY);
      }
      if (model.getBlue()) {
         bluePanel.setBackground(Color.BLUE);
      } else {
         bluePanel.setBackground(Color.LIGHT_GRAY);
      }
      if (model.getWhite()) {
         whitePanel.setBackground(Color.WHITE);
      } else {
         whitePanel.setBackground(Color.LIGHT_GRAY);
      }
   }
}