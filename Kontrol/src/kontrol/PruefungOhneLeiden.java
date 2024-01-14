package kontrol;

import java.util.Scanner;

public class PruefungOhneLeiden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gebe bitte Zahl zwischen 1 und 7(1-7) ein");
		
		int tag = sc.nextInt();
		
		switch(tag){
		
		case 1: System.out.println("Mo");
		break; 
		
		case 2: System.out.println("Di");
		break; 
		
		case 3: System.out.println("Mi");
		break; 
		
		case 4: System.out.println("Do");
		break; 
		
		case 5: System.out.println("Fr");
		break; 
		
		case 6: System.out.println("Sa");
		break; 
		
		case 7: System.out.println("So");
		break; 
		}
		
		System.out.println("Gebe bitte Zahl zwischen 1 und 12(1-12) ein");
		
		int monat = sc.nextInt();
		
		switch(monat){
		
		case 1: System.out.println("Jan");
		break; 
		
		case 2: System.out.println("Feb");
		break; 
		
		case 3: System.out.println("Mär");
		break; 
		
		case 4: System.out.println("Apr");
		break; 
		
		case 5: System.out.println("Mai");
		break; 
		
		case 6: System.out.println("Jun");
		break; 
		
		case 7: System.out.println("Jul");
		break;
		
		case 8: System.out.println("Aug");
		break; 
		
		case 9: System.out.println("Sep");
		break; 
		
		case 10: System.out.println("Okt");
		break; 
		
		case 11: System.out.println("Nov");
		break;
		
		case 12: System.out.println("Nov");
		break;
		}
	}
	}
