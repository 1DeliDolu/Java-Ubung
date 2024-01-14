package vector;
import java.util.Vector;

public class Vectorr {
	public static void main(String[] args) {
        // Vector oluşturma
        Vector<String> vector = new Vector<>(3, 2); // Başlangıç kapasitesi: 3, Büyüme oranı: 2

        // add(E element): Eleman ekleme
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Kirche");
        vector.add("Mango");
        

        // Elemanları görüntüleme
        System.out.println("\nVector elements: " + vector);

        // add(int index, E element): Belirtilen indekse eleman ekleme
        vector.add(1, "\nGrapes");

        // Elemanları görüntüleme (indekse eleman eklendi)
        System.out.println("\nVector elements after adding at index 1: " + vector);

        // remove(int index): Belirtilen indeksteki elemanı kaldırma
        vector.remove(2);

        // Elemanları görüntüleme (indeksteki eleman kaldırıldı)
        System.out.println("\nVector elements after removing at index 2: " + vector);

        // get(int index): Belirtilen indeksteki elemanı alma
        String elementAtIndex1 = vector.get(1);
        System.out.println("\nElement at index 1: " + elementAtIndex1);

        // size(): Vector'ün eleman sayısını alma
        int size = vector.size();
        System.out.println("\nVector size: " + size);

        // capacity(): Vector'ün şu anki kapasitesini alma
        int capacity = vector.capacity();
        System.out.println("\nVector capacity: " + capacity);

        // trimToSize(): Vector'ün kapasitesini eleman sayısına eşitleyerek gereksiz kapasiteyi kaldırma
        vector.trimToSize();
        System.out.println("\nVector after trimming to size: " + vector);
    }
}

