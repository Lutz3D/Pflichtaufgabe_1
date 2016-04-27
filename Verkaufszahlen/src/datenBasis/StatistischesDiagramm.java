package datenBasis;

public class StatistischesDiagramm {
	
		
	public static void ausgabe () {
		System.out.println("Verkaufszahlen");
			for(Dateneintrag hans: Datensatz.daten)
			System.out.println("" + hans.getDatenname() + " " + hans.getDatenwert()  );
			
			
		}
	}



