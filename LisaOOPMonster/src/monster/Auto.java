package monster;

import java.util.Scanner;

public class Auto {
private String farbe;
private int autoNummer;
private Fahrer fahrer;
private static int laufendNum=37;

static Auto[] rennautos = new Auto[5];
static Scanner sc=new Scanner(System.in);


public static Auto[] speichern() {
	for(int i=0 ;i<rennautos.length;i++) {
		System.out.print("Farbe: ");
		String farbe =sc.nextLine();
		Auto auto=new Auto (farbe,null);
		rennautos[i]=auto;
	}
	
	
	return  rennautos;
}



/**
 * @param farbe
 * @param autoNummer
 * @param fahrer
 */
public Auto(String farbe, Fahrer fahrer) {
	super();
	this.farbe = farbe;
	this.autoNummer = laufendNum;
	laufendNum++;
	this.fahrer = fahrer;
}





@Override
public String toString() {
	return "Auto [farbe=" + farbe + ", autoNummer=" + autoNummer + ", fahrer=" + fahrer + "]";
}





public String getFarbe() {
	return farbe;
}


public void setFarbe(String farbe) {
	this.farbe = farbe;
}


public int getAutoNummer() {
	return autoNummer;
}


public void setAutoNummer(int autoNummer) {
	this.autoNummer = autoNummer;
}


public Fahrer getFahrer() {
	return fahrer;
}


public void setFahrer(Fahrer fahrer) {
	this.fahrer = fahrer;
}





}