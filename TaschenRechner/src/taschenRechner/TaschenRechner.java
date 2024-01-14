package taschenRechner;

import java.util.Scanner;

public class TaschenRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eingabe
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Erste Zahl: ");
	    double zahl1 = scanner.nextDouble();
	    System.out.print("Bitte gebe eine Operationzahl('+' => 1 ,'-' => 2  ,'*' => 3  oder '/' => 4) ein: ");
	    int op = scanner.nextInt();
	    //String op=equals(ope);
	    System.out.print("Zweite Zahl: ");
	    double ergebnis = 0;
	    double zahl2 = scanner.nextDouble();
	    
		    switch (op) {
		      case 1:
		        ergebnis = zahl1 + zahl2;
		        break;
		      case 2:
		        ergebnis = zahl1 - zahl2;
		        break;
		      case 3:
		        ergebnis = zahl1 * zahl2;
		        break;
		      case 4:
		        ergebnis = zahl1 / zahl2;
		        break;
		    }
		// Ausgabe
	    System.out.println("Ergebnis: " + ergebnis);

	    // Wiederholungsabfrage
	    System.out.print("Drücke bitte 9,um nochmal zu rechnen oder 0 zum Ende : ");
	    int wiederholung = scanner.nextInt();

	    if (wiederholung == 0) {
	      System.out.println("Programm beendet.");
	    } else {
	      main(args);
	    }
	}

}
