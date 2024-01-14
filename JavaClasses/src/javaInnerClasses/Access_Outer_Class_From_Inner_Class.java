package javaInnerClasses;


class Zugriff_Auf_OuterClass {
	  int x = 10; 

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

	public class Access_Outer_Class_From_Inner_Class {
	  public static void main(String[] args) {
		  Zugriff_Auf_OuterClass myOuter = new Zugriff_Auf_OuterClass();
		  Zugriff_Auf_OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	  }
	}
