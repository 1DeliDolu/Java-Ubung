package aufgabeTeil2A;

public class Aufgabe02 {
    public static int f(int i) {
        int j = i * 2 + 1;
        System.out.printf("f: i=%d j=%d\n", i, j);
        return j - i - 2;
    }

    public static int g(int i) {
        int j = i * 3 - 1;
        System.out.printf("g: i=%d j=%d\n", i, j);
        return j - 2 * (i - 3);
    }

    public static void main(String[] args) {
        int i = 1, j = 2;
        System.out.printf("main: i=%d j=%d\n", i, j);

        i = f(i - g(i - j - 10)) + f(j + g(i + j));
        j = f(i - g(i - j - 10)) - f(j + g(i + j));

        System.out.printf("main: i=%d j=%d\n", i, j);
    }
}
