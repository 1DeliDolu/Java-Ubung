package returnValues;

public class ReturnValues {
	static int myMethod(int x) {
	    return 5 + x;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Der Schlüsselwort void, das in den obigen Beispielen verwendet wird, weist an, dass die Methode keinen Wert zurückgeben soll. Wenn Sie möchten, dass die Methode einen Wert zurückgibt, können Sie anstelle von void einen primitiven Datentyp (wie int, char usw.) verwenden und das Schlüsselwort return innerhalb der Methode verwenden.*/
		System.out.println(myMethod(3));
	}

}
