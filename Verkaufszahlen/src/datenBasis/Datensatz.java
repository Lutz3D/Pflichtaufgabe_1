package datenBasis;

import java.util.ArrayList;

public class Datensatz {
	public String Titel;
	public Enum Dateneinheit;
	public ArrayList <Dateneintrag> daten = new ArrayList<Dateneintrag> ();
	
	void add (Dateneintrag eintrag) {
		Dateneintrag.add(new eintrag());
	}

	int getAnzahlDateneintrage() {
		return Dateneintrag.size();
	}
	
	DatenEintrag getDateneintrag(int n) {
		
	}
	
	int getGesamtwert () {
		
	}
	
}
