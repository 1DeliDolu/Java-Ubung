

public class Buchungsbestätigung {

	int buchungsnummer;
	String datum;
	Kunde kunde;
	Buchung buchung;
	
	
	
	/**
	 * @param buchungsnummer
	 * @param datum
	 * @param kunde
	 * @param buchung
	 */
	public Buchungsbestätigung(int buchungsnummer, String datum, Kunde kunde, Buchung buchung) {
		super();
		this.buchungsnummer = buchungsnummer;
		this.datum = datum;
		this.kunde = kunde;
		this.buchung = buchung;
	}
	@Override
	public String toString() {
		return "Buchungsbestätigung [buchungsnummer=" + buchungsnummer + ", datum=" + datum + ", kunde=" + kunde
				+ ", buchung=" + buchung + "]";
	}
	public int getBuchungsnummer() {
		return buchungsnummer;
	}
	public void setBuchungsnummer(int buchungsnummer) {
		this.buchungsnummer = buchungsnummer;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public Kunde getKunde() {
		return kunde;
	}
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	public Buchung getBuchung() {
		return buchung;
	}
	public void setBuchung(Buchung buchung) {
		this.buchung = buchung;
	}
	
	
}
