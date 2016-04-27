package datenBasis;

public class StatistischesDiagramm {
	
		
	public static void ausgabe () {
		System.out.println("Verkaufszahlen");
			for(Dateneintrag each: Datensatz.daten)
			System.out.println("" + each.getDatenname() + " " + each.getDatenwert()  );
					
		}
}


