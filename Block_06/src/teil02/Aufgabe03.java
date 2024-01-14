package teil02;
import java.util.Scanner;

public class Aufgabe03 {
	

		    public static void main(String[] args) {
	        
		    	
		    // Schritt 1: Benutzer auffordern, die Anzahl der Zahlen einzugeben
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Geben Sie die Anzahl der Zahlen ein, die Sie eingeben möchten: ");
	        int anzahl = scanner.nextInt();

	        // Schritt 2: Ein Array deklarieren, um die eingegebenen Zahlen zu speichern
	        int[] zahlenArray = new int[anzahl];

	        // Schritt 3-6: Zahlen vom Benutzer einlesen und im Array speichern
	        for (int i = 0; i < anzahl; i++) {
	            System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
	            zahlenArray[i] = scanner.nextInt();
	        }

	        // Schritt 7-9: Alle Zahlen auf der Konsole ausgeben
	        System.out.print("Sie haben folgende Zahlen eingegeben: ");
	        for (int i = 0; i < anzahl; i++) {
	            System.out.print(zahlenArray[i]);
	            if (i < anzahl - 1) {
	                System.out.print(", ");
	            }
	        }

	        // Scanner schließen
	        scanner.close();
	    }
}
