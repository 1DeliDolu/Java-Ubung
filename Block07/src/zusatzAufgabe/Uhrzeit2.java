package zusatzAufgabe;

public class Uhrzeit2 {
	
	    private int stunden;
	    private int minuten;
	    private int sekunden;

	   
	    public Uhrzeit2(int stunden, int minuten, int sekunden) {
	        setUhrzeit(stunden, minuten, sekunden);
	    }

	   
	    private void setUhrzeit(int stunden, int minuten, int sekunden) {
	        this.stunden = stunden % 24;
	        this.minuten = minuten % 60;
	        this.sekunden = sekunden % 60;
	    }

	    
	    public void addSeconds(int sec) {
	        int gesamtSekunden = stunden * 3600 + minuten * 60 + sekunden + sec;
	        setUhrzeit(gesamtSekunden / 3600, (gesamtSekunden % 3600) / 60, gesamtSekunden % 60);
	    }

	
	    public String toString() {
	        return String.format("%02d:%02d:%02d", stunden, minuten, sekunden);///tim hat mir gezeigt.
	    }

	 
	    public void printTime() {
	        String am_pm = (stunden < 12) ? "a.m." : "p.m.";
	        if (stunden == 0) {
	            stunden = 12;
	        } else if (stunden > 12) {
	            stunden -= 12;
	        }
	        System.out.printf("%d:%02d %s\n", stunden, minuten, am_pm);//tim hat mir gezeigt.
	    }

	  
	    public static Uhrzeit2 add(Uhrzeit2 t1, Uhrzeit2 t2) {
	        int gesamtSekunden = (t1.stunden + t2.stunden) * 3600 +
	                             (t1.minuten + t2.minuten) * 60 +
	                             t1.sekunden + t2.sekunden;

	        int neueStunden = gesamtSekunden / 3600;
	        int neueMinuten = (gesamtSekunden % 3600) / 60;
	        int neueSekunden = gesamtSekunden % 60;

	        return new Uhrzeit2(neueStunden, neueMinuten, neueSekunden);
	    }

	   
	}
