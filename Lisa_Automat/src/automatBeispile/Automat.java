package automatBeispile;

import java.util.Scanner;

public class Automat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean bereit = true;
		int fehlversuche = 0;

		while (bereit) {
			
			// Geldkarte einlesen
			System.out.println("Bitte legen Sie Ihre Geldkarte ein.");
			System.out.print("Bitte tippen Sie das Passwort: ");
			String pin = scanner.nextLine();

			// PIN prüfen
			do {
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
					boolean aktion = true;
					double betrag = 0.0;
					double Saldo = 1000.0;
				
					while(aktion){
				    	
					    if (0<Eingabe && Eingabe< 5) {
						  
					    if (Eingabe==1) {
						    System.out.print("Der Betrag, den Sie einzahlen möchten:");
						    betrag =scanner.nextDouble();
						    Saldo += betrag;
						    System.out.println("Hier ist der aktulle Saldo: " + Saldo);
						    break;
						    }
					    else if(Eingabe==2) {
						    System.out.print("Der Betrag, den Sie abheben möchten:");
						    betrag = scanner.nextInt();
						    if(betrag > Saldo) {
						    System.out.println("Sie können maximum "+ Saldo+"€ abheben");
						    break;
						   } 
						        	
				    		else {
					        Saldo -= betrag;
					        System.out.println("Hier ist der Saldo: " + Saldo);
					        System.out.println("Hier ist der Betrag: " + betrag);
					        break;
				    		}
						   
				            }
					    	else if(Eingabe==3) {
							System.out.print("Der Saldo ist " +Saldo+" €");
							break;      	
							}
				            
					    	else if(Eingabe ==4) {
						    System.out.println("Wir möchten Sie als Kunden nochmal begrüßen");
						    break;
						    }
					    
				      } else {
				    	  				      
				    	  System.out.print("Möchten Sie Ihre Karte herausnehmen? Ja/Nein");
				    	  String antwort=scanner.nextLine();
				    	  if(antwort.equals("ja")) {
				    		  continue;
				    		  
				    	  }
				    	  else break;
				      }
					
					} //if (0<Eingabe && Eingabe< 5)
					break;

				} else {
					// PIN ist falsch
				fehlversuche++;
				System.out.print("Bitte tippen Sie nochmal das Passwort: ");
				pin = scanner.nextLine();
				}		
			} 
			while (fehlversuche <= 3);
			
			 if(fehlversuche == 3) {
		          // Automat sperrt Karte
		          System.out.println("Karte gesperrt.");
		          System.out.println("Automat wirf dich raus: Automat ist aus");
		          bereit = false;
		        } 
		       
			
		
	}

}
}		
	
