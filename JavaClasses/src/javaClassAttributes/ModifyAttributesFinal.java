package javaClassAttributes;

public class ModifyAttributesFinal {
	final int x = 10;

	  public static void main(String[] args) {
		  ModifyAttributesFinal myObj = new ModifyAttributesFinal();
		  try {
	
	//myObj.x = 25; // will generate an error: cannot assign a value to a final variable
	  } catch(Exception  e) {
		  System.out.println(" The value of x is not changed. Because of ModifyAttributesFinal");
	  }
		 finally {
		      System.out.println("The 'try catch' is finished.");
	  }
		  System.out.println(myObj.x);
}
	  }