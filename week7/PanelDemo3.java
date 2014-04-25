package week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo3 extends JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = -8680728084923185677L;
public static final int WIDTH = 300;
   public static final int HEIGHT = 200;

   private JPanel redPanel;
   private JPanel bluePanel;
   private JPanel whitePanel;

   public PanelDemo3() {
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
      redButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            redPanel.setBackground(Color.RED);
         }
      });
      buttonPanel.add(redButton);

      JButton blueButton = new JButton("Blue");
      blueButton.setBackground(Color.BLUE);
      blueButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bluePanel.setBackground(Color.BLUE);
         }
      });
      buttonPanel.add(blueButton);

      JButton whiteButton = new JButton("White");
      whiteButton.setBackground(Color.WHITE);
      whiteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            whitePanel.setBackground(Color.WHITE);
         }
      });
      buttonPanel.add(whiteButton);

      add(buttonPanel, BorderLayout.SOUTH);
   }

   public static void main(String[] args) {
      PanelDemo3 gui = new PanelDemo3();
      gui.setVisible(true);
   }
}