package AufgabeTeil3;

public class Aufgabe01 {
	 private String inhaber;
	    private double kontoStand;

	    
	    public Aufgabe01(int neueNummer, String name) {
	        this.inhaber = name;
	        this.kontoStand = 0.0;
	    }

	    
	    public Aufgabe01(int neueNummer, String name, int begrüßungsGeld) {
	        this(neueNummer, name); 
	        einzahlen(begrüßungsGeld);
	    }

	   
	    public Aufgabe01(int neueNummer, String name, Aufgabe01 werber) {
	        this(neueNummer, name, 50);  
	        werber.ueberweisen(this, 50); 
	    }
	 
	    public double getKontoStand() {
	        return kontoStand;
	    }

	    
	    public void einzahlen(double betrag) {
	        kontoStand += betrag;
	    }

	    
	    public void abheben(double betrag) {
	        if (betrag <= kontoStand) {
	            kontoStand -= betrag;
	        } else {
	            System.out.println("Nicht genügend Guthaben auf dem Aufgabe01.");
	        }
	    }

	    
	    public void ueberweisen(Aufgabe01 zielKonto, double betrag) {
	        if (betrag <= kontoStand) {
	            abheben(betrag);
	            zielKonto.einzahlen(betrag);
	        } else {
	            System.out.println("Nicht genügend Guthaben auf dem Aufgabe01 für die Überweisung.");
	        }
	    }

	
	    public void kontoAuszug() {
	        System.out.println("Kontoauszug:");
	        System.out.println("Kontonummer: " + hashCode()); 
	        System.out.println("Inhaber: " + inhaber);
	        System.out.println("Kontostand: " + kontoStand + " Euro");
	    }

	    
	    public static void main(String[] args) {
	        Aufgabe01 konto1 = new Aufgabe01(1, "Max Mustermann");
	        Aufgabe01 konto2 = new Aufgabe01(2, "Erika Musterfrau", 100);

	        konto1.kontoAuszug();
	        konto2.kontoAuszug();

	        konto1.ueberweisen(konto2, 50);

	        konto1.kontoAuszug();
	        konto2.kontoAuszug();

	        Aufgabe01 konto3 = new Aufgabe01(3, "Paul Beispiel", konto1);

	        konto1.kontoAuszug();
	        konto3.kontoAuszug();
	    }
	}


