import java.util.Scanner;

public class GeldAusZahlen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bereit = true;
        int fehlversuche = 0;

        do {
            // Geldkarte einlesen
            System.out.println("Bitte legen Sie Ihre Geldkarte ein.");
            System.out.print("Bitte drücken Sie das Passwort: ");

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
                System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                int eingabe = scanner.nextInt();
                

                // Geld auszahlen
                double betrag = 0.0;
                double saldo = 1000.0;
                boolean aktion = true;

                while (aktion) {
                    if (0 < eingabe && eingabe < 5) {
                        if (eingabe == 1) {
                            System.out.print("Der Betrag, den Sie einzahlen möchten: ");
                            betrag = scanner.nextDouble();
                            saldo += betrag;
                            System.out.println("Hier ist der aktuelle Saldo: " + saldo);
                           System.out.print("Möchten Sie den Automaten ausschalten? Antwort ja: 1 oder nein: 2: ");
                            int antwort = scanner.nextInt();
                            if (antwort == 2) {
                                System.out.println("Gerne bin ich hier");
                                System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                                eingabe = scanner.nextInt();
                            } else {
                            	System.out.println("Tschüss und bitte vergessen Sie Ihre Karte nicht");
                                break;
                            }
                            
                        } else if (eingabe == 2) {
                            System.out.print("Der Betrag, den Sie abheben möchten: ");
                            betrag = scanner.nextDouble();
                            if (betrag > saldo) {
                                System.out.println("Sie können maximal " + saldo + "€ abheben");
                            } else {
                                saldo -= betrag;
                                System.out.println("Hier ist der Saldo: " + saldo);
                                System.out.println("Hier ist der Betrag: " + betrag);
                                System.out.print("Möchten Sie den Automaten ausschalten? Antwort ja: 1 oder nein: 2: ");
                                int antwort = scanner.nextInt();
                                if (antwort == 2) {
                                    System.out.println("Gerne bin ich hier");
                                    System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                                    eingabe = scanner.nextInt();
                                } else {
                                	System.out.println("Tschüss und bitte vergessen Sie Ihre Karte nicht");
                                    break;
                                }
                            }
                        } else if (eingabe == 3) {
                            System.out.print("Der Saldo ist " + saldo + " € ");
                            System.out.print("Möchten Sie den Automaten ausschalten? Antwort ja: 1 oder nein: 2: ");
                            int antwort = scanner.nextInt();
                            if (antwort == 2) {
                                System.out.println("Gerne bin ich hier");
                                System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                                eingabe = scanner.nextInt();
                            } else {
                            	System.out.println("Tschüss und bitte vergessen Sie Ihre Karte nicht");
                                break;
                            }
                        } else if (eingabe == 4) {
                            System.out.println("Wir möchten Sie als Kunden nochmals begrüßen.");
                            bereit = false;
                            aktion = false;
                        }
                    
                    
                    } else {
                        System.out.print("\nBitte geben Sie von 1 bis 4 ein. Wenn  Sie den Automaten ausschalten möchten ? Antwort ja: 1 oder nein: 2: ");
                        int antwort = scanner.nextInt();
                        if (antwort == 2) {
                        	
                        	System.out.println("1-) Einzahlen");
                            System.out.println("2-) Geld abheben");
                            System.out.println("3-) Auszüge");
                            System.out.println("4-) Exit");
                            System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                            eingabe = scanner.nextInt();
                            continue;
                        } else {
                        	System.out.println("Tschüss und bitte vergessen Sie Ihre Karte nicht");
                        	bereit = false;
                            aktion = false;
                        }
                    }
                    
                    //code sparren
                    /*
                     System.out.print("Möchten Sie den Automaten ausschalten? Antwort ja: 1 oder nein: 2: ");
                           int antwort = scanner.nextInt();
                           if (antwort == 2) {
                           System.out.println("Gerne bin ich hier");
                           System.out.print("Wählen Sie die Aktion aus, die Sie ausführen möchten: ");
                           eingabe = scanner.nextInt();
                           } else {
                           System.out.println("Tschüss");
                           break;
                           }
                      */
                }
                break;
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
        } while (bereit);

        
    }
}
