package datenBasis;

public class Dateneintrag {
	private String datenname;
	private int datenwert;
	
	public Dateneintrag (String datenname, int datenwert) {
		this.datenname = datenname;
		this.datenwert = datenwert;
	}
	
	public void setDatenname (String datenname) {
		this.datenname = datenname;
	}
	
	public int getDatenwert () {
		return datenwert;
	}
	
	public String getDatenname () {
		return datenname;
	}
	
	public void setDatenwert (int datenwert) {
		this.datenwert = datenwert;
	}

	void erhoeheAbsolut (int wert) {
		datenwert += wert;
	}
	
	void erhoheRelativ (int aenderung) {
		datenwert = datenwert + (datenwert*(aenderung/100));
	}
	public int relativerAnteilVon (int gesamtWert) {
		int zwischenwert = gesamtWert /100;
		int ergebnis = this.datenwert/zwischenwert;
		return (ergebnis);
	}
	@Override
	public String toString(){
		return datenname + " "+datenwert;
	}
	
		
	}
	
	
	
