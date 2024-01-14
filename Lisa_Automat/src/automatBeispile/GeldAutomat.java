package automatBeispile;

import java.util.Scanner;

public class GeldAutomat {
			  public static void main(String[] args) {
			    // Geldkarte einlesen
			    
			    Scanner scanner = new Scanner(System.in);
			    System.out.println("Bitte legen Sie Ihre Geldkarte ein.");
			    System.out.print("Bitte geben Sie Ihr Passtword ein:");
			    String pin = scanner.nextLine();
			    int fehlversuche=0;
			    // PIN prüfen
			    if (pin.equals("1234")) {
			      // PIN ist richtig
			      System.out.println("PIN ist richtig.");
			      // Geldbetrag wählen
			      System.out.println("Welchen Betrag möchten Sie abheben?");
			      double betrag = scanner.nextDouble();
			      // Geld auszahlen
			      System.out.println("Hier ist Ihr Geld: " + betrag);
			    } else {
			      // PIN ist falsch
			      fehlversuche++;
			      System.out.println("PIN ist falsch.");
			      if (fehlversuche == 3) {
			        // Automat sperrt Karte
			        System.out.println("Karte gesperrt.");
			      } else {
			        // PIN erneut eingeben
			        System.out.println("Bitte geben Sie die PIN erneut ein.");
			      }
			    }
			  }
}