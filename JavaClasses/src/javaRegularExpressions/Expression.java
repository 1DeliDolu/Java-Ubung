package javaRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
    public static void main(String[] args) {
	    //abcFind();//[abc]:Find one character from the options between the brackets
    	
    	//abcFind1();
	       
	    //dachAbc();//[^abc]:Find one character NOT between the brackets
	       
	    //numberFind();//[0-9]:Find one character from the range 0 to 9
	    
	    //mehrereWörterFinder(); // |: Find a match for any one of the patterns separated by | as in: cat|dog|fish
	    
	    //jedesCharFinder();// .: Find just one instance of any character
	    
	    //anfangWörterFinder();// ^: Finds a match as the beginning of a string as in: ^Hello
	    
	    //endeWörterFinder();// $: Finds a match at the end of the string as in: World$
	       
	    //zahlFinder();// \d:	Find a digit
	       
	    //lückeFinder();// \s: Find a whitespace character
	      
	    
	    //genauWörterFinder();// \b: Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
	       
	    //unicodeFinder();// \"uxxxx : Find the Unicode character specified by the hexadecimal number xxxx
	       
	    //wiederholungCharFinder(); // n+:  Matches any string that contains at least one n
	       
	    //wiederholungCharFinder1();// n* : Matches any string that contains at least one n
	     // System.out.println( "--"); 
	    //wiederholungCharFinder2();// n?: Matches any string that contains zero or one occurrences of n
	       
	    //vielfachFinder();// n{x}: Matches any string that contains a sequence of X n's
	       
	    //vielfachFinder1();// n{x,y}: Matches any string that contains a sequence of X to Y n's
	       
	    //vielfachFinder2();// n{x,}: Matches any string that contains a sequence of at least X n's
    }
    
    
    //public static String abcFind(String str) {
    public static void abcFind() {
        // Örnek bir metin
        String text = "abc123def456ghi789";

        // [abc] ifadesini içeren bir düzenli ifade oluştur
        //String regex = str;
        String regex = "[abi1]";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her karakteri bul ve ekrana yazdır
        while (matcher.find()) {
           System.out.println("Eşleşen karakter: " + matcher.group());
        }
      //return  matcher.group();
    }
    
    public static void abcFind1() {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
          System.out.println("Match found");
          
        } else {
          System.out.println("Match not found");
        }
      }
    
    // Outputs Match found
      
    public static void dachAbc() {
        // Örnek bir metin
        String text = "abc123def456ghi789";

        // [^abc] ifadesini içeren bir düzenli ifade oluştur
        String regex = "[^abc]";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her karakteri bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen karakter: " + matcher.group());
        }
        //return matcher.group()
    }
    
    public static void numberFind() {
        // Örnek bir metin
        String text = "abc123def456ghi789";

        // [0-9] ifadesini içeren bir regular ifade oluştur
        String regex = "[0-9]";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her rakamı bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen rakam: " + matcher.group());
        }
    }
    public static void mehrereWörterFinder() {
        // Örnek bir metin
        String text = "Evimde bir kedi var. Komşumun bir köpek var. Bizim de bir evcil balik var.";

        // "cat", "dog" veya "fish" ifadelerini içeren bir düzenli ifade oluştur
        String regex = "kedi|köpek|balik";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her kelimeyi bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen kelime: " + matcher.group());
        }
    }
    public static void jedesCharFinder() {
        // Örnek bir metin
        String text = "cat, dog, fish";

        // Herhangi bir tek karakteri temsil eden bir düzenli ifade oluştur
        String regex = ".";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her karakteri bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen karakter: " + matcher.group());
        }
    }
    public static void anfangWörterFinder() {
        // Örnek bir metin
        String text = "elma\nmuz\nkiraz";

        // Satırın başındaki "elma" kelimesini eşleştirmeye çalışan bir düzenli ifade oluştur
        String regex = "^elma";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her kelimeyi bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen kelime: " + matcher.group());
        }
    }
    public static void endeWörterFinder() {
        // Örnek bir metin
        String text = "elma\nmuz\nkiraz";

        // Satırın sonundaki "kiraz" kelimesini eşleştirmeye çalışan bir düzenli ifade oluştur
        String regex = "kiraz$";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her kelimeyi bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen kelime: " + matcher.group());
        }
    }
    public static void zahlFinder() {
        // Örnek bir metin
        String text = "123 elma, 456 muz, 789 kiraz";

        // Sayı karakterini temsil eden bir düzenli ifade oluştur
        String regex = "\\d+";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her sayıyı bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen sayı: " + matcher.group());
        }
    }
    public static void lückeFinder() {
        // Örnek bir metin
        String text = "elma muz   kiraz";

        // Boşluk karakterini temsil eden bir düzenli ifade oluştur
        String regex = "\\s+";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her boşluk dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen boşluk dizisi: '" + matcher.group() + "'");
        }
    }
    public static void genauWörterFinder() {
        // Örnek bir metin
        String text = "elma muz kiraz";

        // Kelime sınırlarını temsil eden bir düzenli ifade oluştur
        String regex = "\\belma\\b";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen kelimeyi bul ve ekrana yazdır
        if (matcher.find()) {
            System.out.println("Eşleşen kelime: '" + matcher.group() + "'");
        } else {
            System.out.println("Eşleşen kelime bulunamadı.");
        }
    }
    public static void unicodeFinder() {
        // Unicode karakterini temsil eden bir düzenli ifade oluştur
        String regex = "\\u0041";

        // Unicode karakterini eşleştirmeye çalış
        if ("A".matches(regex)) {
            System.out.println("Unicode karakteri eşleşti.");
        } else {
            System.out.println("Unicode karakteri eşleşmedi.");
        }
    }
    public static void wiederholungCharFinder() {
        // Örnek bir metin
        String text = "nn nnn nnnn n";

        // n karakterinin bir veya daha fazla tekrarını temsil eden bir düzenli ifade oluştur
        String regex = "n+";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n dizisi: " + matcher.group());
        }
    }
    public static void wiederholungCharFinder1() {
        // Örnek bir metin
        String text = "nn nnn nnnn n";

        // n karakterinin sıfır veya daha fazla tekrarını temsil eden bir düzenli ifade oluştur
        String regex = "n*";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n dizisi: " + matcher.group());
        }
    }
    public static void wiederholungCharFinder2() {
        // Örnek bir metin
        String text = "nn nnn nnnn n";

        // n karakterinin sıfır veya bir kez tekrarını temsil eden bir düzenli ifade oluştur
        String regex = "n?";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n karakterini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n karakteri: " + matcher.group());
        }
    }
    public static void vielfachFinder() {
        // Örnek bir metin
        String text = "nnnn nnn nnnn n";

        // n karakterinin tam olarak üç kez tekrarını temsil eden bir regular ifade oluştur
        String regex = "n{3}";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n dizisi: " + matcher.group());
        }
    }
    public static void vielfachFinder1() {
        // Örnek bir metin
        String text = "nnnn n nn nnnn nnnnn";

        // n karakterinin en az üç, en fazla beş kez tekrarını temsil eden bir regular ifade oluştur
        String regex = "n{3,5}";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n dizisi: " + matcher.group());
        }
    }
    public static void vielfachFinder2() {
        // Örnek bir metin
        String text = "nnnn nnn nnnn nnnnn";

        // n karakterinin en az üç kez tekrarını temsil eden bir regular ifade oluştur
        String regex = "n{3,}";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her n dizisini bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen n dizisi: " + matcher.group());
        }
    }
}