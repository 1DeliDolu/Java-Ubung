package aufgabeTeil2C1;

import java.util.Scanner;

public class AufgabeTeil2C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mc = new Scanner(System.in);
		//int k;int l; 
		
		//int j = 2;
		
		//int i= (j==2)? 1:3;
		//System.out.println("Wert von i: " +i);
		
		//int i= (2) ? 1:3;
		//System.out.println("Wert von i: " +i);
		
		 /*int j = 2;
	     int i = (j == 2) ? 1 : 3;
	     System.out.println("Der Wert von i: " + i);
		*/
		
		/*int j = 2;
		int i = (j == 1) ? 5 : 7;
		System.out.println("Wert von i: " +i);*/
		
		/*int j=2; 
		int i= (j=1)? (j=2)+1:(j=3)-6;
*/
		 /*int j = 2;
	     int i = (j = 1)? (j = 2) + 1 : (j = 3) - 6;
	     System.out.println("Wert von i: " + i); */
	   
	   int j= 2;
	   int i = (j++>1)? 2:4;
	   System.out.println("Wert von i: " + i);
	}

}
