package datenBasis;

public class StatistischesDiagramm {
	
	protected Datensatz daten;
	
	
	
	public StatistischesDiagramm(Datensatz daten) {
		this.daten = daten;
	}
	
	
	
		
	public void ausgabe () {
				
		System.out.println(" " + daten.titel);
		String dateneinheit = daten.dateneinheit;
		int anzahlDaten = daten.getAnzahlDateneintrage();
		for (int i = 0; i < anzahlDaten; i++) {
				Dateneintrag dateneintrag = daten.getDateneintrag(i);
				
			System.out.println("" + dateneintrag + " " + dateneinheit );
				
		
		}
		System.out.println("Der Durschnitt beträgt " + daten.durschnitt() + " " + dateneinheit);
		
	}
}


