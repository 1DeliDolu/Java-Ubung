package aufgabe04;

import java.util.Scanner;

public class Schleifen {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
puls();
puls1();
	}
public static void puls() {
	int puls=0;
	int rund = 0;
	do {
	System.out.print("Puls:");
	puls=scanner.nextInt();
	scanner.nextLine();
	rund++;
	}
	while(puls<160);
	System.out.println("Rund: "+rund +", Puls: "+puls);
}
public static void puls1() {
	int puls=0;
	System.out.print("Maximum Rund:");
	int maxRund=scanner.nextInt();
	scanner.nextLine();
	int rund = 0;
	while(puls<160) {
		System.out.print("Puls: ");
		puls=scanner.nextInt();
		scanner.nextLine();
		rund++;
		if(rund==maxRund) {
			break;
		}
		
		
	}
	System.out.println("\nGesamtrund: "+rund+", Puls:"+puls);	
}
}
