package teil03;
import java.util.Scanner;
/**
 * Mein class
 */
public class Aufgabe04 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int mitarbeiterAnzahl = 4;
	        String[] namen = new String[mitarbeiterAnzahl];
	        double[] gehaelter = new double[mitarbeiterAnzahl];

	        // Namen und Gehälter der Mitarbeiter von der Tastatur einlesen
	        for (int i = 0; i < mitarbeiterAnzahl; i++) {
	            System.out.print("Geben Sie den Namen des Mitarbeiters " + (i + 1) + " ein: ");
	            namen[i] = scanner.next();
	            scanner.nextLine();
	            System.out.print("Geben Sie das Gehalt des Mitarbeiters " + (i + 1) + " ein: ");
	            gehaelter[i] = scanner.nextDouble();
	            scanner.nextLine();
	        }

	        // Bestverdienende Mitarbeiter finden
	        
	        double maxGehalt = gehaelter[0];
	        int[] bestverdienerIndices = new int[mitarbeiterAnzahl];
	        int bestverdienerCount = 0;

	        for (int i = 1; i < mitarbeiterAnzahl; i++) {
	            if (gehaelter[i] > maxGehalt) {
	                maxGehalt = gehaelter[i];
	                bestverdienerIndices[0] = i;
	                bestverdienerCount = 1;
	                // Informationen zum bestverdienenden Mitarbeiter ausgeben
	    	        
	    	       System.out.println("Der bestverdienende Mitarbeiter ist:");
	    	       System.out.println("Name: " + namen[bestverdienerIndices[i]]);
	    	       System.out.println("Gehalt: " + gehaelter[bestverdienerIndices[i]]);
	                
	            } else if (gehaelter[i] == maxGehalt) {
	                bestverdienerIndices[bestverdienerCount] = i;
	                bestverdienerCount++;
	                for (int j = 0; j < bestverdienerCount; j++) {
	    	        	System.out.println("Die bestverdienenden Mitarbeiter sind:");
	    	            System.out.println("Name: " + namen[bestverdienerIndices[i]]);
	    	            System.out.println("Gehalt: " + gehaelter[bestverdienerIndices[i]]);
	    	            System.out.println();
	    	        } 
	            }
	       

	        // Informationen zum bestverdienenden Mitarbeiter ausgeben
	        
	       
	       }

	        scanner.close();
	    }
	}
