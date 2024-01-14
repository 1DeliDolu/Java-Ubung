package restBerechnung;

import java.util.Scanner;

public class RestBerechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eingabe
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Zahl 1: ");
	    int zahl1 = scanner.nextInt();
	    System.out.print("Zahl 2: ");
	    int zahl2 = scanner.nextInt();

	    // Berechnung
	    int n = 0;
	    int r;
	    if (zahl1>zahl2) {
	    r = zahl1;
	    while (r > zahl2) {
	      n++;
	      r -= zahl2;
	    }
	    }	
	    else {
	    	 r = zahl2;
	    	while (r > zahl1) {
	  	      n++;
	  	      r -= zahl1;
	  	    }
	    	
	    }
	    
	    // Ausgabe
	    System.out.println("Anzahl der Subtraktionen: " + n);
	    System.out.println("Rest: " + r);
	}

}
