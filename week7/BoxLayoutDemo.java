/*
 * Created on 24/04/2006
 */
package week7;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7880807991481776439L;

	public BoxLayoutDemo() {
        super("BoxLayout Example");

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        p1.add(Box.createHorizontalGlue());
        p1.add(new JButton("Right Aligned"));

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        p2.add(Box.createHorizontalGlue());
        p2.add(new JButton("Center Aligned"));
        p2.add(Box.createHorizontalGlue());

        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(p1);
        getContentPane().add(Box.createVerticalStrut(20));
        getContentPane().add(p2);
        setPreferredSize(new Dimension(400, 200));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new BoxLayoutDemo();
    }

}
