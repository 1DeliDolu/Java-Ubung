package aufgabe01;

import java.util.Scanner;

public class DivMod {
	 public static void main(String[] args) {
	       
	        
	    	int result1 = div(-10, 3);
	        int remainder1 = mod(-10, 3);

	        int result2 = div(20, -4);
	        int remainder2 = mod(20, -4);

	        
	        System.out.println("div(-10, 3) = " + result1 + ", mod(-10, 3) = " + remainder1);
	        System.out.println("div(-20, 4) = " + result2 + ", mod(-20, 4) = " + remainder2);
	    }

	    
	public static int div(int x, int y) {
	        if (y == 0) {
	            System.out.println("Der Divisor darf nicht Null sein.");
	        }
	        
	        int result = 0;
	        boolean isNegative = (x < 0) || (y < 0);

	        x=((x<0) ? -x:x) ;
	        
	        y =((y<0) ? -y:y);

	        while (x >= y) {
	            x -= y;
	            result++;
	        }

	        return isNegative ? -(result) : result;
	    }


	    
	    public static int mod(int x, int y) {
	        if (y == 0) {
	        	System.out.println("Der Divisor darf nicht Null sein.");
	        }
	        
	        boolean isNegative = (x < 0) || (y < 0);

	        x=((x<0) ? -x:x) ;
	        
	        y =((y<0) ? -y:y);

	        while (x >= y) {
	            x -= y;
	        }

	        return isNegative ? -(x) : x;
	    }

	    
	   
	}
