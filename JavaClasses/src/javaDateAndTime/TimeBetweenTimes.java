package javaDateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeBetweenTimes {
	//Arbeitzeit 
    public static  void arbeitZeit() {
    	
    	LocalTime time1 = LocalTime.of(9, 23);
        LocalTime time2 = LocalTime.of(17, 45);

        Duration duration = Duration.between(time1, time2);
        
        String text=toString(duration);
        String regex = "\\d+";

        // Pattern nesnesini oluştur
        Pattern pattern = Pattern.compile(regex);

        // Matcher nesnesini metin üzerinde oluştur
        Matcher matcher = pattern.matcher(text);

        // Eşleşen her sayıyı bul ve ekrana yazdır
        while (matcher.find()) {
            System.out.println("Eşleşen sayı: " + matcher.group());
        }
        double intArbeitZeit;
       
        try {
           intArbeitZeit = Integer.parseInt(matcher.group());
        }
        catch (NumberFormatException e) {
        	intArbeitZeit = 0;
        }
        DaysBetweenDates d1= new DaysBetweenDates();
        
        System.out.println("Differenz zwischen " + time1 + " und " + time2 + ": " + duration+" Gehalt:"+intArbeitZeit*d1.longDays());
 
    }


	public static String toString(Duration duration) {
		return "DaysBetweenTimes toString()="+ duration.toString() + "]";
	}
}

