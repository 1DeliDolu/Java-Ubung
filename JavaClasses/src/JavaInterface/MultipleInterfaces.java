package JavaInterface;


interface FirstInterface {
	final int x = 31;
	static int y = 32;
	public int z= 33;
	
	  public void myMethod(); // interface method (abstract and public)
	 //Interface attributes (public, static and final)
	  public void myMethod1();
	  
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	 // DemoClass "implements" FirstInterface and SecondInterface
	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  public void myMethod1() {
		 // z=36;occur an error because type is final
		    System.out.println("X: "+x+" "+"Y:"+y+" Z: "+z);
		   
		  }
	  public void myOtherMethod() {
	    System.out.println("Some other text...");
	  }
	}

	class MultipleInterfaces {
	  public static void main(String[] args) {
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    
	    myObj.myMethod1();
	    
	    myObj.myOtherMethod();
	  }
	}
