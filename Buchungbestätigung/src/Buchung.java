
import java.util.Scanner;
public class Buchung {
	static Scanner scanner=new Scanner(System.in);
	Standort standort;
	String mietzeitraum;
	String ressourcen;

    public Buchung(Standort standort, String mietzeitraum, String ressourcen) {
        super();
        this.standort = standort;
        this.mietzeitraum = mietzeitraum;
        this.ressourcen = ressourcen;
    }
    public String buchung() {
        Standort s = new Standort();
        this.standort = s.stadt; // Use the class field directly
        System.out.print("Mietzeitraum:");
        this.mietzeitraum = scanner.nextLine();
        this.ressourcen=scanner.nextLine();
        return standort + " " + mietzeitraum + " " + ressourcen;
    }
}
