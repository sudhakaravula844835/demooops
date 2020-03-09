package Employee;

import java.time.LocalDate;
import java.util.Locale;

public class Date {
	public static void main(String [] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		Date newPattern = Date.ofPattren;
				String Date1 = date.format(newPattern);
		System.out.println(Date1);
		
		Date french= Date.ofPattern("d.MM YYYY",Locale.FRENCH);
		String frenchDate = date.formate(french);
		System.out.println(frenchDate);
		
		LocaleTime time = LocaleTime.now();
		Date formatter=Date.ofPattern ("hh:mm:ss");
		System.out.println(formatter.format(time));
	}
	}

}
