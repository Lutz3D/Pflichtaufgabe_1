package datenBasis;

public class Dateneintrag {
	private String datenname;
	private double datenwert;
	
	public void setDatenname (String v_name) {
		datenname = v_name;
	}
	
	public void setDatenwert (double v_wert) {
		datenwert = v_wert;
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
