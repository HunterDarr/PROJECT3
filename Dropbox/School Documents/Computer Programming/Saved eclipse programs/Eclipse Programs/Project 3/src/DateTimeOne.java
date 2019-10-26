import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private static final int MILLI_CONVERSION = 1000;
	private long milliSeconds;
	
	
	public DateTimeOne()   {
		milliSeconds = System.currentTimeMillis();
	}
	
	
	public int getValueOfSecond()   {
		return (int)(milliSeconds / MILLI_CONVERSION % 60);
	}
	
	
	public void dateTimeNow()   {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
		Calendar calendar = new GregorianCalendar();
//		int hours = getCurrentHours();   //NEEDS TO BE IN PM OR AM
//		String amOrPm = "AM";
//		if (getCurrentHours() > 12)   {
//			hours = hours - 12;
//			amOrPm = "PM";
//		}
		System.out.println("Current Date/Time: " + dateFormat.format(calendar.getTime()));

	}
	
	
	public void sleepForFiveSec()   {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		int startTime = (int)(System.currentTimeMillis() / MILLI_CONVERSION % 60);
//		while (((int)(System.currentTimeMillis() / MILLI_CONVERSION % 60)) < (startTime + 5))   {
//		}
	}
	
	
	public void dateTimeOfOtherCity()   {
		SimpleDateFormat serverTime = new SimpleDateFormat("H:mm");
		SimpleDateFormat timeGmt = new SimpleDateFormat("H:mm");
		timeGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat timeBst = new SimpleDateFormat("H:mm");
		timeBst.setTimeZone(TimeZone.getTimeZone("BST"));
		SimpleDateFormat timeCst = new SimpleDateFormat("H:mm");
		timeCst.setTimeZone(TimeZone.getTimeZone("CST"));
		Calendar calendar = new GregorianCalendar();
		
		System.out.println("Time on Server: " + serverTime.format(calendar.getTime()));
		System.out.println("GMT: " + timeGmt.format(calendar.getTime()));
		System.out.println("BST (90E): " + timeBst.format(calendar.getTime()));
		System.out.println("CST (90W): " + timeCst.format(calendar.getTime()));
		
		
	}
	
	public void dateTimeDifferentZone()   {
		SimpleDateFormat serverTime = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		SimpleDateFormat timeGmt = new SimpleDateFormat("HH:mm");
		timeGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat timeBst = new SimpleDateFormat("HH:mm");
		timeBst.setTimeZone(TimeZone.getTimeZone("BST"));
		SimpleDateFormat timeCst = new SimpleDateFormat("HH:mm");
		timeCst.setTimeZone(TimeZone.getTimeZone("CST"));
		Calendar calendar = new GregorianCalendar();
		
		System.out.println("GMT: " + timeGmt.format(calendar.getTime()));
		System.out.println("BST: " + timeBst.format(calendar.getTime()));
		System.out.println("CST: " + timeCst.format(calendar.getTime()));
	}
	
	public void timeZoneHashMap()   {
		
		HashMap<String, GregorianCalendar> timeMap = new HashMap<String, GregorianCalendar>();
		timeMap.put("AST", new GregorianCalendar(2020, 9, 1, 19, 59));
		timeMap.put("BST", new GregorianCalendar(TimeZone.getTimeZone("BST")));
		timeMap.put("CST", new GregorianCalendar(TimeZone.getTimeZone("CST")));
		timeMap.put("GMT", new GregorianCalendar(TimeZone.getTimeZone("GMT")));
		timeMap.put("ZST", new GregorianCalendar(2018, 10, 5, 19, 59));
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		System.out.println("Print Style 1:");
		for (String dateTime: timeMap.keySet())   {
			format.setTimeZone(timeMap.get(dateTime).getTimeZone());
			System.out.println(dateTime + ": " + format.format(timeMap.get(dateTime).getTime()));
		}
		
		System.out.println("Print Style 3:");
		Map<String, GregorianCalendar> testSort = new TreeMap<String, GregorianCalendar>(timeMap);
		for ( String test: testSort.keySet())   {
			format.setTimeZone(timeMap.get(test).getTimeZone());
			System.out.println(format.format(testSort.get(test).getTime()));
		}
		
		System.out.println("Print Style 5:");
		for ( String test: testSort.keySet())   {   //MOST LIKELY VERY WRONG FIX TOMORROW. LOCALDATETIME??
			format = new SimpleDateFormat("yyyy-MM-dd");
			format.setTimeZone(timeMap.get(test).getTimeZone());
			System.out.print(format.format(testSort.get(test).getTime()));
			System.out.print("T");
			format = new SimpleDateFormat("HH:mm");
			format.setTimeZone(timeMap.get(test).getTimeZone());
			System.out.println(format.format(testSort.get(test).getTime()));
		}
		
		
		ArrayList<SimpleDateFormat> printStyle5 = new ArrayList<SimpleDateFormat>();
		
//		ArrayList<GregorianCalendar> sortedList = new ArrayList<GregorianCalendar>();
//		for ( String calendarToAdd: timeMap.keySet() )   {
//			format.setTimeZone(timeMap.get(calendarToAdd).getTimeZone());
//			sortedList.add(timeMap.get(calendarToAdd));
//		}
//		Collections.sort(sortedList);
//		System.out.println("Print Style 3:");
//		for ( GregorianCalendar calendar: sortedList)   {
//			format.setTimeZone(calendar.getTimeZone());
//			System.out.println("THIS2: " +format.format(calendar.getTime()));
//		}
		
		
//		Calendar ast = new GregorianCalendar(2020, 9, 1, 19, 59);  // 
//		Calendar zst = new GregorianCalendar(2018, 10, 5, 19, 59); //4 might need to be 5
//		System.out.println("Test: " + format.format(ast.getTime()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	private int getSeconds()   {
//		return (int)(milliSeconds / MILLI_CONVERSION);
//	}
//	
//	public int getMinutes()   {
////		System.out.println("SECONDS GOING IN: " + getSeconds());   //testing
//		return getSeconds() / 60;
//	}
	
//	private int getHours()    {
//		return getMinutes() / 60;
//	}
//	
//	private int getCurrentHours()   {
//		return getHours() % 24;
//	}
//	
//	private int getCurrentMinutes()   {
//		return getMinutes() % 60;
//	}
}