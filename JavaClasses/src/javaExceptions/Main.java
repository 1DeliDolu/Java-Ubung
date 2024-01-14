package javaExceptions;

public class Main {

	public static void main(String[] args) {
		// TODO auto-generated method stub
		 try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Bir şeyler yanlış gitti.");
		    } finally {
		      System.out.println("'try catch' tamamlandı.");
		    }
		  }
		}