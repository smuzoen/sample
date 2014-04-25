package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo4 extends JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = 3377188551604856537L;
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
   
   public PanelDemo4() {
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

      JMenu colourMenu = new JMenu("Add Colours");

      redChoice = new JMenuItem("Red");
      redChoice.addActionListener(new ColourListener());
      colourMenu.add(redChoice);

      blueChoice = new JMenuItem("Blue");
      blueChoice.addActionListener(new ColourListener());
      colourMenu.add(blueChoice);

      whiteChoice = new JMenuItem("White");
      whiteChoice.addActionListener(new ColourListener());
      colourMenu.add(whiteChoice);

      JMenuBar bar = new JMenuBar();
      bar.add(colourMenu);
      setJMenuBar(bar);
   }

   public static void main(String[] args) {
      PanelDemo4 gui = new PanelDemo4();
      gui.setVisible(true);
   }

   private class ColourListener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           Component source = (Component) e.getSource();
           System.out.println(source);
           if (source == redButton || source == redChoice) {
               redPanel.setBackground(Color.RED);
           } else if (source == blueButton || source == blueChoice) {
               bluePanel.setBackground(Color.BLUE);
           } else if (source == whiteButton || source == whiteChoice) {
               whitePanel.setBackground(Color.WHITE);
           }
       }
    }
}