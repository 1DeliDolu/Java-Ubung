package AufgabeTeil2B;

public class Aufgabe03 {

	    // Instanzvariable
	    private int zaehlerInstanz;

	    // Klassenvariable
	    private static int zaehlerKlasse;

	    
	    public Aufgabe03() {
	       
	        erhoeheZaehlerInstanz();
	        erhoeheZaehlerKlasse();
	    }

	   
	    public int getZaehlerInstanz() {
	        return zaehlerInstanz;
	    }

	   
	    public static int getZaehlerKlasse() {
	        return zaehlerKlasse;
	    }

	   
	    public void erhoeheZaehlerInstanz() {
	        zaehlerInstanz++;
	    }

	   
	    public static void erhoeheZaehlerKlasse() {
	        zaehlerKlasse++;
	    }

	
	    public int zaehleInstanz() {
	        return getZaehlerInstanz();
	    }

	   
	    public static int zaehleKlasse() {
	        return getZaehlerKlasse();
	    }

	    
	    public static void main(String[] args) {
	        
	    	Aufgabe03 zaehlerEins = new Aufgabe03();
	    	Aufgabe03 zaehlerZwei = new Aufgabe03();

	       
	        System.out.println("Rückgabewert zaehleInstanz für zaehlerEins: " + zaehlerEins.zaehleInstanz());
	        System.out.println("Rückgabewert zaehleInstanz für zaehlerZwei: " + zaehlerZwei.zaehleInstanz());

	      
	        System.out.println("Rückgabewert zaehleKlasse: " + Aufgabe03.zaehleKlasse());
	    }
	}
