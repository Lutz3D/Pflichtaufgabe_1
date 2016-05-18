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
	
	
	public int getGesamtwert () {
		int sum = 0;
		for (Dateneintrag dateneintrag : daten){
			sum += dateneintrag.getDatenwert();
		}
		return sum;
	}
	
	public Dateneintrag getGroesstenDateneintrag() {
		int anzahlDaten = getAnzahlDateneintrage();
		Dateneintrag groesterDateneintrag;
		groesterDateneintrag = getDateneintrag(0);
		for (int i = 1; i< anzahlDaten; i++) {
			Dateneintrag aktuellerDateneintrag;
			aktuellerDateneintrag = getDateneintrag(i);
			if (groesterDateneintrag.getDatenwert() < aktuellerDateneintrag.getDatenwert()) {
				groesterDateneintrag = aktuellerDateneintrag;
			}
		}
				return groesterDateneintrag;
			
		
	}
	
	public int durschnitt () {
		int gesamt = getGesamtwert();
		int anzahl = getAnzahlDateneintrage();
		double d_Schnitt = gesamt/anzahl;
			
	return (int) d_Schnitt;

	}
	
public boolean istVorhanden(String suchbegriff) {
	for (Dateneintrag each: daten) {
		if (each.getDatenname() == suchbegriff) return true;
	}
	return false;
}


}

