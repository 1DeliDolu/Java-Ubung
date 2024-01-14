package teil01;

public class Aufgabe04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 0}};

        for (int[] row : b) {
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println("\n-----------------------------");
        int[] ax = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        for (int m : ax) {
            System.out.print(m + " ");
        }
	}

}
