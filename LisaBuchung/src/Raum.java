

public class Raum {

	int raumnummer;
	String art;


	
	
	/**
	 * @param raumnummer
	 * @param art
	 */
	public Raum(int raumnummer, String art) {
		super();
		this.raumnummer = raumnummer;
		this.art = art;
	}


	@Override
	public String toString() {
		return "Raum [raumnummer=" + raumnummer + ", art=" + art + "]";
	}
	
	
	public int getRaumnummer() {
		return raumnummer;
	}
	public void setRaumnummer(int raumnummer) {
		this.raumnummer = raumnummer;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	
	
}
