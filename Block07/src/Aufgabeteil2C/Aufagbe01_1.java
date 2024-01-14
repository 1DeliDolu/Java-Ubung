package Aufgabeteil2C;



public class Aufagbe01_1 {


	    private String art;

	   
	    public Aufagbe01_1(String art) {
	        this.art = art;
	    }
	    
	    public Aufagbe01_1() {
	    	this.art = art;
	    }

	 
	    public String getArt() {
	        return art;
	    }
	}

	
	class Hund extends Aufagbe01_1 {
	    private String rasse;

	    
	    public Hund(String art, String rasse) {
	        super(art); // 
	        this.rasse = rasse;
	    }

	   
	    public String getRasse() {
	        return rasse;
	    }
	}
