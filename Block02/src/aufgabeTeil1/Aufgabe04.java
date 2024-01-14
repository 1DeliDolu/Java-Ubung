package aufgabeTeil1;

public class Aufgabe04 {
    // Make the method static since it's called from the static main method
    public static void f(int x) {
        System.out.println("Der Parameter ist " + x);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // Uncomment the line below if you want to call the method with x + 4
        f(x + 4);
        f(y + 4);
        f(y);
        f(y + x);
    }
}
