package aufgabe01;

import java.util.Arrays;
import java.util.Scanner;

public class Eratosthenes1 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
        System.out.print("n: ");
        int n = scanner.nextInt(); 
		
        UmwandelString(n);
        
        
        int[] result = siebDesEratosthenes(n);

        System.out.print("Primzahle zwischen 2 und "+n+": ");
        for (int prime : result) {
            System.out.print(prime + " ");
           
        }
        primFaktorZerlegung(n);
    }


	    public static int[] siebDesEratosthenes(int n) {
	        boolean[] isPrime = new boolean[n + 1];
	        for (int i = 2; i <= n; i++) {
	            isPrime[i] = true;
	        }

	        for (int p = 2; p * p <= n; p++) {
	            if (isPrime[p]) {
	                for (int i = p * p; i <= n; i += p) {
	                    isPrime[i] = false;
	                }
	            }
	        }

	        int primeCount = 0;
	        for (int i = 2; i <= n; i++) {
	            if (isPrime[i]) {
	                primeCount++;
	            }
	        }

	        int[] primes = new int[primeCount];
	        int index = 0;
	        for (int i = 2; i <= n; i++) {
	            if (isPrime[i]) {
	                primes[index++] = i;
	            }
	        }

	        return primes;
	    }
	    
	    public static void primFaktorZerlegung(int n) {
	        int[] primes = siebDesEratosthenes(n);

	        System.out.print("\nPrimfaktor von "+n+" :");
	        for (int prime : primes) {
	            while (n % prime == 0) {
	                System.out.print(prime + " ");
	                n /= prime;
	            }
	        }
	        System.out.println();
	        if (n > 1) {
	            System.out.print(n);
	        }

	        System.out.println();
	    }

	    public static String UmwandelString(int n) {
			return Arrays.toString(siebDesEratosthenes(n));
		}
	        
	   
	}
	    
	
