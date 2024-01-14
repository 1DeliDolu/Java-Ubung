package teil03;
import java.util.Scanner;

public class Aufgab04_01 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int mitarbeiterAnzahl = 4;
	        String[] namen = new String[mitarbeiterAnzahl];
	        double[] gehaelter = new double[mitarbeiterAnzahl];

	        // Namen und Gehälter der Mitarbeiter von der Tastatur einlesen
	        
	        for (int i = 0; i < mitarbeiterAnzahl; i++) {
	            System.out.print("Geben Sie den Namen des Mitarbeiters " + (i + 1) + " ein: ");
	            namen[i] = scanner.next();
	            System.out.print("Geben Sie das Gehalt des Mitarbeiters " + (i + 1) + " ein: ");
	            gehaelter[i] = scanner.nextDouble();
	        }

	        // Bestverdienenden Mitarbeiter finden
	        
	        int bestverdienerIndex = 0;
	        for (int i = 1; i < mitarbeiterAnzahl; i++) {
	            if (gehaelter[i] > gehaelter[bestverdienerIndex]) {
	                bestverdienerIndex = i;
	            }
	        }

	        // Informationen zum bestverdienenden Mitarbeiter ausgeben
	        
	        System.out.println("Der bestverdienende Mitarbeiter ist:");
	        System.out.println("Name: " + namen[bestverdienerIndex]);
	        System.out.println("Gehalt: " + gehaelter[bestverdienerIndex]);

	        scanner.close();
	    }
	}
