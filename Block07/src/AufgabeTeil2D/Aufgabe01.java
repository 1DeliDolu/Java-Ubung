package AufgabeTeil2D;

public class Aufgabe01 {

	    private String bezeichnung;
	    private double einkaufspreis;
	    private double verkaufspreis;
	    private int naehrwert;

	    
	    public Aufgabe01(String bezeichnung, double einkaufspreis, int naehrwert) {
	        this.bezeichnung = bezeichnung;
	        this.einkaufspreis = einkaufspreis;
	        this.verkaufspreis = berechneVerkaufspreis(einkaufspreis);
	        this.naehrwert = naehrwert;
	    }

	  
	    private double berechneVerkaufspreis(double einkaufspreis) {
	        return einkaufspreis * 2.0; 
	    }

	   
	    public String getBezeichnung() {
	        return bezeichnung;
	    }

	    public double getEinkaufspreis() {
	        return einkaufspreis;
	    }

	    public double getVerkaufspreis() {
	        return verkaufspreis;
	    }

	    public int getNaehrwert() {
	        return naehrwert;
	    }

	   
	    public void aufpeppen() {
	        System.out.println("Die " + bezeichnung + " wurde aufgepeppt!");
	    }

	 
	    @Override
	    public String toString() {
	        return "Obst{" +
	                "bezeichnung='" + bezeichnung + '\'' +
	                ", einkaufspreis=" + einkaufspreis +
	                ", verkaufspreis=" + verkaufspreis +
	                ", naehrwert=" + naehrwert +
	                '}';
	    }

	   
	    public static void main(String[] args) {
	    	Aufgabe01 apfel = new Aufgabe01("Apfel", 1.0, 52);
	    	Aufgabe01 birne = new Aufgabe01("Birne", 1.5, 57);
	    	Aufgabe01 kirsche = new Aufgabe01("Kirsche", 2.5, 61);

	        System.out.println(apfel);
	        System.out.println(birne);
	        System.out.println(kirsche);

	        /*apfel.aufpeppen();
	        birne.aufpeppen();
	        kirsche.aufpeppen();*/
	    }
	}
