package javaConstructors;

public class ConstructorParameters {

	int x;

	  public ConstructorParameters(int y) {
	    x = y;
	  }

	  public static void ConstructorParameters(String[] args) {
	    ConstructorParameters myObj = new ConstructorParameters(5);
	    System.out.println(myObj.x);
	  }
	}
