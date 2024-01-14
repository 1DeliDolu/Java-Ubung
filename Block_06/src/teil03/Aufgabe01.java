package teil03;

import java.util.Scanner;

public class Aufgabe01 {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array für die Eingabe von 10 Ganzzahlen erstellen
	        System.out.print("Bitte stellen Sie die Länge von Array fest: ");
	        int arrayLength=scanner.nextInt();
	        scanner.nextLine();
	        // int[] zahlen = new int[10];
	        int[] zahlen = new int[arrayLength];

	        // Zahlen von der Tastatur einlesen und im Array speichern
	        for (int i = 0; i < zahlen.length; i++) {
	            System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
	            zahlen[i] = scanner.nextInt();
	        }

	        // Mittelwert der positiven und negativen Werte berechnen
	        double summePositiv = 0;
	        int anzahlPositiv = 0;
	        double summeNegativ = 0;
	        int anzahlNegativ = 0;

	        for (int zahl : zahlen) {
	            if (zahl > 0) {
	                summePositiv += zahl;
	                anzahlPositiv++;
	            } else if (zahl < 0) {
	                summeNegativ += zahl;
	                anzahlNegativ++;
	            }
	        }

	        // Mittelwert berechnen und ausgeben
	        if (anzahlPositiv > 0) {
	            double mittelwertPositiv = summePositiv / anzahlPositiv;
	            System.out.println("Mittelwert der positiven Zahlen: " + mittelwertPositiv);
	        } else {
	            System.out.println("Keine positiven Zahlen eingegeben.");
	        }

	        if (anzahlNegativ > 0) {
	            double mittelwertNegativ = summeNegativ / anzahlNegativ;
	            System.out.println("Mittelwert der negativen Zahlen: " + mittelwertNegativ);
	        } else {
	            System.out.println("Keine negativen Zahlen eingegeben.");
	        }

	        scanner.close();
	    }
	}