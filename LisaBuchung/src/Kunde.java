

public class Kunde {

	String name;
	int kundennummer;
	Adresse adresseDesKunden;
	String telefonnummer;
	String email;
	Sachbearbeiter sachbearbeiter;
	
	
	
	/**
	 * @param name
	 * @param kundennummer
	 * @param string
	 * @param telefonnummer
	 * @param string2
	 */
	public Kunde(String name, int kundennummer, Adresse adresseDesKunden, String telefonnummer, Sachbearbeiter ssachbearbeiter) {
		super();
		this.name = name;
		this.kundennummer = kundennummer;
		this.adresseDesKunden = adresseDesKunden;
		this.telefonnummer = telefonnummer;
		this.email = email;
		this.sachbearbeiter = sachbearbeiter;
	}
	
	
	
	@Override
	public String toString() {
		return "Kunde [name=" + name + ", kundennummer=" + kundennummer + ", adresseDesKunden=" + adresseDesKunden
				+ ", telefonnummer=" + telefonnummer + ", email=" + email + ", sachbearbeiter=" + sachbearbeiter + "]";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	public Adresse getAdresseDesKunden() {
		return adresseDesKunden;
	}
	public void setAdresseDesKunden(Adresse adresseDesKunden) {
		this.adresseDesKunden = adresseDesKunden;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Sachbearbeiter getSachbearbeiter() {
		return sachbearbeiter;
	}
	public void setSachbearbeiter(Sachbearbeiter sachbearbeiter) {
		this.sachbearbeiter = sachbearbeiter;
	}
	
	
}