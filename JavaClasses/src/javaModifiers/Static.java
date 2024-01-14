package javaModifiers;

public class Static {
	// Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Animal1 method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method

	    Static myObj = new Static(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method
	  }
	}
