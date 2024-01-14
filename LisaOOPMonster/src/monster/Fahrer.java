package monster;

public class Fahrer {
	private Boolean horn;
	private int mundZahl;
	private String farbe;
	private Boolean ohren;
	private int arm;
	private int helm;




/**
	 * @param horn
	 * @param mundZahl
	 * @param farbe
	 * @param ohren
	 * @param arm
	 * @param helm
	 */
	public Fahrer(Boolean horn, int mundZahl, String farbe, Boolean ohren, int arm, int helm) {
		super();
		this.horn = horn;
		this.mundZahl = mundZahl;
		this.farbe = farbe;
		this.ohren = ohren;
		this.arm = arm;
		this.helm = helm;
		//System.out.println(this);
	}



@Override
public String toString() {
	return "Fahrer [horn=" + horn + ", mundZahl=" + mundZahl + ", farbe=" + farbe + ", ohren=" + ohren + ", arm=" + arm
			+ ", helm=" + helm + "]";
}



public Boolean getHorn() {
	return horn;
}

public void setHorn(Boolean horn) {
	this.horn = horn;
}

public int getMundZahl() {
	return mundZahl;
}

public void setMundZahl(int mundZahl) {
	this.mundZahl = mundZahl;
}

public String getFarbe() {
	return farbe;
}

public void setFarbe(String farbe) {
	this.farbe = farbe;
}

public Boolean getOhren() {
	return ohren;
}

public void setOhren(Boolean ohren) {
	this.ohren = ohren;
}

public int getArm() {
	return arm;
}

public void setArm(int arm) {
	this.arm = arm;
}

public int getHelm() {
	return helm;
}

public void setHelm(int helm) {
	this.helm = helm;
}


}
