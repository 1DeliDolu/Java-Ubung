package oop_brief;

public class Kunde {

	String name;
	int kundennummer;
	Adresse adresseDesKunden;
	int telefonnummer;
	String email;
	SachBearbeiter sachBearbeiter;
	
	
	
	@Override
	public String toString() {
		return "Kunde [name=" + name + ", kundennummer=" + kundennummer + ", adresseDesKunden=" + adresseDesKunden
				+ ", telefonnummer=" + telefonnummer + ", email=" + email + ", sachBearbeiter=" + sachBearbeiter + "]";
	}



	/**
	 * @param name
	 * @param kundennummer
	 * @param adresseDesKunden
	 * @param telefonnummer
	 * @param email
	 * @param sachBearbeiter
	 */
	public Kunde(/*String name, int kundennummer, Adresse adresseDesKunden, int telefonnummer, String email,
			SachBearbeiter sachBearbeiter*/) {
		super();
		this.name = name;
		this.kundennummer = kundennummer;
		this.adresseDesKunden = adresseDesKunden;
		this.telefonnummer = telefonnummer;
		this.email = email;
		this.sachBearbeiter = sachBearbeiter;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the kundennummer
	 */
	public int getKundennummer() {
		return kundennummer;
	}



	/**
	 * @param kundennummer the kundennummer to set
	 */
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}



	/**
	 * @return the adresseDesKunden
	 */
	public Adresse getAdresseDesKunden() {
		return adresseDesKunden;
	}



	/**
	 * @param adresseDesKunden the adresseDesKunden to set
	 */
	public void setAdresseDesKunden(Adresse adresseDesKunden) {
		this.adresseDesKunden = adresseDesKunden;
	}



	/**
	 * @return the telefonnummer
	 */
	public int getTelefonnummer() {
		return telefonnummer;
	}



	/**
	 * @param telefonnummer the telefonnummer to set
	 */
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the sachBearbeiter
	 */
	public SachBearbeiter getSachBearbeiter() {
		return sachBearbeiter;
	}



	/**
	 * @param sachBearbeiter the sachBearbeiter to set
	 */
	public void setSachBearbeiter(SachBearbeiter sachBearbeiter) {
		this.sachBearbeiter = sachBearbeiter;
	}
	
	
	
}
