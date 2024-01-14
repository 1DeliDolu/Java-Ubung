package kontrol;

import java.util.Scanner;

public class KontrolStrukturen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// wir haben im unterricht gemacht. 
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Bitte gebe die erste Zahl ein : ");
		int zahl1 = sc.nextInt();
		System.out.print("Bitte gebe die erste Zahl ein : ");
		//int zahl2 = sc.nextInt();
		
		if(zahl1> zahl2) {
			System.out.print("Die erste Zahl ist groesser :"+ zahl1);
			System.out.print(" zahl1+zahl2 "+ (zahl1+zahl2));
		}
		else {
		System.out.print("Die zweite Zahl ist groesser: " + zahl2 );
		System.out.print(", zahl1*zahl2= "+ zahl1*zahl2);
		
	}
		System.out.print(" hier geht weiter....");
		*/
		
		/* a,b,c =>Wir bekommen daten vom konsole ,dann vergleichen wir daten, =>  7,11,20 Deise ist aufgabe */
		
		/*System.out.print("Bitte gebe die erste Zahl ein : ");
		int zahl_1 = sc.nextInt();
		System.out.print("Bitte gebe die zweite Zahl ein : ");
		int zahl_2 = sc.nextInt();
		System.out.print("Bitte gebe die dritte  Zahl ein : ");
		int zahl_3 = sc.nextInt();
		
		if(zahl_1>zahl_2 && zahl_1>zahl_3) {
			System.out.println("Am groesste Zahl : " +zahl_1);
		}
		else {
			if (zahl_2>zahl_3) {
				System.out.println("Am groesste Zahl : " +zahl_2);
			}
			else {
				System.out.println("Am groesste Zahl : " +zahl_3);
				
			}
		}*/
	
		System.out.println("Gebe bitte Zahl zwischen 1 und 7(1-7) ein");
		int tag = sc.nextInt();
		if (tag>0 && tag<8) {
			if(tag==1) {
				System.out.println("Heute ist es Montag");
			}
			else  {
				if(tag==2) {
					System.out.println("Heute ist es Dienstag");
				}
			
				if(tag==3) {
					System.out.println("Heute ist es Mittwoch");
				
				}
			
				if(tag==4) {
					System.out.println("Heute ist es Donnerstag");
				}
			
				if(tag==5) {
						System.out.println("Heute ist es Freitag");
					
				}
				if(tag==6) {
						System.out.println("Heute ist es Sammstag");
				}
			
				if(tag==7) {
						System.out.println("Heute ist es Sonntag");
				}
			
				}
		} 
		
			else {
			System.out.println("Gebe bitte noch einmal Zahl zwischen 1 und 7 (1-7) ein ");
		}
		
	}

}
