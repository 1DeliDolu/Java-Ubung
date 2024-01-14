package oop_brief;

public class BuchungsBestaetigung {
	int buchungsnummer;
	String datum;
	Kunde kunde;
	Buchung buchung;
	
	
	
	
	@Override
	public String toString() {
		return "Buchungsbestaetigung [buchungsnummer=" + buchungsnummer + ", datum=" + datum + ", kunde=" + kunde
				+ ", buchung=" + buchung + "]";
	}




	/**
	 * @param buchungsnummer
	 * @param datum
	 * @param kunde
	 * @param buchung
	 */
	public BuchungsBestaetigung(/*int buchungsnummer, String datum, Kunde kunde, Buchung buchung*/) {
		super();
		this.buchungsnummer = buchungsnummer;
		this.datum = datum;
		this.kunde = kunde;
		this.buchung = buchung;
	}




	/**
	 * @return the buchungsnummer
	 */
	public int getBuchungsnummer() {
		return buchungsnummer;
	}




	/**
	 * @param buchungsnummer the buchungsnummer to set
	 */
	public void setBuchungsnummer(int buchungsnummer) {
		this.buchungsnummer = buchungsnummer;
	}




	/**
	 * @return the datum
	 */
	public String getDatum() {
		return datum;
	}




	/**
	 * @param datum the datum to set
	 */
	public void setDatum(String datum) {
		this.datum = datum;
	}




	/**
	 * @return the kunde
	 */
	public Kunde getKunde() {
		return kunde;
	}




	/**
	 * @param kunde the kunde to set
	 */
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}




	/**
	 * @return the buchung
	 */
	public Buchung getBuchung() {
		return buchung;
	}




	/**
	 * @param buchung the buchung to set
	 */
	public void setBuchung(Buchung buchung) {
		this.buchung = buchung;
	}
	
	
	
	
	
	
}
