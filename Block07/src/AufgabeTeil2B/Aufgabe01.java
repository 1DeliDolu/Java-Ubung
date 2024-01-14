package AufgabeTeil2B;



public class Aufgabe01 {
   
    private int zaehlerInstanz;

  
    private static int zaehlerKlasse;

   
    public Aufgabe01() {
        
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

   
    public static void main(String[] args) {
        
        Aufgabe01 objekt1 = new Aufgabe01();
        Aufgabe01 objekt2 = new Aufgabe01();

       
        System.out.println("Wert der Instanzvariable für Objekt 1: " + objekt1.getZaehlerInstanz());
        System.out.println("Wert der Instanzvariable für Objekt 2: " + objekt2.getZaehlerInstanz());
        System.out.println("Wert der Klassenvariable: " + Aufgabe01.getZaehlerKlasse());
    }
}
