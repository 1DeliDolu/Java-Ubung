
public class Starter {

	public static void main(String[] args) {
		
		
//		
//		String strassenname;
//		int hausnummer;
//		String plz;
//		String stadt;
		Adresse a1=new Adresse("Berlinerstrasse",20,"37039","Marburg");
		
		
//		Adresse adresse;
//		String stadt;
		Standort s1= new Standort(a1,"Berlin");
		
//		int raumnummer;
//		String art;
		Raum r1=new Raum(201,"Koferanzhalle");
		
//		Standort standort;
//		String mietzeitraum;
//		Raum raum;
//		String ressourcen;
		Buchung b1=new Buchung(s1, "23.04.23-12.07.23",r1,"Beamer");
		
//		String name;
//		String telefonnummer;
//		String email;
//		int[] kunden = new int[10];
		Sachbearbeiter sb1=new Sachbearbeiter("Mustafa Özdemir","0123654789","mustafaoezdemir@demax.de");
		
		
		
		
		
//		String name;
//		int kundennummer;
//		Adresse adresseDesKunden;
//		String telefonnummer;
//		String email;
//		Sachbearbeiter sachbearbeiter;
		Kunde k1=new Kunde("Max Musterman",1254,a1,"maxmusterman@demax.de",sb1);
		Kunde [] kunden = new Kunde[10];
		kunden[0]=k1;
//		int buchungsnummer;
//		String datum;
//		Kunde kunde;
//		Buchung buchung;
		Buchungsbestätigung bb1=new Buchungsbestätigung(2365,"23.03.23",k1,b1);
		System.out.println(s1);
	}

}