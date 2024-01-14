package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Hallo ihr da");
//System.out.println("Hallo ihr da");
System.out.println("Zahl eingeben: ");

int n=sc.nextInt();

try {
	System.out.println(n/0);

}
catch(ArithmeticException e) {
	System.out.println(e.toString());
}

catch(InputMismatchException a) {
		System.out.println(a.toString());

	}
System.out.println("Hallo ihr da");
System.out.println("Hallo ihr da");

	}

}
