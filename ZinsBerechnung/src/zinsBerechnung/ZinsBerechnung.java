package zinsBerechnung;

import java.util.Scanner;

public class ZinsBerechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
		// Startkapital vom Konsol
		System.out.print("Bitte gebe das Startkapital  ein: ");
	    double startKapital = scanner.nextDouble();
	    // Zinssatz vom Konsol
	    System.out.print("Bitte gebe den Zinssatz  ein: ");
	    double zinsSatz = scanner.nextDouble();
	    
	    // Laufzeit vom Konsol
	    System.out.print("Bitte gebe die Laufzeit  ein: ");
	    int laufZeit = scanner.nextInt();

	    // Berechnung
	    double endkapital = 0;
	    for (int i = 0; i < laufZeit; i++) {
	      endkapital += startKapital * zinsSatz;
	    }

	    // Ausgabe
	    System.out.println("Endkapital: " + endkapital);
	}

}