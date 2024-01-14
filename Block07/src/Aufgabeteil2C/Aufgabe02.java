package Aufgabeteil2C;

public class Aufgabe02 {

	    private int mahnstufe;
	    private int mahngebuehr;

	    // Erster Konstruktor
	    public Aufgabe02(int mahnstufe, int mahngebuehr) {
	        this.mahnstufe = mahnstufe;
	        this.mahngebuehr = mahngebuehr;
	        generiereKonsolenausgabe();
	    }

	    // Zweiter Konstruktor
	    
	    public Aufgabe02(Aufgabe02 vorherigeMahnung) {
	        this.mahnstufe = vorherigeMahnung.mahnstufe + 1;
	        this.mahngebuehr = vorherigeMahnung.mahngebuehr + 5;
	        generiereKonsolenausgabe();
	    }


	    public void generiereKonsolenausgabe() {
	        System.out.println("Mahnstufe: " + mahnstufe);
	        System.out.println("Mahngebühr: " + mahngebuehr);
	        System.out.println("------------------------");
	    }

	    public static void main(String[] args) {
	     
	    	Aufgabe02 ersteMahnung = new Aufgabe02(1, 5);

	    
	    	Aufgabe02 zweiteMahnung = new Aufgabe02(ersteMahnung);

	      
	    	Aufgabe02 dritteMahnung = new Aufgabe02(zweiteMahnung);
	    	Aufgabe02 vierteMahnung = new Aufgabe02(dritteMahnung);
	    }
	}
