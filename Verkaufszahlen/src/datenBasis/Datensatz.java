package datenBasis;

import java.util.ArrayList;

public class Datensatz {
	public String titel;
	public String dateneinheit;
	public ArrayList <Dateneintrag> daten = new ArrayList<Dateneintrag> ();
	
	public Datensatz (String titel, String dateneinheit) {
		this.titel = titel;
		this.dateneinheit = dateneinheit ;
	}
	
	public void add (Dateneintrag eintrag) {
		Datensatz eintrag1 = new Datensatz ("Hans", "werner");
	}

	int getAnzahlDateneintrage() {
		return Dateneintrag.size();
	}
	
	int DatenEintrag getDateneintrag(int n) {
		return Dateneintrag;
	}
	
	int getGesamtwert () {
		
	}
	
}
