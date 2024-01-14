package personen;

public class Beruf {

	String bezeichnung;
	double gehalt;
	double betribZug;
	
	
	/**
	 * @param bezeichnung
	 * @param gehalt
	 * @param betribZug
	 */
	public Beruf() {
		super();
		this.bezeichnung = bezeichnung;
		this.gehalt = gehalt;
		this.betribZug = betribZug;
	}


	public String toString() {
		return " "+bezeichnung+", dein Gehalt: "+gehalt+", dein Betriebzug: "+betribZug;
	}
	
	}


