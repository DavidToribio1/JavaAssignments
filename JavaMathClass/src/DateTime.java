
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime {

	//This class shows some usage of Java 8 date/time API
	public static void main(String[] args) {
	//dates e.g. 2022-21-03
		
		//Current Date
		LocalDate currentDate = LocalDate.now();
		// 2022-03-21
		LocalDate twentyoneMar2022 = LocalDate.of(2022, Month.MARCH,  21);
		//months values start at 1(2014-08-01)
		LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
		//the 65th day of 2010(2010-08-01)
		LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
		//times, e.g. 19:12:30
		
		LocalTime currentTime = LocalTime.now();
		LocalTime midday = LocalTime.of(12, 0);
		LocalTime afterMidday = LocalTime.of(13, 30, 15);
		
		//12345th second of day(03:25:45)
		LocalTime fromSecondsOFDay = LocalTime.ofSecondOfDay(12345);
		
		//dates with times, e.g. 2014-02-18
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		//2014-10-02
		LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
		
	

		
	}

}
