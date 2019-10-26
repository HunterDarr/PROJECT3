import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class DateTimeTwo {
	private Calendar cal = Calendar.getInstance();
	private int month = cal.get(Calendar.MONTH);
	private HashMap<LocalDate, Integer> readDates;
	
	public void daysOfCurrentMonth()   {
		GregorianCalendar dayCalendar = new GregorianCalendar(2019, month, 10);
		GregorianCalendar day2Calendar = new GregorianCalendar(2019, month, 18);
		
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		
		System.out.println("The tenth day of this month is " + format.format(dayCalendar.getTime()) + " and eighteenth is " + 
				format.format(day2Calendar.getTime()));
	}
	
	public void daysOfAnyMonth(int month, int year)   {
		GregorianCalendar dayCalendar = new GregorianCalendar(year, month-1, 15);
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		int daysInMonth = dayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		GregorianCalendar day2Calendar = new GregorianCalendar(year, month-1, daysInMonth);
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " +
		format.format(dayCalendar.getTime()) + " and the last day is " + format.format(day2Calendar.getTime()));
	}
	
	public void compareYear() throws IOException   {
		BufferedReader fileIn = new BufferedReader(new FileReader("Dates.txt"));
		readDates = new HashMap<LocalDate, Integer>();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		String nextLine = fileIn.readLine();
		int index = 1;
		while (nextLine != null)   {
			readDates.put(LocalDate.parse(nextLine, format), index);
			index = index + 1;
			nextLine = fileIn.readLine();
		}	
		
		LocalDate today = LocalDate.now();

		for (int i = 1; i < index; i++)  {
			for ( LocalDate date: readDates.keySet() )   {
				if ( i == readDates.get(date))   {
					String distanceBetweenDates = distanceBetween(date, today);
					boolean isLeapYear = date.isLeapYear();
					if (isLeapYear)   {
						System.out.println( date.getYear() + " is a leap year, and Difference: " + distanceBetweenDates);
					}
					else   {
						System.out.println( date.getYear() + " is not a leap year, and Difference: " + distanceBetweenDates);
					}
				}

			}
		}
	}
	
	private String distanceBetween(LocalDate difference, LocalDate now)   {
		LocalDate date = now.minusYears(difference.getYear());
		date = date.minusMonths(difference.getMonthValue());
		date = date.minusDays(difference.getDayOfMonth());
		int years = date.getYear();
		int months = date.getMonthValue();
		int days = date.getDayOfMonth();
		return years + " years, " + months + " months, and " + days + " days.";
	}
	
	
	public void dateHashMap()   {
		for ( LocalDate date: readDates.keySet())   {
			System.out.println(date.toString());
		}
	}
	
	
	
	

}
