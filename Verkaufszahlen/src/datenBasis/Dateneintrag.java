package datenBasis;

public class Dateneintrag {
	private String datenname;
	private double datenwert;
	
	public Dateneintrag (String datenname, double datenwert) {
		this.datenname = datenname;
		this.datenwert = datenwert;
	}
	
	public void setDatenname (String datenname) {
		this.datenname = datenname;
	}
	
	public void setDatenwert (double datenwert) {
		this.datenwert = datenwert;
	}

	void erhoeheAbsolut (int wert) {
		datenwert += wert;
	}
	
	void erhoheRelativ (int aenderung) {
		datenwert = datenwert + (datenwert*(aenderung/100));
	}
	public int relativerAnteilVon (int gesamtWert) {
		datenwert = (datenwert/gesamtWert)*100;
		return (int) datenwert;
	}
	

}
