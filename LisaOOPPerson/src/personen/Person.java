package personen;

public class Person {
private char geschlecht;
private Beruf beruf;
private String name;
/**
 * @param geschlecht 
 * @param beruf 
 * @param name 
 */
	public Person() {
	super();
	this.geschlecht = geschlecht;
	this.beruf = beruf;
	this.name = name;
}
	public String toString() {
	return "Dein Name: "+name+", Dein Beruf: "+beruf+", deine Geschlecht: "+geschlecht;
}
	public void ausgabe() {
	System.out.println("Name: "+name+", Beruf: "+beruf+", Geschlecht: "+geschlecht);
}
	public char getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	public Beruf getBeruf() {
		return beruf;
	}
	public void setBeruf(Beruf beruf) {
		this.beruf = beruf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
