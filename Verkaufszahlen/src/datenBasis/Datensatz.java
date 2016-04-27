package datenBasis;

import java.util.ArrayList;

public class Datensatz {
	public String titel;
	public String dateneinheit;
	public static ArrayList <Dateneintrag> daten = new ArrayList<Dateneintrag> ();
	
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
	
	public Dateneintrag getDateneintrag(int n) {
	 return daten.get(n);
	}
	
	
	public static int getGesamtwert () {
		int sum = 0;
		for (Dateneintrag dateneintrag: daten )
			sum = sum + dateneintrag.getDatenwert();
		return sum;
	}
	
}
