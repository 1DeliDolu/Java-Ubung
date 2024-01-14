package personen;


import java.util.Arrays;
import java.util.Scanner;

public class Starter {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @param geschlecht 
		 * @param beruf 
		 * @param name 
		 */
		Person p1= new Person();
		Beruf b1=new Beruf();
		//p1.name="Mustafa";
		p1.setName("Christ");
		p1.setBeruf(b1);
		p1.setGeschlecht('m');
		
		Person p2= new Person();
		Beruf b2=new Beruf();
//		p2.name="Max";
//		p2.beruf=b2;
//		p2.geschlecht='m';
		p2.setName("Max");
		p2.setBeruf(b2);
		p2.setGeschlecht('m');
		
		Person p3= new Person();
		Beruf b3=new Beruf();
//		p3.name="Tim";
//		p3.beruf=b3;
//		p3.geschlecht='m';
		p3.setName("Tim");
		p3.setBeruf(b2);
		p3.setGeschlecht('m');
		
		
		Person p4= new Person();
		Beruf b4=new Beruf();
//		p4.name="Oliver";
//		p4.beruf=b4;
//		p4.geschlecht='m';
		p4.setName("Oliver");
		b3.bezeichnung="Pilot";
		b3.gehalt=4000.0;
		b3.betribZug=7.5;
		p4.setBeruf(b3);
		p4.setGeschlecht('m');
		
		
		Person[] personen=new Person[5];
		System.out.println(personen);
		personen[0]=p1;
		personen[1]=p2;
		personen[2]=p3;
		personen[3]=p4;
		
		personen[2].setName("Tim Maer");
		
		
		
//		
//		System.out.println("Name: "+p1.name+", Beruf: "+p1.beruf+", Geschlecht: "+p1.geschlecht);
//		System.out.println("Name: "+p2.name+", Beruf: "+p2.beruf+", Geschlecht: "+p2.geschlecht);
//		System.out.println("Name: "+p3.name+", Beruf: "+p3.beruf+", Geschlecht: "+p3.geschlecht);
//		System.out.println("Name: "+p4.name+", Beruf: "+p4.beruf+", Geschlecht: "+p4.geschlecht);
//		System.out.println(p4.toString());
		//p1.ausgabe();
//		p2.ausgabe();
//		p3.ausgabe();
		p4.ausgabe();
		
		System.out.println(p1);
	}

}
