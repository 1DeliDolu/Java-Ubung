package kalender;

import java.util.Scanner;

public class GregorianischenKalenders {

	public static void gregorianischenKalenders() {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Geben Sie eine Zahl von 1-31 für den jeweiligen Tag an: ");
		int tag =sc.nextInt();
		sc.nextLine();	
		System.out.print("Geben Sie eine Zahl von 1-12 für den jeweiligen Monat an: ");
		int monat=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Geben Sie eine Zahl über 0  für das jeweilige Jahr an: ");
		int jahr = sc.nextInt();
		sc.nextLine();
		
		boolean isSchaltJahr = gregorianischenKalenders(jahr);
		if (monat > 0 && monat <13) {
			
			
		 if ((monat == 1) || (monat == 3) || (monat == 5) || (monat == 8) || (monat == 10) || (monat == 12)) {
           if ((1 <= tag) && (tag <= 31)) {
              System.out.println("Tag :" +tag+" Monat: "+monat+" Jahr: " +jahr +" Datum ist richtig. "+
            		  jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); //return true;
           }
           else {
           	System.out.println("Tag :" +tag+" Monat: "+monat+" Jahr: " +jahr +" Datum ist falsch "+
           			jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); // return false;
          }
		 }
           
        else if ((monat == 4) || (monat == 6) || (monat == 7) || (monat == 9) || (monat == 11)) {
           if ((1 <= tag) && (tag <= 30)) {
        	   System.out.println("Tag: " +tag+", Monat: "+monat+" Jahr: " +jahr +" Datum ist richtig. "+
             		  jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender.");           
        
        }
        else {
        		System.out.println("Tag: " +tag+" Monat: "+monat+" Jahr: " +jahr +" Datum ist falsch "+
        			jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); // return false;
        	}
        }
           else if ((monat == 2) && (jahr % 4 == 0)) {
           if ((1 <= tag) && (tag <= 29)) {
        	   System.out.println("Tag:" +tag+" Monat: "+monat+" Jahr: " +jahr +" Datum ist richtig. "+
             		  jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender.");
           }
           else {
           	System.out.println("Tag: " +tag+", Monat: "+monat+" Jahr: " +jahr +" Datum ist falsch "+
           			jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); // return false;
          }
        }
           
        else if ((monat == 2) && (jahr % 4 != 0)) {
           if ((1 <= tag) && (tag <= 28)) {
        	   System.out.println("Tag: " +tag+", Monat: "+monat+" Jahr: " +jahr +" Datum ist richtig. "+
             		  jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender.");
           }
           else {
           	System.out.println("Tag: " +tag+", Monat: "+monat+" Jahr: " +jahr +" Datum ist falsch "+
           			jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); // return false;
          }
         // return false;
       }
	}
        else {
        	System.out.println("Tag: " +tag+" Monat: "+monat+" Jahr: " +jahr +" Datum ist falsch "+
        			jahr + (isSchaltJahr ? " ist" : " ist nicht") + " ein Schaltjahr im gregorianischen Kalender."); // return false;
       }
    }	
		
	

	private static boolean gregorianischenKalenders(int jahr) {
        return ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0));//jahr %4==0 && jahr %100!=0) || (jahr %400 == 0
        }
}


