package aMethodWithIfElse;

import java.util.Scanner;

public class AMethodWithIfElse {
	// Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Gebe bitte eine Zahl ein:");
		int x=scanner.nextInt();
		checkAge(x); // Call the checkAge method and pass along an age of 20
	  }
	}


