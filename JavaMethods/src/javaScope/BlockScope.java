package javaScope;

public class BlockScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code here CANNOT use x

	    { // This is a block

	      // Code here CANNOT use x

	      int x = 100;

	      // Code here CAN use x
	      System.out.println(x);

	    } // The block ends here

	  // Code here CANNOT use x
	}

}
