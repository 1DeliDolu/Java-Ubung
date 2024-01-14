package array;

import java.util.Scanner;

public class AraayaBeispiel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
int[] zahlen = {10,13,3,5,100};
int[] zahlen1= new int[4];

//System.out.print("Array Length: ");

//int x= sc.nextInt();

//int [] andereZahlen =new int[x];	

/*System.out.println(zahlen[0]);
System.out.println(zahlen[1]);
System.out.println(zahlen[2]);
System.out.println(zahlen[3]);
System.out.println(zahlen[4]);*/

	for(int i=0;i<zahlen.length;i++) {
		System.out.println((zahlen[i])*2);
}
	System.out.println("-----------------------");
	
	for(int i=0;i<zahlen.length;i++) {
		System.out.println(zahlen[i]);
		
	}
System.out.println("-----------------------");
	
	for(int i=0;i<zahlen.length;i++) {
		System.out.println(zahlen[i]=zahlen[i]*2);
		
	}
}
	}
