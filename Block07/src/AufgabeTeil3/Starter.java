package AufgabeTeil3;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int neueNummer, String name, Konto werber 	 argument für dritte constructor überweisung
		//int neueNummer,String name,int begrüßungsGeld  argument für erste constructor 
		//int neueNummer,String name 					 argument für zweite constructor 
		//int neueNummer, Konto bankKonto 				 argument für handy
		
		
		Konto konto1=new Konto(1,"Mustafa Özdemir",1000);
		Konto konto2=new Konto(2,"Bettina Müller");
		Konto konto3=new Konto(1,"Ceaser Pfeiffer",50);
		Konto konto4=new Konto(4,"Max Mustermann",50);
		Konto konto6=new Konto(6,"Anton Schneieder",2000);
		
		
		konto1.kontoAuszug();
		
		konto1.ueberweisen(konto2, 50);
		
		konto2.kontoAuszug();
		
		konto2.ueberweisen(konto3, 50);
		
		konto1.abheben(50);
		konto4.kontoAuszug();
		//konto3.kontoAuszug();
		//konto2.kontoAuszug();
		
		Handy han1= new Handy(11234567,konto1);
		Handy han2= new Handy(21234567,konto2);
		Handy han3= new Handy(31234567,konto3);
		Handy han4= new Handy(41234567,konto4);
		han1.sendeSMS(han2, "\nHello");
		han2.sendeSMS(han3, "\nGuten Tag");
		han3.sendeSMS(han1, "\nGuten Morgen");
		han1.sendeSMS(han4, "\nHello");
		han2.sendeSMS(han4, "\nGuten Tag");
		han4.sendeSMS(han1, "\nHello");
		han4.sendeSMS(han2, "\nGuten Tag");
		System.out.println("\n"+han4.toString());
		//System.out.println(han1);
		//System.out.println(han2);
		konto1.kontoAuszug();
		konto6.ueberweisen(konto1, 1000);
		konto1.kontoAuszug();
		
	}

}
