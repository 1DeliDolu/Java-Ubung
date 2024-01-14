package javaRecursion;

import java.util.Scanner;

public class HaltingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		int result = sum(5, 10);
	    System.out.println(result);
	    
	    
	    
	    // ich habe dieses Code selbst geschrieben. Class abrufen. 
	    System.out.print("Bitte geben Sie eine Zahl ein: ");
	    int a= scanner.nextInt();
	   System.out.println("Java Recursion Class: "+JavaRecursion.sum(a));
	    
	}
	public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }

}
