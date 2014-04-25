/*
 * Created on 23/04/2006
 */
package week7;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MDIDemo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -775787974527064559L;
	private static final boolean CLOSABLE = true;
    private static final boolean ICONIFIABLE = true;
    private static final boolean MAXIMIZABLE = true;
    private static final boolean RESIZABLE = true;

    public MDIDemo() {
        super("MDI Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JDesktopPane pane = new JDesktopPane();

        JInternalFrame firstWindow = new JInternalFrame("First Window", RESIZABLE,
                CLOSABLE, MAXIMIZABLE, ICONIFIABLE);
        firstWindow.setSize(200, 200);
        firstWindow.setLocation(10, 10);
        firstWindow.setVisible(true);

        JInternalFrame secondWindow = new JInternalFrame("Second Window", RESIZABLE,
                CLOSABLE, MAXIMIZABLE);
        secondWindow.setSize(300, 300);
        secondWindow.setLocation(150, 100);
        secondWindow.setVisible(true);

        JInternalFrame thirdWindow = new JInternalFrame("Third Window");
        thirdWindow.setSize(200, 200);
        thirdWindow.setLocation(300, 300);
        thirdWindow.setVisible(true);

        pane.add(thirdWindow); // the first one added is the top layer
        pane.add(secondWindow);
        pane.add(firstWindow);

        getContentPane().add(pane);

        // Display the window.
        setPreferredSize(new Dimension(800, 600));
        setLocation(new Point(100, 100));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MDIDemo();
    }
}
