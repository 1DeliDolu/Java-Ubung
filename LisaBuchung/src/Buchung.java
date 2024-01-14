

public class Buchung {

	Standort standort;
	String mietzeitraum;
	Raum raum;
	String ressourcen;
	/**
	 * @param standort
	 * @param mietzeitraum
	 * @param raum
	 * @param ressourcen
	 */
	public Buchung(Standort standort, String mietzeitraum, Raum raum, String ressourcen) {
		super();
		this.standort = standort;
		this.mietzeitraum = mietzeitraum;
		this.raum = raum;
		this.ressourcen = ressourcen;
	}
	
	
	@Override
	public String toString() {
		return "Buchung [standort=" + standort + ", mietzeitraum=" + mietzeitraum + ", raum=" + raum + ", ressourcen="
				+ ressourcen + "]";
	}
	
	
}
