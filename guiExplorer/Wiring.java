/**
 * 
 */
package guiExplorer;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * @author Voltan
 *
 */
public class Wiring extends JFrame implements ActionListener, Runnable {

	private static final long serialVersionUID = -7031008862559936404L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	/* Private fields for 5 panels */
	private JPanel pnlDisplay;
	private JPanel pnlTwo;
	private JPanel pnlBtn;
	private JPanel pnlFour;
	private JPanel pnlFive;
	private JButton btnLoad;
	private JButton btnUnload;
	private JButton btnFind;
	private JButton btnSwitch;
	private int fontSize = 24;
	private JTextArea areDisplay;
	
	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Wiring(String title) throws HeadlessException {
		super(title);	
	}
	
	
	
	private void createGUI() {
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		pnlDisplay = createPanel(Color.WHITE);
		pnlTwo = createPanel(Color.LIGHT_GRAY);
		pnlBtn = createPanel(Color.LIGHT_GRAY);
		pnlFour = createPanel(Color.LIGHT_GRAY);
		pnlFive = createPanel(Color.LIGHT_GRAY);
		this.getContentPane().add(pnlDisplay,BorderLayout.CENTER);
		this.getContentPane().add(pnlTwo,BorderLayout.NORTH);
		this.getContentPane().add(pnlBtn,BorderLayout.SOUTH);
		this.getContentPane().add(pnlFour,BorderLayout.EAST);
		this.getContentPane().add(pnlFive, BorderLayout.WEST);
		btnLoad = createButton("Load");
		btnUnload = createButton("Unload");
		btnSwitch = createButton("Switch");
		btnFind = createButton("Find");		
		
		layoutButtonPanel();
		areDisplay = createTextArea(fontSize);
		layoutCenterPanel(areDisplay);		
		repaint();	
		this.setVisible(true);
	}
	
	/* Setup the panels */
	private JPanel createPanel(Color c) {
		JPanel newPanel = new JPanel();
		newPanel.setBackground(c);
		return newPanel;
	}
	
	private void layoutCenterPanel(JTextArea textDisplay) {
		BorderLayout layout = new BorderLayout();
		pnlDisplay.setLayout(layout);
		pnlDisplay.add(textDisplay, BorderLayout.CENTER);
	}
	
	private JTextArea createTextArea(int size) {
		JTextArea display = new JTextArea(); 
		display.setEditable(false); 
		display.setLineWrap(true);		
		display.setFont(new Font("Arial",Font.BOLD,size));
		display.setBorder(BorderFactory.createEtchedBorder());
		return display;
		
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
		JButton button = new JButton(str);
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
		createGUI();
	} 

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		//Get event source
		Object src=event.getSource();
		if (src == btnLoad) {
			areDisplay.setText("Load");
		} else if (src == btnUnload) {
				areDisplay.setText("Unload");
		} else if (src == btnSwitch) {
			JOptionPane.showMessageDialog(this,"A Stupid Warning Message",
					"Wiring Class: Warning",JOptionPane.WARNING_MESSAGE);
		} else if (src == btnFind){
			JOptionPane.showMessageDialog(this,"A Stupid Warning Message",
					"Wiring Class: Warning",JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		JFrame.setDefaultLookAndFeelDecorated(true);	
		SwingUtilities.invokeLater(new Wiring("BorderLayout"));

	}

}
