

public class Adresse {
	String strassenname;
	int hausnummer;
	String plz;
	String stadt;
	
	
	
	/**
	 * @param strassenname
	 * @param hausnummer
	 * @param plz
	 * @param stadt
	 */
	public Adresse(String strassenname, int hausnummer, String plz, String stadt) {
		super();
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.stadt = stadt;
	}
	/**
	 * @return the strassenname
	 */
	public String getStrassenname() {
		return strassenname;
	}
	/**
	 * @param strassenname the strassenname to set
	 */
	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}
	/**
	 * @return the hausnummer
	 */
	public int getHausnummer() {
		return hausnummer;
	}
	/**
	 * @param hausnummer the hausnummer to set
	 */
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	/**
	 * @return the plz
	 */
	public String getPlz() {
		return plz;
	}
	/**
	 * @param plz the plz to set
	 */
	public void setPlz(String plz) {
		this.plz = plz;
	}
	/**
	 * @return the stadt
	 */
	public String getStadt() {
		return stadt;
	}
	/**
	 * @param stadt the stadt to set
	 */
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	@Override
	public String toString() {
		return "Adresse [strassenname=" + strassenname + ", hausnummer=" + hausnummer + ", plz=" + plz + ", stadt="
				+ stadt + "]";
	}
	
	
}
