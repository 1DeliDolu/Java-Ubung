package javaModifiersAttributeForMethodandConstructor;

class DefaultAttribute {
	String fname = "John";
	  String lname = "Doe";
	  String email = "john@doe.com";
	  int age = 25;
	  
	  public static void main(String[] args) {
		  DefaultAttribute myObj = new DefaultAttribute();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	  
	   void   defaultAttribute(){
		DefaultAttribute myObj = new DefaultAttribute();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}
