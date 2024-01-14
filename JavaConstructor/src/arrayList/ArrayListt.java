package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String tipinde elemanları içeren bir ArrayList oluşturma
		ArrayList<String> arrayList = new ArrayList<>();
		
		// Veri ekleme
		System.out.println("\nnur add(\"Value\"):arrayList.add(\"Apple\")");
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Kirche");
		arrayList.add("Birne");
		arrayList.add("Orange");
		arrayList.add("Weintraube");
		
		arrayList.forEach(i-> System.out.println(i));
		
		System.out.println("\nIndex und Value: add(index,\"Value\"):arrayList.add(arrayList.size(),\"Melon\")");
		arrayList.add(arrayList.size(),"Melon");// last index,who i have added an item.
		arrayList.add(arrayList.size(),"Wassermelon");
		arrayList.forEach(i-> System.out.println(i));
		
		//Daten löschen
		arrayList.remove("Banana");
		System.out.println("\narrayList.remove(\"Banana\") : remove Banane");
		// oder 
		arrayList.remove(0); // Erste Value
		System.out.println("\narrayList.remove(0):  İlk elemanı kaldırır");
		
		int size = arrayList.size();
		System.out.println("\nArrayList size: " + size);
		String element = arrayList.get(1); // Zweite Value
		System.out.println("\nElement at index 1: " + element);
		
		System.out.println("\nBei ArrayList() Daten erreichen durch get() Method :arrayList.get(0)");
		System.out.println("arrayList.get(0): "+arrayList.get(0));
		
		System.out.println("\nfor döngüsü:");
		// for Schleife
			for (int i = 0; i < arrayList.size(); i++) {
		    System.out.println(arrayList.get(i));
		}
		
			System.out.println("\nforeach döngüsü:");
			// for-each Schleife
			for (String elementt : arrayList) {
		    System.out.println(elementt);
		    
		   
		}
			System.out.println("\narrayList.forEach: arrayList.forEach(i-> System.out.println(i)");
		    arrayList.forEach(i-> System.out.println(i));
		    
		    System.out.println("\nIterator(), next() and hasNext()Method ");
		    Iterator itr= arrayList.iterator();
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
		    }

}
