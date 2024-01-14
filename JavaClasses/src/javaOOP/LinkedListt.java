package javaOOP;

import java.util.ArrayList;

public class LinkedListt {

	public static void main(String[] args) {
		// TODO auto-generated method stub
		
		// String tipinde elemanları içeren bir ArrayList oluşturma
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		
		arrayList.remove("Banana");
		// veya
		arrayList.remove(0); // İlk elemanı kaldırır
		
		String element = arrayList.get(1); // İkinci elemanı alır
		System.out.println("Element at index 1: " + element);
		
		int size = arrayList.size();
		System.out.println("ArrayList size: " + size);
		// for döngüsü
		for (int i = 0; i < arrayList.size(); i++) {
		    System.out.println(arrayList.get(i));
		}

		// foreach döngüsü
		for (String elementt : arrayList) {
		    System.out.println(elementt);
	}

}
	}
