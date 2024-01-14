package umwanlungsTabelle;

import java.util.Scanner;

public class UmwanlungsTabelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rechnen = new Scanner(System.in);
		
		System.out.print("Bitte gebe bitte die Zahl  ein : ");
		
		int zahl= rechnen.nextInt();
		
		switch(zahl){
		
		case -1: System.out.println(12);
		break; 
		
		case 0: System.out.println(-3);
		break; 
		
		case 4: System.out.println(8);
		break; 
		
		case 5: System.out.println(4);
		break; 
		case 12: System.out.println(11);
		break; 
		case 13: System.out.println(-2);
		break; 
		case 14: System.out.println(-3);
		break; 
		case 17: System.out.println(-4);
		break; 
		case 34: System.out.println(24);
		break; 
		case 35: System.out.println(1);
		break; 
	}

}
}
