package in.org.bharani.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Times {
	public static void main(String args[]) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("date is -----   " + date);
		System.out.println(" time is  ------  " + time);
		System.out.println("date and time is  ---------   " + ldt);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM > dd > yyyy <HH  < mm < ss <ns");
		String date1 = format.format(ldt);
		System.out.println(date1);
	}
}
