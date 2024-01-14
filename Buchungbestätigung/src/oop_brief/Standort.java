package oop_brief;

public class Standort {

	Adresse adresse;
	String stadt;
	
	@Override
	public String toString() {
		return "Standort [adresse=" + adresse + ", stadt=" + stadt + "]";
	}

	/**
	 * @param adresse
	 * @param stadt
	 */
	
	public Standort(/*Adresse adresse, String stadt*/) {
		super();
		this.adresse = adresse;
		this.stadt = stadt;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	
	
	
}