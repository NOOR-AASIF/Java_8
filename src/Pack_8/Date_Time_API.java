package Pack_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_API {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd:MM:YY")));
		System.out.println(date.plusDays(30));
		System.out.println(date.plusMonths(30));
		System.out.println(date.plusYears(30));
		System.out.println(date.minusDays(30));
		System.out.println(date.minusMonths(30));
		System.out.println(date.minusYears(30));
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.format(DateTimeFormatter.ofPattern("dd:MM:YY  hh:mm:ss")));
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
	}

}

