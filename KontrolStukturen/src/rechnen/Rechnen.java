package rechnen;

import java.util.Scanner;

public class Rechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Bitte gebe bitte die Uhr  ein : ");
		Scanner rechnen = new Scanner(System.in);
		
		double zahl_1 = rechnen.nextDouble();
		System.out.print("Bitte gebe bitte erste Zahl  ein : ");
		double zahl_2 = rechnen.nextDouble();
		System.out.print("Bitte gebe bitte erste Zahl  ein : ");
		System.out.println("Wenn Sie addieren möchten, geben Sie bitte 1 ein"+
				"Wenn Sie subtrahieren möchten, geben Sie bitte 2 ein"+
				"Wenn Sie multipizieren möchten, geben Sie bitte 3 ein"+
				"Wenn Sie dividieren möchten, geben Sie bitte 4 ein");
		int rechnenType= rechnen.nextInt();
		
		switch(rechnenType){
		
		case 1: System.out.println(zahl_1+zahl_2);
		break; 
		
		case 2: System.out.println(zahl_1-zahl_2);
		break; 
		
		case 3: System.out.println(zahl_1*zahl_2);
		break; 
		
		case 4: System.out.println(zahl_1/zahl_2);
		break; 
		
	}
		}

}
