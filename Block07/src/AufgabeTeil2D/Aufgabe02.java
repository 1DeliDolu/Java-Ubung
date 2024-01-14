package AufgabeTeil2D;


	public class Aufgabe02 {
	    private static int mindScheine = 4; 

	    private String name;
	    private int matrikelNr;
	    private int scheinAnzahl;
	    private static int laufendeNummer=0;
	    

	    
	    public Aufgabe02(String name) {
	        this.name = name;
	        this.matrikelNr = generiereMatrikelNr();
	        this.scheinAnzahl = 0;
	    }

	    
	    private int generiereMatrikelNr() {
	    	laufendeNummer++;
	        return laufendeNummer; 
	    }

	    
	    public int getMatrikelNr() {
	        return matrikelNr;
	    }

	   
	    public int getScheinAnzahl() {
	        return scheinAnzahl;
	    }

	    
	    public void addScheine(int anzahl) {
	        if (anzahl > 0) {
	            scheinAnzahl += anzahl;
	            //System.out.println(name + " hat " + anzahl + " neue Scheine erhalten.");
	        } else {
	            System.out.println("Ungültige Anzahl von Scheinen.");
	        }
	    }

	  
	    public static void setMindScheine(int anzahl) {
	        if (anzahl > 0) {
	            mindScheine = anzahl;
	            //System.out.println("Die Anzahl der notwendigen Scheine für die Prüfungszulassung wurde auf " + anzahl + " gesetzt.");
	        } else {
	            System.out.println("Ungültige Anzahl von notwendigen Scheinen.");
	        }
	    }

	    
	    public boolean testeZulassung() {
	        return (scheinAnzahl >= mindScheine)? true:false;
	    }

	   
	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", matrikelNr=" + matrikelNr +
	                ", scheinAnzahl=" + scheinAnzahl +
	                ", testeZulassung="+ testeZulassung()+'}';
	    }

	
	   
	}
