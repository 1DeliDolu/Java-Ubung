package zusatzAufgabe;

public class Wechselgeld {
	private int betrag;
	private static int[] notenUndMuenzen = {200,100,50, 20, 10, 5, 2, 1};
	
	
	public Wechselgeld() {
	
		this.betrag = betrag;
	}

	public  void wechselgeldAusgeben(int betrag) {
		 System.out.println("Für " + betrag + " Euro benötigen Sie:");
		for (int wert : notenUndMuenzen) {
            if (betrag >= wert) {
                int anzahl = betrag / wert;
                betrag %= wert;

                if (wert >= 5) {
                    System.out.println(anzahl + " x " + wert + "-Euro-Note");
                } else {
                    System.out.println(anzahl + " x " + wert + "-Euro-Münze");
                }
            }
        }
    }

	
	
	
	    public int getBetrag() {
		return betrag;
	}

	public void setBetrag(int betrag) {
		this.betrag = betrag;
	}
	
	


		
	    
	}
