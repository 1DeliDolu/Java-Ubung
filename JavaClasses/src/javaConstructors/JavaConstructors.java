package javaConstructors;

public class JavaConstructors {
	int x;  // Create a class attribute

	  // Create a class constructor for the Animal1 class
	  public JavaConstructors() {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args) {
		  JavaConstructors myObj = new JavaConstructors(); // Create an object of class Animal1 (This will call the constructor)
	    System.out.println(myObj.x); // Print the value of x
	  }
	}
