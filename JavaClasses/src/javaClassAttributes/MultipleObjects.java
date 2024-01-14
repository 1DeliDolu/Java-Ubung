package javaClassAttributes;

public class MultipleObjects {
	int x = 5;
	
	 String fname = "John";
	  String lname = "Doe";
	  int age = 24;

	  public static void MultipleObjects(String[] args) {
		  MultipleObjects myObj = new MultipleObjects();
		  MultipleObjects myObj1 = new MultipleObjects();  // Object 1
	    MultipleObjects myObj2 = new MultipleObjects();  // Object 2
	    myObj2.x = 25;
	    System.out.println(myObj1.x);  // Outputs 5
	    System.out.println(myObj2.x);  // Outputs 25
	    
	    
	    
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Age: " + myObj.age);
	  
	   
	  }
	  
	}