/**
 * 
 */
package guiExplorer;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Voltan
 *
 */
public class FramesAndPanels extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = -7031008862559936404L;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	/* Private fields for 5 panels */
	private JPanel pnlOne;
	private JPanel pnlTwo;
	private JPanel pnlThree;
	private JPanel pnlFour;
	private JPanel pnlFive;
	
	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public FramesAndPanels(String title) throws HeadlessException {
		super(title);			
	}

	
	private void createGUI() {
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		pnlOne = createPanel(Color.WHITE);
		pnlTwo = createPanel(Color.RED);
		pnlThree = createPanel(Color.BLUE);
		pnlFour = createPanel(Color.GREEN);
		pnlFive = createPanel(Color.YELLOW);
		this.getContentPane().add(pnlOne,BorderLayout.CENTER);
		this.getContentPane().add(pnlTwo,BorderLayout.NORTH);
		this.getContentPane().add(pnlThree,BorderLayout.SOUTH);
		this.getContentPane().add(pnlFour,BorderLayout.EAST);
		this.getContentPane().add(pnlFive, BorderLayout.WEST);
		repaint();	
		this.setVisible(true);
	}
	
	
	/* Setup the panels */
	private JPanel createPanel(Color c) {
		JPanel panel = new JPanel();
		panel.setBackground(c);
		return panel;
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		JFrame.setDefaultLookAndFeelDecorated(true);	
		createGUI();
	} 

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		SwingUtilities.invokeLater(new FramesAndPanels("BorderLayout"));
	}

}
