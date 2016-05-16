package datenBasis;

public class Stern extends StatistischesDiagramm {


public Stern(Datensatz daten) {
		super(daten);
		// TODO Auto-generated constructor stub
	}

	
	//OLD
	/*public String sterne (int gesamtWert) {
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
	} */



		
		public void ausgabe () {
			System.out.println(" " + daten.titel);
			String dateneinheit = daten.dateneinheit;
			int gesamtWert = daten.getGesamtwert();
			int anzahlDaten = daten.getAnzahlDateneintrage();
			String z = "*";
			String y = "-";
			int x = 0;
			int tmp = 0;
			String prozentausgabe = "";
			for (int i = 0; i < anzahlDaten; i++) {
					Dateneintrag dateneintrag = daten.getDateneintrag(i);
					tmp = dateneintrag.relativerAnteilVon(gesamtWert);
					x = tmp/10;
					if ( x < 1) {
						prozentausgabe = y;
					} else if (x>1) {
						prozentausgabe = "";
						for (int n =0; n < x; n++) {
							prozentausgabe = prozentausgabe.concat(z);
						}
					}			
					System.out.println("" + dateneintrag + " " + dateneinheit + " " +dateneintrag.relativerAnteilVon(gesamtWert) + "%" + " " + prozentausgabe) ;					}
					System.out.println("Gesamt " + gesamtWert);
			
			

	}
		
	}
