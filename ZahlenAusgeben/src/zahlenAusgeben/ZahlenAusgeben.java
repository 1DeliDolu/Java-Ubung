package zahlenAusgeben;

public class ZahlenAusgeben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zahlen von 1 bis 100 ausgeben
	    
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			String ausgabe = "";
			if (i % 3 == 0 && i % 4 == 0) {
				ausgabe += "teilbar durch 3/4";
				}
			else if (i % 3 == 0) {
				ausgabe += "teilbar durch 3";
			}	
			else if (i % 4 == 0) {
					ausgabe += "teilbar durch 4";
	      }
			System.out.println(ausgabe);
	    }
	  }
	
	}

