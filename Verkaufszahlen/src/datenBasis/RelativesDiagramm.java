package datenBasis;

public class RelativesDiagramm extends StatistischesDiagramm {

	
	public RelativesDiagramm(Datensatz daten) {
		super(daten);	
		// TODO Auto-generated constructor stub
	}
	
	public void ausgabe () {
		System.out.println(" " + daten.titel);
		String dateneinheit = daten.dateneinheit;
		int gesamtWert = daten.getGesamtwert();
	
		int anzahlDaten = daten.getAnzahlDateneintrage();
		for (int i = 0; i < anzahlDaten; i++) {
				Dateneintrag dateneintrag = daten.getDateneintrag(i);
			System.out.println("" + dateneintrag + " " + dateneinheit + " " +dateneintrag.relativerAnteilVon(gesamtWert) + "%") ;	
				}
		System.out.println("Gesamt " + gesamtWert);
		
		

}
}
