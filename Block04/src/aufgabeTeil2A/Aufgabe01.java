package aufgabeTeil2A;

public class Aufgabe01 {

	 public static int max(int x, int y) {
	        return x > y ? x : y;
	    }

	    public static int max(int x, int y, int z) {
	        return max(x, max(y, z));
	    }

	    public static int max(int w, int x, int y, int z) {
	        return max(max(w, x), max(y, z));
	    }

	    public static void main(String[] args) {
	        int i = max(10, 5, -15);
	        System.out.println(i);
	}

}
