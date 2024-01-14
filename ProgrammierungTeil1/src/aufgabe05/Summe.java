package aufgabe05;

import java.util.Scanner;

public class Summe {
static Scanner scanner=new Scanner(System.in);
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	summe();
	}
	public static void summe() {
		int summe=0;
		System.out.print("n: ");
		int n=scanner.nextInt();
		scanner.nextLine();
		boolean eingabe=true;
		int i=1;
		while(i<n) {
			summe+=i;
			i++;
			//System.out.println(summe);
			if(summe>=100) {
				System.out.println("i: "+i+" Summe: "+summe);
				break;
				
			
			}
			
		}
		
	}
}
