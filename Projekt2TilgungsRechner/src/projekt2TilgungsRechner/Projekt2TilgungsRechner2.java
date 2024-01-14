package projekt2TilgungsRechner;

import java.util.Scanner;

public class Projekt2TilgungsRechner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean eingabe=true;
        
        
        while(eingabe=true) {
        
        
        
        
        double jahresZinsen = 0;
        double jahresRate = 0;
        double jahresTilgung = 0;
        int jahr = 1;
        
        System.out.print("Darlehensbetrag: ");
        double darlehensBetrag = scanner.nextDouble();
        double restschuld = darlehensBetrag;  
        

        do {
        	
        	
            
        	if((10000<= darlehensBetrag) &&  (darlehensBetrag<30000)) {
        	//System.out.print("Zinssatz: ");
            double zinsSatz = 2;
            //System.out.print("Tilgungssatz: ");
            double tilgungsSatz =10;
            
            
            jahresRate = darlehensBetrag * (zinsSatz + tilgungsSatz) / 100.0;
            jahresZinsen = restschuld * zinsSatz / 100.0;
            jahresTilgung = jahresRate - jahresZinsen;
            restschuld -= jahresTilgung;
            
            if(jahresTilgung>restschuld) {
            	restschuld=0;
            }
            	
            System.out.println("Jahr " + jahr + ":");
            System.out.println("jahreszinsen: " + jahresZinsen);
            System.out.println("jahrestilgung: " + jahresTilgung);
            System.out.println("Restschuld: " + restschuld);
            System.out.println();

           jahr++;
        }
        	else if((30000<= darlehensBetrag))  {
        		//System.out.print("Zinssatz: ");
                double zinsSatz = 3.5;
                //System.out.print("Tilgungssatz: ");
                double tilgungsSatz =2;
                
			    jahresZinsen = restschuld * zinsSatz / 100.0;
	            jahresRate = darlehensBetrag * (zinsSatz + tilgungsSatz) / 100.0;
	            jahresTilgung = jahresRate - jahresZinsen;
	            restschuld -= jahresTilgung;
	           
	            if(jahresTilgung>restschuld) {
	            	restschuld=0;
	            }

	            // Ausgabe
	            System.out.println("Jahr " + jahr + ":");
	            System.out.println("jahreszinsen: " + jahresZinsen);
	            System.out.println("jahrestilgung: " + jahresTilgung);
	            System.out.println("Restschuld: " + restschuld);
	            System.out.println();

	            jahr++;
	        }
			
			else {
				System.out.println("Sie benötigen die neuen Werte ab 10000€ ");
				break;
			}
			
        } while (restschuld > 0);

          
        System.out.print("Möchten Sie nochmal rechnen? Ja=>1 : ");
        
        int antwort=scanner.nextInt();
        if(antwort==1) {
        	//System.out.println("Ich bin immer dabei");
        	continue;
        }
        else {
        	System.out.println("Bis zum nächsten Jahr");
        	break;
        }
    }
}}
