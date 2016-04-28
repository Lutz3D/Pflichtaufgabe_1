package datenBasis;

public class Stern extends StatistischesDiagramm {


public Stern(Datensatz daten) {
		super(daten);
		// TODO Auto-generated constructor stub
	}

	
	
	public String sterne (int gesamtWert) {
		String z = "*";
		String y = "-";
		int x = 0;
		int tmp = 0;
		String prozentausgabe = "";
		int anzahlDaten = daten.getAnzahlDateneintrage();
		for (int i = 0; i < anzahlDaten; i++) {
			Dateneintrag dateneintrag = daten.getDateneintrag(i);
			tmp = dateneintrag.relativerAnteilVon(gesamtWert);
			x = tmp/10;
			if (x > 1) {
			prozentausgabe = prozentausgabe.concat(z);
			
			}	
			
		}
		
		return prozentausgabe;
	}
		
		public void ausgabe () {
			System.out.println(" " + daten.titel);
			String dateneinheit = daten.dateneinheit;
			int gesamtWert = daten.getGesamtwert();
		
			int anzahlDaten = daten.getAnzahlDateneintrage();
			for (int i = 0; i < anzahlDaten; i++) {
					
					Dateneintrag dateneintrag = daten.getDateneintrag(i);
					System.out.println("" + dateneintrag + " " + dateneinheit + " " +dateneintrag.relativerAnteilVon(gesamtWert) + "%" + " " + sterne(gesamtWert)) ;					}
			System.out.println("Gesamt " + gesamtWert);
			
			

	}
		
	}
