package javaScope;

public class MethodScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code here CANNOT use x

	    int x = 100;

	    // Code here can use x
	    System.out.println(x);
	}

}
