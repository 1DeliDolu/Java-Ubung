package oop_brief;

public class Buchung {

	Standort standort;
	String mietzeitraum;
	Raum raum;
	String ressourcen;
	
	
	
	
	@Override
	public String toString() {
		return "Buchung [standort=" + standort + ", mietzeitraum=" + mietzeitraum + ", raum=" + raum + ", ressourcen="
				+ ressourcen + "]";
	}




	/**
	 * @param standort
	 * @param mietzeitraum
	 * @param raum
	 * @param ressourcen
	 */
	public Buchung(/*Standort standort, String mietzeitraum, Raum raum, String ressourcen*/) {
		super();
		this.standort = standort;
		this.mietzeitraum = mietzeitraum;
		this.raum = raum;
		this.ressourcen = ressourcen;
	}




	/**
	 * @return the standort
	 */
	public Standort getStandort() {
		return standort;
	}




	/**
	 * @param standort the standort to set
	 */
	public void setStandort(Standort standort) {
		this.standort = standort;
	}




	/**
	 * @return the mietzeitraum
	 */
	public String getMietzeitraum() {
		return mietzeitraum;
	}




	/**
	 * @param mietzeitraum the mietzeitraum to set
	 */
	public void setMietzeitraum(String mietzeitraum) {
		this.mietzeitraum = mietzeitraum;
	}




	/**
	 * @return the raum
	 */
	public Raum getRaum() {
		return raum;
	}




	/**
	 * @param raum the raum to set
	 */
	public void setRaum(Raum raum) {
		this.raum = raum;
	}




	/**
	 * @return the ressourcen
	 */
	public String getRessourcen() {
		return ressourcen;
	}




	/**
	 * @param ressourcen the ressourcen to set
	 */
	public void setRessourcen(String ressourcen) {
		this.ressourcen = ressourcen;
	}
	
	
	
	
}
