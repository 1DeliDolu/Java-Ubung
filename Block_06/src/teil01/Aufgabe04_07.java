package teil01;

public class Aufgabe04_07 {

	public static void main(String[] args) {

        int[] a = new int[3];
        System.out.println("a.length: "+a.length);
        
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * i;
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n-------------------------------");
        int[] b = {1, 3};

        int[] c = new int[a.length + b.length];
        System.out.println("c.length: "+c.length);
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
                System.out.println("wenn i < a.length c[i]: "+c[i]+ " ");
            } else {
                c[i] = b[i - a.length];
                System.out.println("wenn i > a.length c[i]: "+c[i]+ " ");
            }
        }
    }
}