import java.util.Scanner;

public class Sachbearbeiter {
	static Scanner scanner=new Scanner(System.in);
	String name;
	String telefonnummer;
	String email;
	public Sachbearbeiter(String name, String telefonnummer, String email) {
		super();
		this.name = name;
		this.telefonnummer = telefonnummer;
		this.email = email;
	}
	public static String sachbearbeiter() {
	    System.out.println("Name des Sachbearbeters:");
	    String name = scanner.nextLine();
	    System.out.println("Telefonnummer des Sachbearbeters:");
	    String telefonnummer = scanner.nextLine();
	    System.out.println("Email des Sachbearbeters:");
	    String email = scanner.nextLine();
	    System.out.println("Nummer des Kundes:");
	    Kunde k = new Kunde();
	    k.kundennummer = scanner.nextInt();
	    return k.kundennummer + "\n" + name + "\n" + telefonnummer + "\n" + email;
	}
}
