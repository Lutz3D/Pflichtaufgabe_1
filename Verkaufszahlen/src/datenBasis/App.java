package datenBasis;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Datensatz verkaufszahlen = new Datensatz("Verkaufszahlen", "Euro");
		verkaufszahlen.add(new Dateneintrag("Nord", 300000));
		verkaufszahlen.add(new Dateneintrag("Süd", 140000));
		verkaufszahlen.add(new Dateneintrag("West", 900000));
		verkaufszahlen.add(new Dateneintrag("Ost", 120000));
<<<<<<< HEAD
	
		StatistischesDiagramm.ausgabe();
		
=======
						
		StatistischesDiagramm.ausgabe();
>>>>>>> branch 'master' of ssh://git@github.com/Lutz3D/Pflichtaufgabe_1.git
		
	}

}
