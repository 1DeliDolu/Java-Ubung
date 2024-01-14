package aufgabe01;

import java.util.Arrays;


public class Primzahlen {
	public static int[] myArrayMethod(int n) {
		
		
		//Array erstellen
        int[] primes = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = i;
        }
        //Wert Wurzel herauslöschen
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == 0) {
                continue;
            }
            //Vielfachen herauslöschen
            for (int j = i*i ; j <= n; j += i) {
                primes[j] = 0;
            }
        }
        //Die Arraylange der Primzahl erstellen
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primes[i] != 0) {
                count++;
            }
        }
        //Primzahl rein Array
        int[] result = new int[count];
        for (int i = 2, j = 0; i <= n; i++) {
            if (primes[i] != 0) {
                result[j++] = primes[i];
            }
        }

        return result;
    }
	public static String UmwandelString(int n) {
		return Arrays.toString(myArrayMethod(n));
	}
}

