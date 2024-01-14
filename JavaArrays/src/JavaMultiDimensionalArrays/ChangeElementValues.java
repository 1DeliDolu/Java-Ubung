package JavaMultiDimensionalArrays;

public class ChangeElementValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		 System.out.println(" before change value of myNumbers[1][2]): "+myNumbers[1][2]); // Outputs 9 instead of 7
		 myNumbers[1][2] = 9;
		    System.out.println(" after change value of myNumbers[1][2]): "+myNumbers[1][2]); // Outputs 9 instead of 7
	}

}
