/*
 * Created on 23/04/2006
 */
package week7;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1713795764450954682L;

	public TabbedPaneDemo() {
        super("Tabbed Pane Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane pane = new JTabbedPane();
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Tab 1"));
        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Tab 2"));

        pane.add("This tab has a label", panel1);
        pane.add("This tab has a button", panel2);
        getContentPane().add(pane);

        // Display the window.
        setPreferredSize(new Dimension(300, 200));
        setLocation(new Point(100, 100));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new TabbedPaneDemo();
    }
}
