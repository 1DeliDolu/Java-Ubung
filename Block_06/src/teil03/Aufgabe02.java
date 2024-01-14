package teil03;
import java.util.Scanner;
public class Aufgabe02 {

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Geben Sie die Anzahl der Zahlen ein: ");
	        int anzahl = scanner.nextInt();

	        
	        // Array für die Eingabe von ganzen Zahlen erstellen
	        int[] zahlen = new int[anzahl];

	        
	        // Zahlen von der Tastatur einlesen und im Array speichern
	        for (int i = 0; i < zahlen.length; i++) {
	            System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
	            zahlen[i] = scanner.nextInt();
	            scanner.nextLine();	        }

	        // Mittelwert der Zahlen an den geraden Positionen berechnen
	        double summe = 0;
	        int anzahlGeradePositionen = 0;

	        for (int i = 0; i < zahlen.length; i += 2) {
	            summe += zahlen[i];
	            anzahlGeradePositionen++;
	        }

	        // Mittelwert berechnen und ausgeben
	        if (anzahlGeradePositionen > 0) {
	            double mittelwert = summe / anzahlGeradePositionen;
	            System.out.println("Mittelwert der Zahlen an den geraden Positionen: " + mittelwert);
	        } else {
	            System.out.println("Keine Zahlen an den geraden Positionen eingegeben.");
	        }

	        scanner.close();
	    }
	}
