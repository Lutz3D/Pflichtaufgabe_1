package datenBasis;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Datensatz verkaufszahlen = new Datensatz("Verkaufszahlen", "Euro");
		JDatensatzEditor frame = new JDatensatzEditor (verkaufszahlen);

		verkaufszahlen.add(new Dateneintrag("Nord", 300000));
		verkaufszahlen.add(new Dateneintrag("Süd", 140000));
		verkaufszahlen.add(new Dateneintrag("West", 900000));
		verkaufszahlen.add(new Dateneintrag("Ost", 120000));
				
				
		//StatistischesDiagramm diagramm = new StatistischesDiagramm(verkaufszahlen);
		//diagramm.ausgabe();
		
		//frame.buildGui();
		
		frame.addVerkaufsZahlen(verkaufszahlen);
		
		
		
		
		
		
		
	}

}
