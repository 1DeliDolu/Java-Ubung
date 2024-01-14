import java.util.Scanner;

public class Kunde {
	static Scanner scanner=new Scanner(System.in);
	String name;
	int kundennummer;
	Adresse adresseDesKunden;
	String telefonnummer;
	String email;
	Sachbearbeiter sachbearbeiter;
	public Kunde(String name, String telefonnummer, int kundennummer, Adresse adresseDesKunden, String email, Sachbearbeiter sachbearbeiter) {
		super();
		this.name = name;
		this.kundennummer = kundennummer;
		this.adresseDesKunden = adresseDesKunden;
		this.telefonnummer = telefonnummer;
		this.email = email;
		this.sachbearbeiter = sachbearbeiter;
	}


public Kunde() {
		// TODO Auto-generated constructor stub
	}


public String kunde() {
	System.out.println("Kunden Name:");
	this.name=scanner.nextLine();
	System.out.println("Kunden Nummer:");
	//int kundennummer=scanner.nextInt();
	//scanner.nextLine();
	Adresse a= new Adresse();
	this.adresseDesKunden=a.adresse();
	System.out.println("Kunden Telefonnummer:");
	this.telefonnummer=scanner.nextLine();
	scanner.nextLine();
	System.out.println("Kunden Email:");
	this.email=scanner.nextLine();
	
	return name+" \n"+adresseDesKunden+" \n"+telefonnummer+" \n"+email;
}
	
}
