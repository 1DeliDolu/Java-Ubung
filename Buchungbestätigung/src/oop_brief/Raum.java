package oop_brief;

public class Raum {
	int raumnummer;
	String art;
	
	
	
	@Override
	public String toString() {
		return "Raum [raumnummer=" + raumnummer + ", art=" + art + "]";
	}



	/**
	 * @param raumnummer
	 * @param art
	 */
	public Raum(/*int raumnummer, String art*/) {
		super();
		this.raumnummer = raumnummer;
		this.art = art;
	}



	/**
	 * @return the raumnummer
	 */
	public int getRaumnummer() {
		return raumnummer;
	}



	/**
	 * @param raumnummer the raumnummer to set
	 */
	public void setRaumnummer(int raumnummer) {
		this.raumnummer = raumnummer;
	}



	/**
	 * @return the art
	 */
	public String getArt() {
		return art;
	}



	/**
	 * @param art the art to set
	 */
	public void setArt(String art) {
		this.art = art;
	}
	
	
	
	
}
