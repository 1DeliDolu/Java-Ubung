package matheFunktionen;


import java.util.Scanner;

public class MatheApp {
    static Scanner scanner = new Scanner(System.in);

    public static int zahlenEinlesen() {
        int zahl = 0;
        System.out.print("Gib eine Zahl ein: ");
        zahl = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        return zahl;
    }

    public static int max_2(int x, int y) {
        x = zahlenEinlesen();
        y = zahlenEinlesen();

        if (x > y)
            return x;
        else
            return y;
    }

    public static int max_3(int x, int y, int z) {
    	
    	return max_2(max_2(x, y), z);
    }

    public static int max_4(int x, int y, int z, int w) {
    	
        return max_2(max_3(x, y, z), w);
    }

    public static void main(String[] args) {
    	max_4(3,4,5,6);
       
    }
}