package javaInnerClasses;

class OuterClasss {
	  int x = 10;

	  private class InnerClass {
	    int y = 5;
	  }
	}
public class PrivateInnerClass {
	public static void main(String[] args) {
	    OuterClasss myOuter = new OuterClasss();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	   System.out.println(myInner.y + myOuter.x);
	  }
	}
