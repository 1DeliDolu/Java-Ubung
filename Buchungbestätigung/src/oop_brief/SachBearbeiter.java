package oop_brief;

import java.util.Arrays;

public class SachBearbeiter {
	
	String name;
	String telefonnummer;
	String email;
	SachBearbeiter[] kunden = new SachBearbeiter[10];
	
	
	
	@Override
	public String toString() {
		return "SachBearbeiter [name=" + name + ", telefonnummer=" + telefonnummer + ", email=" + email + ", kunden="
				+ Arrays.toString(kunden) + "]";
	}



	/**
	 * @param name
	 * @param telefonnummer
	 * @param email
	 * @param kunden
	 */
	public SachBearbeiter(/*String name, String telefonnummer, String email, SachBearbeiter[] kunden*/) {
		super();
		this.name = name;
		this.telefonnummer = telefonnummer;
		this.email = email;
		this.kunden = kunden;
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
	 * @return the telefonnummer
	 */
	public String getTelefonnummer() {
		return telefonnummer;
	}



	/**
	 * @param telefonnummer the telefonnummer to set
	 */
	public void setTelefonnummer(String telefonnummer) {
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
	 * @return the kunden
	 */
	public SachBearbeiter[] getKunden() {
		return kunden;
	}



	/**
	 * @param kunden the kunden to set
	 */
	public void setKunden(SachBearbeiter[] kunden) {
		this.kunden = kunden;
	}
	
	
	

}
