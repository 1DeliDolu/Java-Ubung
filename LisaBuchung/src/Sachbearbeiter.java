import java.util.Arrays;

public class Sachbearbeiter {

	String name;
	String telefonnummer;
	String email;
	//Kunde[] kunden = new Kunde[10];
	/**
	 * @param name
	 * @param telefonnummer
	 * @param email
	 * @param kunden
	 */
	
	
	public Sachbearbeiter(String name, String telefonnummer, String email) {
		super();
		this.name = name;
		this.telefonnummer = telefonnummer;
		this.email = email;
		//this.kunden = kunden;
	}
	@Override
	public String toString() {
		return "Sachbearbeiter [name=" + name + ", telefonnummer=" + telefonnummer + ", email=" + email +/* ", kunden="
				+ /*Arrays.toString(kunden) +*/ "]";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
//	public Kunde[] getKunden() {
//		return kunden;
//	}
//	public void setKunden(Kunde[] kunden) {
//		this.kunden = kunden;
//	}
//	
	
	
}
