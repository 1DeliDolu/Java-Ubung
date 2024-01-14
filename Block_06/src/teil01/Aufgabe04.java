package teil01;

public class Aufgabe04 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int i = 2;

        i = a[i];
        System.out.println(i);
        System.out.println("---------------------------------");
        a[i] = i;
        System.out.println(a[i]);

        System.out.println("---------------------------------");
        System.out.println(a[(2 * a[i] + a[i + 1]) % 10] = a[a[i - 1] + a[i + 1]] - 1);

        System.out.println("2. Welchen Wert erhält x am Ende von main:");
        int[] a1 = {1, 2};
        int[] b = {1, 2};
        int x = 0;
        if (a1 == b) {
            x = 1;
        } else {
            x = 2;
        }
        System.out.println(x);

        // 3. Welchen Wert haben x und y nach dem Aufruf von tausche
        System.out.println("3. Welchen Wert haben x und y nach dem Aufruf von tausche:");
        int x1 = 1;
        int y1 = 3;
        tausche(x1, y1);

        // 4. Welchen Wert hat a nach dem Aufruf von tausche
        System.out.println("4. Welchen Wert hat a nach dem Aufruf von tausche:");
        int[] a11 = {1, 2};
        tausche(a11, 0, 1);

        // 5. Welche Ausgabe erzeugt:
        System.out.println("5. Welche Ausgabe erzeugt:");
        for (int z = 0; z < a.length; z++) {
            System.out.print(a[z] + " ");
        }

        System.out.println("---------------------------------");
        System.out.println();

        int[][] b1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 0}};

        for (int i1 = 0; i1 < a.length; i1++) {
            for (int j1 = 0; j1 < 2; j1++) {
                System.out.print(b1[i1][j1] + " ");
            }
        }
    }

    private static void tausche(int k, int l) { // k=i, j=l
        int t = k;
        k = l;
        l = t;
        System.out.println("i: " + k + " j: " + l);
    }

    private static void tausche(int[] x, int i, int j) {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
        System.out.println("x[i]: " + x[i] + " x[j]: " + x[j]);
    }
}
