package aufgabeTeil2C;

import java.util.Scanner;

public class AufgabeTeil2C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner moe = new Scanner(System.in);
		int maxx;
		System.out.println("Gebe Zahl a ein: ");
		int a= moe.nextInt(); 
		System.out.println("Gebe Zahl a ein: ");
		int b= moe.nextInt();
		System.out.println("Gebe Zahl a ein: ");
		int c= moe.nextInt();
		
	
	if (a>b && a>c) {
		maxx=a;
		System.out.println("Der Wert von maxx :" + maxx);
		}
	else if (b>c){
		maxx=b; 
		System.out.println("Der Wert von maxx :" + maxx);
		}
	else {
		maxx=c;
		System.out.println("Der Wert von maxx :" + maxx);
		}
	}
	}

