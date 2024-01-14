package blockScope;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code here CANNOT use x

	    { // This is a block
	    	//System.out.println(x);
	      // Code here CANNOT use x

	      int x = 100;

	      // Code here CAN use x
	      System.out.println(x);

	    } // The block ends here

	  // Code here CANNOT use x

	    
	    /*A block of code may exist on its own or it can belong to an if, while or 
	     * for statement. In the case of for statements, variables declared in the statement 
	     * itself are also available inside the block's scope.
	     * 
	     * */
	  }
	}