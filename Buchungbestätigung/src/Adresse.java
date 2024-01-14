import java.util.Scanner;

public class Adresse {
    static Scanner scanner = new Scanner(System.in);
    String strassenname;
    int hausnummer;
    String plz;
    String stadt;

    public Adresse(String strassenname, int hausnummer, String plz, String stadt) {
        this.strassenname = strassenname;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
    }

    public Adresse() {
        // TODO Auto-generated constructor stub
    }

    public Adresse adresse() {
        System.out.print("Strassenname:");
        this.strassenname = scanner.nextLine();
        System.out.print("Hausnummer:");
        this.hausnummer = scanner.nextInt();
        scanner.nextLine();
        System.out.print("PLZ:");
        this.plz = scanner.nextLine();
        System.out.print("Stadt:");
        this.stadt = scanner.nextLine();
        
        // Create a new Adresse object and set its fields
        Adresse newAdresse = new Adresse(strassenname, hausnummer, plz, stadt);
        
        return newAdresse;
    }
}
