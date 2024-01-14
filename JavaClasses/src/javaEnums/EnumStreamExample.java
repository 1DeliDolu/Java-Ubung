package javaEnums;

import java.util.stream.Stream;



public class EnumStreamExample {
	public enum DaysOfWeekEnum {
	    SUNDAY("off"), 
	    MONDAY("working"), 
	    TUESDAY("working"), 
	    WEDNESDAY("working"), 
	    THURSDAY("working"), 
	    FRIDAY("working"), 
	    SATURDAY("off");

	    private String typeOfDay;

	    DaysOfWeekEnum(String typeOfDay) {
	        this.typeOfDay = typeOfDay;
	    }
		
	    public String getTypeOfDay() {
	        return typeOfDay;
	    }

	    public static Stream<DaysOfWeekEnum> stream() {
	        return Stream.of(DaysOfWeekEnum.values()); 
	    }
	}
    public static void main(String[] args) {
        DaysOfWeekEnum.stream()
            .filter(d -> "off".equals(d.getTypeOfDay()))
            .forEach(System.out::println);
    }
}
