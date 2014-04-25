package week7;

import java.awt.*;
import javax.swing.*;

public class HelloWorldSwing2 extends JFrame { 

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 3383545341788985907L;

	public HelloWorldSwing2() {
        super("Hello World Swing 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        //Add the label. 
        JLabel label = new JLabel("Hello Java Swing World");
        getContentPane().add(label);
     
        //Display the window. 
        setPreferredSize(new Dimension(300, 100));
        setLocation(new Point(200, 200));
        pack(); 
        setVisible(true); 
    }
    
   public static void main(String[] args) {
       JFrame.setDefaultLookAndFeelDecorated(true);
       new HelloWorldSwing2();
   }
} 

