/**
 * 
 */
package guiExplorer;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Voltan
 *
 */
public class PanelsAndWidgets extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = -7031008862559936404L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	/* Private fields for 5 panels */
	private JPanel pnlOne;
	private JPanel pnlTwo;
	private JPanel pnlBtn;
	private JPanel pnlFour;
	private JPanel pnlFive;
	private JButton btnLoad;
	private JButton btnUnload;
	private JButton btnFind;
	private JButton btnSwitch;
	
	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public PanelsAndWidgets(String title) throws HeadlessException {
		super(title);	
		createGUI();
	}
	
	
	/* Setup the panels */
	private JPanel createPanel(Color c) {
		JPanel newPanel = new JPanel();
		newPanel.setBackground(c);
		return newPanel;
	}
	
	private void createGUI() {
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		pnlOne = createPanel(Color.WHITE);
		pnlTwo = createPanel(Color.LIGHT_GRAY);
		pnlBtn = createPanel(Color.LIGHT_GRAY);
		pnlFour = createPanel(Color.LIGHT_GRAY);
		pnlFive = createPanel(Color.LIGHT_GRAY);
		btnLoad = createButton("Load");
		btnUnload = createButton("Unload");
		btnSwitch = createButton("Switch");
		btnFind = createButton("Find");
		
		this.getContentPane().add(pnlOne,BorderLayout.CENTER);
		this.getContentPane().add(pnlTwo,BorderLayout.NORTH);
		this.getContentPane().add(pnlBtn,BorderLayout.SOUTH);
		this.getContentPane().add(pnlFour,BorderLayout.EAST);
		this.getContentPane().add(pnlFive, BorderLayout.WEST);
		layoutButtonPanel();
		
		repaint();	
		this.setVisible(true);
	}
	
	private void layoutButtonPanel() {
		GridBagLayout layout = new GridBagLayout();
		pnlBtn.setLayout(layout);
		//add components to grid
		GridBagConstraints constraints = new GridBagConstraints();
		//Defaults
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.weightx = 100;
		constraints.weighty = 100;
		addToPanel(pnlBtn, btnLoad,constraints,0,0,2,1); 
		addToPanel(pnlBtn, btnUnload,constraints,3,0,2,1); 
		addToPanel(pnlBtn, btnFind,constraints,0,2,2,1); 
		addToPanel(pnlBtn, btnSwitch,constraints,3,2,2,1);		
	}
	
	private JButton createButton(String str)  {
		JButton button = new JButton();
		button.setText(str);
		button.addActionListener(this);
		return button;
	}
	
	/**
	*
	* A convenience method to add a component to given grid bag
	* layout locations. Code due to Cay Horstmann
	*
	* @param c the component to add
	* @param constraints the grid bag constraints to use
	* @param x the x grid position
	* @param y the y grid position
	* @param w the grid width of the component
	* @param h the grid height of the component
	*/
	private void addToPanel(JPanel jp,Component c, GridBagConstraints constraints,int x, int y, int w, int h) {
		constraints.gridx = x; 
		constraints.gridy = y; 
		constraints.gridwidth = w; 
		constraints.gridheight = h; 
		jp.add(c, constraints);
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
		SwingUtilities.invokeLater(new PanelsAndWidgets("BorderLayout"));

	}

}
