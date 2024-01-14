 package javaMethods;

import java.util.Scanner;

public class JavaMethods {
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	// ich habe diese Method selbst geschrieben.
	static int myMethod1(int a, int b) {
		
	    return a+b;
	  }

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			myMethod();
			System.out.print("Bitte geben Sie erste Zahl ein: ");
				int a= scanner.nextInt();
				System.out.print("Bitte geben Sie zweite Zahl ein: ");
				int b= scanner.nextInt();
			System.out.println(myMethod1(a,b));
					}
		   
				 
		 
	}

}
