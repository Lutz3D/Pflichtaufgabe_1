package datenBasis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JDatensatzEditor extends JFrame{
	
		
	private JTextField inputNord = new JTextField();
	private JTextField inputSued = new JTextField();
	private JTextField inputWest = new JTextField();
	private JTextField inputOst = new JTextField();
	
	public JDatensatzEditor ( ) {
		super (daten);
		buildGui();
	}
	private void buildGui () {
		Font font = new Font ("Serif" , Font.BOLD , 30);
		
		JButton btnNew = new JButton ("Neuer Eintrag");
		btnNew.setFont(font);
		
		JPanel verkaufsPanel = new JPanel ();
		
		BoxLayout bl = new BoxLayout (verkaufsPanel, BoxLayout.Y_AXIS);
		verkaufsPanel.setLayout(bl);
		
		JLabel lbNord = new JLabel ("Nord");
		JLabel lbSued = new JLabel ("Süd");
		JLabel lbWest = new JLabel ("West");
		JLabel lbOst = new JLabel ("Ost");
		
		lbNord.setFont(font);
		lbSued.setFont(font);
		lbWest.setFont(font);
		lbOst.setFont(font);
		
		inputNord.setFont(font);
		inputSued.setFont(font);
		inputWest.setFont(font);
		inputOst.setFont(font);
		
		verkaufsPanel.add(lbOst);
		verkaufsPanel.add(inputOst);
		verkaufsPanel.add(lbSued);
		verkaufsPanel.add(inputSued);
		verkaufsPanel.add(lbWest);
		verkaufsPanel.add(inputWest);
		verkaufsPanel.add(lbNord);
		verkaufsPanel.add(inputNord);
		
		JPanel interactionPanel = new JPanel (new FlowLayout ( FlowLayout.LEFT));
		interactionPanel.add(btnNew);
		
		add(btnNew, BorderLayout.SOUTH);
		add (interactionPanel, BorderLayout.SOUTH);
		

		
		
		
		
	}
	


}
