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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class DateTimeTwo {
	private Calendar cal = Calendar.getInstance();
	private int month = cal.get(Calendar.MONTH);
	
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
		HashMap<LocalDate, Integer> readDates = new HashMap<LocalDate, Integer>();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		String nextLine = fileIn.readLine();
		int i = 1;
		while (nextLine != null)   {
			readDates.put(LocalDate.parse(nextLine, format), i);
			i = i + 1;
			nextLine = fileIn.readLine();
		}	
	}
	
	for ( LocalDate )
	

}
