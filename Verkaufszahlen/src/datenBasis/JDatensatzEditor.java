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
	private Datensatz datensatz = null;
	private ArrayList <Datensatz> daten = new ArrayList <Datensatz> ();
	private int index = -1;
	
	public JDatensatzEditor (Datensatz verkaufszahlen ) {
		super ("Verkaufs-Zahlen");
		this.datensatz = verkaufszahlen;
		buildGui();
	}
	private void buildGui () {
		Font font = new Font ("Serif" , Font.BOLD , 30);
						
		
		
		JPanel verkaufsPanel = new JPanel ();
		
		BoxLayout bl = new BoxLayout (verkaufsPanel, BoxLayout.Y_AXIS);
		verkaufsPanel.setLayout(bl);
		
		JLabel lbNord = new JLabel ("Nord");
		lbNord.setFont(font);
		inputNord.setFont(font);
		verkaufsPanel.add(lbNord);
		verkaufsPanel.add(inputNord);
		
		JLabel lbSued = new JLabel ("Süd");
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
		
		
		add (actionPanel, BorderLayout.SOUTH);
		add (verkaufsPanel, BorderLayout.CENTER);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
	}
	
	public void addVerkaufsZahlen (Datensatz z) {
		daten.add(z);
		datensatz = z;
		index = daten.size() -1;
		showVerkaufsZahlen();
	}
	
	public void showVerkaufsZahlen() {
		if (datensatz == null) return;
		inputWest.setText(Integer.toString(datensatz.getDateneintrag(0)));
		
	}
	


} //ENDE der Klasse JDatenSatzEditor
