package javaEnums;

/*Write a program in Java to describe the use of 
 * values(), 
 * valueOf(), 
 * ordinal() methods in the enum.*/

//Java program to demonstrate working of values(),
//ordinal() and valueOf()

enum Color {
	RED,
	GREEN,
	BLUE;
}

public class Q6Von_geeksforgeeksorg {
	public static void main(String[] args)
	{
		// Calling values()
		
		int [] aw= {2,3,4,5,67,8};
//		for (int col : aw) {
//			System.out.println(col + " at index "
//					+ col.ordinal());
//		} primitive sayilar ile calismiyor
			
			Color arr[] = Color.values();
		

		// enum with loop
		for (Color col : arr) {
			// Calling ordinal() to find index
			// of color.
			System.out.println(col + " at index "
							+ col.ordinal());
		}

		// Using valueOf(). Returns an object of
		// Color with given constant.
		// Uncommenting second line causes exception
		// IllegalArgumentException
		System.out.println(Color.valueOf("RED"));
		// System.out.println(Color.valueOf("WHITE"));
	}
}
