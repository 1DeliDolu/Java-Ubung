package javaExceptions;

public class Throw {

	
		public static void checkAge(int age) {
		    if (age < 18) {
		      throw new SecurityException("Erişim reddedildi");
		    } else {
		      System.out.println("Erişim izin verildi");
		    }
		  }

		  public static void main(String[] args) {
		    try {
		      int age = 16;
		      checkAge(age);
		    } catch (SecurityException e) {
		      System.out.println(e.getMessage());
		    }
		  }
		}