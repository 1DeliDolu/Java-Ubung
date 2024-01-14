package javaExceptions;

public class Finally {

	public static void main(String[] args) {
		// TODO auto-generated method stub
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong. "+e);
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		  }
		}