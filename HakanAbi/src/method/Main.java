package method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
static Scanner musta=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myArrayDefition();
	
		//System.out.println("myArray.length: "+myArray(3));
		//System.out.println("Arrays.toString(myArray): "+myArraytoString(3));
		
		System.out.println("Arrays.toString(myArray): "+myArrayAusgabe());
	}
	

	public static String  arrayAusgabe(){
		System.out.print("Länge: ");
		int n=musta.nextInt();
		
		
		return myArraytoString(myArray(n));

	}
	

	public static int[] myArray(int länge) {
		
		int[] myArray=new int[länge];
		for(int i=0;i<myArray.length;i++) {
			System.out.print("Gebe bitte "+ (i+1) +" Zahl ein: ");
			myArray[i]=musta.nextInt();
			musta.nextLine();
		}
		
		return myArray;//Arrays.toString(myArray)
	}


	public static String myArraytoString(int[] myArray) {
		
		return Arrays.toString(myArray);//Arrays.toString(myArray)
	}
	
	public static String myArrayAusgabe() {
		
		return arrayAusgabe();
	}
}
