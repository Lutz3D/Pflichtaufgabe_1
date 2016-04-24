package datenBasis;

import java.util.ArrayList;

public class Datensatz {
	int i= 0;
	public String titel;
	public String dateneinheit;
	public ArrayList <Dateneintrag> daten = new ArrayList<Dateneintrag> ();
	
	public Datensatz (String titel, String dateneinheit) {
		this.titel = titel;
		this.dateneinheit = dateneinheit ;
	}
	
	public void add (Dateneintrag eintrag) {
		daten.add(eintrag);
	}

	public int getAnzahlDateneintrage() {
		return daten.size();
	}
	
	//public int getDateneintrag(int n) {
	//	return daten.get(n);
	//}
	
	//int getGesamtwert () {
		
	//}
	
}
