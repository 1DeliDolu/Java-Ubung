package createFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            double alan = alanHesapla("data.txt");
            System.out.println("Koordinatlarin Alani: " + alan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double alanHesapla(String dosyaAdi) throws IOException {
        FileReader fileReader = new FileReader(dosyaAdi);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String satir;
        double alan = 0.0;

        while ((satir = bufferedReader.readLine()) != null) {
            String[] kordinatlar = satir.split(" ");
            
            if (kordinatlar.length == 2) {
                double x = Double.parseDouble(kordinatlar[0]);
                double y = Double.parseDouble(kordinatlar[1]);
                alan += x * y;
            } else {
                System.out.println("Hatalı kordinat formatı: " + satir);
            }
        }

        bufferedReader.close();
        return alan;
    }
}
