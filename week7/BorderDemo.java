/*
 * Created on 24/04/2006
 */
package week7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderDemo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6063203541510340633L;

	public BorderDemo() {
        super("Border Layout Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JButton button1 = new JButton("North Button");
        panel.add(button1, BorderLayout.NORTH);
        JButton button2 = new JButton("South Button");
        panel.add(button2, BorderLayout.SOUTH);
        JButton button3 = new JButton("West Button");
        panel.add(button3, BorderLayout.WEST);
        JButton button4 = new JButton("East Button");
        panel.add(button4, BorderLayout.EAST);
        JButton button5 = new JButton("Centre Button");
        panel.add(button5, BorderLayout.CENTER);
        getContentPane().add(panel);

        // Display the window.
        setPreferredSize(new Dimension(300, 200));
        setLocation(new Point(100, 100));
        pack();
        setVisible(true);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new BorderDemo();
    }

}
