/*
 * Created on 24/04/2006
 */
package week7;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowDemo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4569836932018154232L;

	public FlowDemo() {
        super("Flow Layout Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("Button" + (i + 1));
            panel.add(button);
        }
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
        new FlowDemo();
    }

}
