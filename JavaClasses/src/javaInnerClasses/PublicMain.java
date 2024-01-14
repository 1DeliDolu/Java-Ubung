package javaInnerClasses;
class DefaultOuterClass {
	  int x = 10;

	  static class StaticInnerClass {
	    int y = 5;
	    //Note: just like static attributes and methods, a static inner class 
	    //does not have access to members of the outer class.
	    //DefaultOuterClass d1=new DefaultOuterClass();
	    //System.out.println(d1.x);
	    
	    
	  }
	}

	public class PublicMain {
	  public static void main(String[] args) {
		  DefaultOuterClass.StaticInnerClass myInner = new DefaultOuterClass.StaticInnerClass();
	    System.out.println(myInner.y);
	    
	    //selbst 
	    DefaultOuterClass d=new DefaultOuterClass();
	    System.out.println(d.x);
	  }
	}
