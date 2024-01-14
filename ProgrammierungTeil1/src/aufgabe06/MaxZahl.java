package aufgabe06;

import java.util.Scanner;

public class MaxZahl {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\nDie großte Zahl: "+maxZah());
	}
	public static int maxZah() {
		int[] myArray = new int[10];
		for(int j=0;j<10;j++) {
			System.out.print((j+1)+" Zahl:");
			myArray[j]=scanner.nextInt();
			scanner.nextLine();
			
		}
		
		//int[] myArray= {1,3,6,5,8,7,4,6,9,3};
		int maxZahl=myArray[0];
		for (int i=1; i<myArray.length;i++)
			if(myArray[i]>maxZahl)
				maxZahl=myArray[i];
		
		return maxZahl;
	}
}
