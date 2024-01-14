package aufgabeTeil1;

public class Aufgabe08 {
    public static int f(int a, int b) {
        int i = a - b;
        return 2 * i;
    }

    public static void main(String[] args) {
        int i = 4711, j;
        j = f(i, 4700);
        System.out.println("J=" + j);
    }
}