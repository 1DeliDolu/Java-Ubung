package AufgabeTeil2A;

public class Aufgabe01 {
	public int zahl;
	private char geschlecht;
	private  String name;
	private static int laufendeNum=0;
	static Aufgabe01[] student=new Aufgabe01[2];
	
	
	
	public Aufgabe01(char geschlecht,String name) {
		laufendeNum++;
		this.zahl = laufendeNum;
		this.geschlecht = geschlecht;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Aufgabe01 [zahl=" + zahl + ", geschlecht=" + geschlecht + ", name=" + name + "]";
	}
	
	public int getZahl() {
		return zahl;
	}
	
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public char getGeschlecht() {
		return geschlecht;
	}
	
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
