package geldAutomat;
import java.util.Scanner;
public class geldAutomat {

	public static void main(String[] args) {
		// TODO Auto-.truegenerated method stub
		boolean bereit=true;
		int fehlversuche=0;
		while (bereit) {
		      // Geldkarte einlesen
			
		      System.out.println("Bitte legen Sie Ihre Geldkarte ein.");
		      Scanner scanner = new Scanner(System.in);
		      System.out.print("Bitte tippen Sie das Passwort: ");
		      String pin = scanner.nextLine();

		      // PIN prüfen
		      if (pin.equals("1234")) {
		        // PIN ist richtig
		        System.out.println("PIN ist richtig.");
		        // Geldbetrag wählen
		        
		        System.out.println("1-) Einzahlen");
		        System.out.println("2-) Geld abheben");
		        System.out.println("3-) Query Balance");
			    System.out.println("4-) Exit");
			    System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten:");
			    int Eingabe = scanner.nextInt();
			    // Geld auszahlen
			    double betrag=scanner.nextDouble();
			    double Saldo=scanner.nextDouble();
			    if (Eingabe==1) {
				    System.out.print("Der Betrag, den Sie einzahlen möchten:");
				    betrag = scanner.nextInt();
				    Saldo += betrag;
				    System.out.println("Hier ist der aktulle Saldo: " + Saldo);
				        	
				    }
			    else if(Eingabe ==2) {
				    System.out.print("Der Betrag, den Sie abheben möchten:");
				    betrag = scanner.nextInt();
				    if(betrag > Saldo) {
				    System.out.println("Sie können maximum "+ Saldo+"€ abheben");
			        					        		} 
				        	
		    		else {
			        Saldo -= betrag;
			        System.out.println("Hier ist der Saldo: " + Saldo);
			        System.out.println("Hier ist der Betrag: " + betrag);
				    }
		            }
			    else if(Eingabe ==3) {
					System.out.print("Der Saldo ist " +Saldo+" €");
					        	
				    }
		            else if(Eingabe ==4) {
				    System.out.println("Wir möchten Sie als Kunden nochmal begrüßen");
				    break;}
			    
			    
			    
			    
			    System.out.println("Hier ist Ihr Geld: " + betrag);
		      } else {
		        // PIN ist falsch
		        fehlversuche++;
		        System.out.println("PIN ist falsch.");
		        if (fehlversuche == 3) {
		          // Automat sperrt Karte
		          bereit = false;
		          System.out.println("Karte gesperrt.");
		        } else {
		          // PIN erneut eingeben
		          System.out.println("Bitte geben Sie die PIN erneut ein.");
		        }
		      }
		    }
	}

}
