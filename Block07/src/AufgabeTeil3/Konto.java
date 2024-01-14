package AufgabeTeil3;

import java.util.Scanner;

public class Konto {
private String inhaber;
private double kontoStand;
private int neueNummer;
static Scanner scanner= new Scanner(System.in);

//zweite  constructor
public Konto(int neueNummer,String name) {
	
	this.neueNummer=neueNummer;
	this.inhaber = name;
    this.kontoStand = 0.0;
}
//erste constructor 
public Konto(int neueNummer,String name,int begrüßungsGeld) {
	this.neueNummer=neueNummer;
	this.inhaber=name;
     einzahlen(begrüßungsGeld);
	
}
// dritte constructor
public Konto(int neueNummer, String name, Konto werber) {

	this.neueNummer=neueNummer;
	this.inhaber= name;
    werber.ueberweisen(werber,50); 
}

public void einzahlen(double betrag) {
    kontoStand += betrag;
}


public void abheben(double betrag) {
    if (betrag <= kontoStand) {
        kontoStand -= betrag;
    } else {
        System.out.println("Nicht genügend Guthaben auf dem Konto.");
    }
}

public void kontoAuszug() {
    System.out.println("\nKontoauszug:");
    System.out.println("Kontonummer: " +this.neueNummer ); 
    System.out.println("Inhaber: " + this.inhaber);
    System.out.println("Kontostand: " + this.kontoStand + " Euro");
}

public void ueberweisen(Konto zielKonto, double betrag) {
    if (betrag <= kontoStand) {
        abheben(betrag);
        zielKonto.einzahlen(betrag);
    } else {
        System.out.println("Nicht genügend Guthaben auf dem Konto für die Überweisung.");
    }
}
public String getInhaber() {
	return inhaber;
}

public void setInhaber(String inhaber) {
	this.inhaber = inhaber;
}

public double getKontoStand() {
	return kontoStand;
}

public void setKontoStand(double kontoStand) {
	this.kontoStand = kontoStand;
}


}
