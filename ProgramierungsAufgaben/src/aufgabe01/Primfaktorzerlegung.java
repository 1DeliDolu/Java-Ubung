package aufgabe01;

public class Primfaktorzerlegung {

		public static void factorize(int n) {
			int[] primes = Primzahlen.myArrayMethod(n);
			

	        System.out.print("\nPrimfaktor von "+n+": ");
	        for (int prime:primes) {
	            while (n % prime == 0) {
	                System.out.print(prime + " ");
	                n /= prime;
	            }
	        }
	        System.out.println();
	       

	}
}

