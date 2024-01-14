import java.util.Scanner;

public class Buchungsbestätigung {
	static Scanner scanner=new Scanner(System.in);
	int buchungsnummer;
	String datum;
	Kunde kunde;
	Buchung buchung;
	
	public Buchungsbestätigung(int buchungsnummer, String datum, Kunde kunde, Buchung buchung) {
		super();
		this.buchungsnummer = buchungsnummer;
		this.datum = datum;
		this.kunde = kunde;
		this.buchung = buchung;
	
	}
	public Buchungsbestätigung() {
		// TODO Auto-generated constructor stub
	}
	public String buchungsBestätigung() {
		System.out.print("Buchungsnummer:");
		int buchungsnummer=scanner.nextInt();
		scanner.nextLine();
		String datum=scanner.nextLine();
	
	return buchungsnummer+" \n"+datum;
}}
