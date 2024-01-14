package javaInnerClasses;

class OuterClassM {
	  int x = 10; 

	  class InnerClassM {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

	public class MainN {
	  public static void main(String[] args) {
	    OuterClassM myOuter = new OuterClassM();
	    OuterClassM.InnerClassM myInner = myOuter.new InnerClassM();
	    System.out.println(myInner.myInnerMethod());
	  }
	}
