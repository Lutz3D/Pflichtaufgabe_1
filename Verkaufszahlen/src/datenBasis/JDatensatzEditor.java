package datenBasis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private Datensatz verkaufszahlen = null;
	private ArrayList <Datensatz> daten = new ArrayList <Datensatz> ();
	private int index = -1;
	
	public JDatensatzEditor (Datensatz verkaufszahlen ) {
		super ("Verkaufs-Zahlen");
		this.verkaufszahlen = verkaufszahlen;
		buildGui();
	}
	public void buildGui () {
		Font font = new Font ("Serif" , Font.BOLD , 30);
						
		
		
		JPanel verkaufsPanel = new JPanel ();
		
		BoxLayout bl = new BoxLayout (verkaufsPanel, BoxLayout.Y_AXIS);
		verkaufsPanel.setLayout(bl);
		
		JLabel lbNord = new JLabel ("Nord");
		lbNord.setFont(font);
		inputNord.setFont(font);
		verkaufsPanel.add(lbNord);
		verkaufsPanel.add(inputNord);
		
		JLabel lbSued = new JLabel ("S�d");
		lbSued.setFont(font);
		inputSued.setFont(font);
		verkaufsPanel.add(lbSued);
		verkaufsPanel.add(inputSued);
		
		JLabel lbWest = new JLabel ("West");
		lbWest.setFont(font);
		inputWest.setFont(font);
		verkaufsPanel.add(lbWest);
		verkaufsPanel.add(inputWest);
		
		JLabel lbOst = new JLabel ("Ost");
		lbOst.setFont(font);
		inputOst.setFont(font);
		verkaufsPanel.add(lbOst);
		verkaufsPanel.add(inputOst);
	
		JButton btnNew = new JButton ("Neuer Eintrag");
		btnNew.setFont(font);
				
		
		JPanel actionPanel = new JPanel (new FlowLayout (FlowLayout.LEFT));
		actionPanel.add(btnNew);
		
		
		add (actionPanel, BorderLayout.PAGE_END);
		add (verkaufsPanel, BorderLayout.CENTER);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener hans = new NewEntry (this);
		btnNew.addActionListener(hans);

			
	}
	
	public void addVerkaufsZahlen (Datensatz z) {
		daten.add(z);
		verkaufszahlen = z;
		index = daten.size() -1;
		showVerkaufsZahlen();
	}
	
	public void showVerkaufsZahlen() {
		if (verkaufszahlen == null) return;
		inputNord.setText(Integer.toString(verkaufszahlen.getDateneintrag(0).getDatenwert()));
		inputSued.setText(Integer.toString(verkaufszahlen.getDateneintrag(1).getDatenwert()));
		inputWest.setText(Integer.toString(verkaufszahlen.getDateneintrag(2).getDatenwert()));
		inputOst.setText(Integer.toString(verkaufszahlen.getDateneintrag(3).getDatenwert()));
		
	}
	
	public void newEntry () {
		Font font = new Font ("Serif" , Font.BOLD , 30);
		JPanel newPanel = new JPanel ();
		BoxLayout bl2 = new BoxLayout (newPanel, BoxLayout.Y_AXIS);
		newPanel.setLayout(bl2);
		JLabel lbUnbenannt = new JLabel ("Unbenannt");
		JTextField inputUnbenannt = new JTextField ();
		lbUnbenannt.setFont(font);
		inputUnbenannt.setFont(font);
		newPanel.add(lbUnbenannt);
		newPanel.add(inputUnbenannt);
		add(newPanel, BorderLayout.SOUTH);
		pack();
		showVerkaufsZahlen();
	}
	


} //ENDE der Klasse JDatenSatzEditor
