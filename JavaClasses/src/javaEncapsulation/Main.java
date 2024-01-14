package javaEncapsulation;

public class Main {
	 public static void main(String[] args) {
		    Person myObj = new Person();
		    //myObj.name = "John";
		   // System.out.println(myObj.name);
		    
		    /*MyClass.java:4: error: name has private access in Person
    	myObj.name = "John";
         	^
		MyClass.java:5: error: name has private access in Person
    	System.out.println(myObj.name);*/
		  
		    myObj.setName("John");
		    System.out.println(myObj.getName());
		  }
		}