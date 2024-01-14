package divideBy5;

import java.util.Scanner;

public class DivideBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eingabe der Zahl
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Bitte gebe eine Zahl ein: ");
	    int number = scanner.nextInt();

	    // Berechnung der Anzahl der Divisionen
	    int numberOfDivisions= 0;
	    while (number % 5 == 0) {
	      number/=5;
	    	numberOfDivisions++;
	   // Ausgabe der Anzahl
		    System.out.println("Die Zahl kann " + numberOfDivisions + " mal durch 5 geteilt werden.");
		  
		}
	    
	 // Eingabe der Zahl (mit  for Schleife)
	    // Berechnung der Anzahl der Divisionen
	    int numberOfDivisionss= 0;
	    for (int l = number; l > 0; l /= 5) {
	      numberOfDivisionss++;
	    }

	    // Ausgabe der Anzahl
	    System.out.println("Die Zahl- kann " + numberOfDivisionss + " mal durch 5 geteilt werden.");
	  

	    }

}
