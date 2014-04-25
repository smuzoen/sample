/*
 * Created on 24/04/2006
 */
package week7;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AllEvents extends JFrame {

    private static final long serialVersionUID = 6331173300081257375L;

    public AllEvents() {
        super("Print All Events");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Roll over and press");
        button.addActionListener(new ButtonListener());
        button.addChangeListener(new ButtonListener());
        button.addMouseListener(new ButtonListener());
        button.addMouseMotionListener(new ButtonListener());
        this.getContentPane().add(button);

        // Display the window.
        this.setPreferredSize(new Dimension(300, 100));
        this.setLocation(new Point(200, 200));
        this.pack();
        this.setVisible(true);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new AllEvents();
    }

    public class ButtonListener implements ActionListener, ChangeListener,
            MouseListener, MouseMotionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println(e);
        }

        public void stateChanged(ChangeEvent e) {
            System.out.println(e);
        }

        public void mouseClicked(MouseEvent e) {
            System.out.println(e);
        }

        public void mousePressed(MouseEvent e) {
            System.out.println(e);
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println(e);
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println(e);
        }

        public void mouseExited(MouseEvent e) {
            System.out.println(e);
        }

        public void mouseDragged(MouseEvent e) {
            System.out.println(e);
        }

        public void mouseMoved(MouseEvent e) {
            System.out.println(e);
        }
    }

}
