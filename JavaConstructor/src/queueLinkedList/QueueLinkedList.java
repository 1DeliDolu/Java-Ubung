package queueLinkedList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        // Queue (Kuyruk) oluşturma
        Queue<String> queue = new LinkedList<>();

        // offer(E e): Kuyruğa eleman ekleme
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");
        queue.offer("Kirche");
        queue.offer("Mango");
        queue.offer("Orange");
        queue.offer("Melon");

        // Elemanları görüntüleme
        System.out.println("\nQueue elements: " + queue);

        // element(): Kuyruğun başındaki elemanı getirme (hata fırlatır)
        String headElement = queue.element();
        System.out.println("\nHead element: " + headElement);

        // peek(): Kuyruğun başındaki elemanı getirme (null döndürür, hata fırlatmaz)
        String peekElement = queue.peek();
        System.out.println("\nPeek element: " + peekElement);

        // poll(): Kuyruğun başındaki elemanı kaldırma ve getirme (null döndürür, hata fırlatmaz)
        String polledElement = queue.poll();
        System.out.println("\nPolled element: " + polledElement);

        // Elemanları görüntüleme (bir eleman kaldırıldı)
        System.out.println("\nQueue elements after polling: " + queue);

        // remove(): Kuyruğun başındaki elemanı kaldırma ve getirme (hata fırlatır)
        System.out.println("\nqueue before \"remove()\"");
        System.out.println("\nQueue elements before removing: " +queue);
        String removedElement = queue.remove();
        System.out.println("\nRemoved element: " + removedElement);
        
        
     // Elemanları görüntüleme (bir eleman daha kaldırıldı)
        System.out.println("\nQueue elements after removing: " + queue);
        System.out.println("\n");
        
     // Iterator kullanarak elemanlara erişim
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = queue.iterator();
        System.out.print("element: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element+" ");
        }

        System.out.println("\n");
        // for-each döngüsü ile elemanlara erişim
        System.out.println("\nUsing for-each loop:");
        System.out.print("element: ");
        for (String element : queue) {
        	
            System.out.print(element+" ");
        }
        System.out.println("\n");
        // forEach metodu ile elemanlara erişim
        // Java 8 ve sonrasında kullanılabilir
        System.out.println("\nUsing forEach method:");
        System.out.print("element: ");
        queue.forEach(element -> System.out.print(element+" "));
    }
}
