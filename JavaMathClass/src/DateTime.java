
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
	
		
		LocalDate obj = LocalDate.now();
		
		System.out.println("Before Formating" + obj );
		DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-MM-yyy MM:hh:SS");
		String afterFormate = obj.format(formated);
		System.out.println("After Formating" + afterFormate);
	}

}
