package projekt2TilgungsRechner;

import java.util.Scanner;

public class Projekt2TilgungsRechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jahreszinsen = 0;
        double jahresrate = 0;
        double jahrestilgung = 0;
        int jahr = 1;
        System.out.print("Zinssatz: ");
        double zinsSatz = scanner.nextDouble();
        System.out.print("Tilgungssatz: ");
        double tilgungsSatz = scanner.nextDouble();
        System.out.print("Darlehensbetrag: ");
        double darlehensBetrag = scanner.nextDouble();
        double restschuld = darlehensBetrag;

        do {
        	if((zinsSatz==2) &&( tilgungsSatz==10) && (10000<= darlehensBetrag) &&  (darlehensBetrag<30000)) {
        		
        	
            jahresrate = darlehensBetrag * (zinsSatz + tilgungsSatz) / 100.0;
            jahreszinsen = restschuld * zinsSatz / 100.0;
            jahrestilgung = jahresrate - jahreszinsen;
            // Ausgabe
            System.out.println("Jahr " + jahr + ":");
            System.out.println("Jahreszinsen: " + jahreszinsen);
            System.out.println("Jahrestilgung: " + jahrestilgung);
            System.out.println("Restschuld: " + restschuld);
            System.out.println();
            //restschuld rechnen
            restschuld -= jahrestilgung;

            jahr++;
        }
        	else if((zinsSatz==3.5) && ( tilgungsSatz==2) && (30000<= darlehensBetrag))  {
			    jahreszinsen = restschuld * zinsSatz / 100.0;
	            jahresrate = darlehensBetrag * (zinsSatz + tilgungsSatz) / 100.0;
	            jahrestilgung = jahresrate - jahreszinsen;

	            restschuld -= jahrestilgung;

	            // Ausgabe
	            System.out.println("Jahr " + jahr + ":");
	            System.out.println("Jahreszinsen: " + jahreszinsen);
	            System.out.println("Jahrestilgung: " + jahrestilgung);
	            System.out.println("Restschuld: " + restschuld);
	            System.out.println();
	            // jahr addieren
	            jahr++;
	        }
			
			else System.out.println("Sie benötigen die neue Werte ");
			
        } while (restschuld > 0);

        scanner.close();
    }
}