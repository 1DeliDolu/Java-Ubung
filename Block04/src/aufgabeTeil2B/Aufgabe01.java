package aufgabeTeil2B;

public class Aufgabe01 {
    public static double div(int x, int y) {
        if (y == 0) {
            return Double.MAX_VALUE;
        } else {
            return ((double)x) / ((double)y);
        }
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(div(a, b));
    }
}
