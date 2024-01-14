package linkedList;
import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String tipinde elemanları içeren bir LinkedListt oluşturma
		LinkedList<String> linkedList = new LinkedList<>();
		
		//add() yöntemi ile LinkedList'e yeni bir eleman ekleyebilirsiniz.
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		linkedList.add("Kirche");
		linkedList.add("Birne");
		linkedList.add("Orange");
		linkedList.add("Weintraube");
		
		System.out.println("linkedList.add(index,\"Weintraube\")");
		linkedList.add(0, "Mango");
		linkedList.forEach(item -> System.out.println(item));
		
		// addFirst(): Elemanı listenin başına ekleme
        linkedList.addFirst("First");
        linkedList.forEach(item -> System.out.println(item));
        
     // addLast(): Elemanı listenin sonuna ekleme
        linkedList.addLast("Last");
        linkedList.forEach(item -> System.out.println(item));
        
     // removeFirst(): Listenin başındaki elemanı kaldırma
        linkedList.removeFirst();
        linkedList.forEach(item -> System.out.println(item));

        // removeLast(): Listenin sonundaki elemanı kaldırma
        linkedList.removeLast();
        linkedList.forEach(item -> System.out.println(item));

		
		
		//remove() yöntemi ile belirli bir elemanı silebilirsiniz. İndeks numarası veya elemanın kendisi kullanılabilir.
		linkedList.remove("Banana");
		// veya
		linkedList.remove(0); // İlk elemanı kaldırır
		
		//get() yöntemi ile belirli bir indexteki elemana erişebilirsiniz.
		String element = linkedList.get(1); // İkinci elemanı alır
		System.out.println("Element at index 1: " + element);
		
		
		//for döngüsü veya foreach döngüsü (enhanced for loop) kullanarak LinkedList 
		// for döngüsü
		for (int i = 0; i < linkedList.size(); i++) {
		    System.out.println(linkedList.get(i));
		}

		// foreach döngüsü
		for (String elementt : linkedList) {
		    System.out.println(elementt);
	}
		
		// addFirst(): Elemanı listenin başına ekleme

}
	}
