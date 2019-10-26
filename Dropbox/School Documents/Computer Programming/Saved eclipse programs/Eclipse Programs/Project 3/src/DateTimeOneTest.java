import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class DateTimeOneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getValueOfSecondTest() {
		DateTimeOne dateTimeOne = new DateTimeOne();

		int actual = dateTimeOne.getValueOfSecond();
		int expected = (int)(System.currentTimeMillis() / 1000 % 60);
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testDateTimeOtherCity()    {
		DateTimeOne test = new DateTimeOne();
		System.out.println("testDateTimeOtherCity");
		test.dateTimeOfOtherCity();	
	}
	
	
	@Test
	public void testDateTimeNow()   {
		DateTimeOne test = new DateTimeOne();
		System.out.println("testDateTimeNow");
		test.dateTimeNow();
	}
	
	
	@Test
	public void testDateTimeDifferentZone()   {
		DateTimeOne test = new DateTimeOne();
		System.out.println("testDateTimeDifferentZone");
		test.dateTimeDifferentZone();
	}
	
	
	@Test
	public void testTimeZoneHashMap()   {
		DateTimeOne test = new DateTimeOne();
		System.out.println("testTimeZoneHashMap()");
		test.timeZoneHashMap();
	}
	
	@Test
	public void testDaysOfCurrentMonth()   {
		DateTimeTwo test = new DateTimeTwo();
		System.out.println("testDaysOfCurrentMonth");
		test.daysOfCurrentMonth();
	}
	
	@Test
	public void testDaysOfAnyMonth()   {
		DateTimeTwo test = new DateTimeTwo();
		System.out.println("testDaysOfAnyMonth");
		test.daysOfAnyMonth(11, 2019);
		test.daysOfAnyMonth(2, 2020);
		
	}
	
	@Test
	public void testCompareYear() throws IOException   {
		System.out.println("testCompareYear");
		DateTimeTwo test = new DateTimeTwo();
		test.compareYear();

	}
	
	@Test
	public void testDateHashMap() throws IOException  {
		System.out.println("testDateHashMap");
		DateTimeTwo test = new DateTimeTwo();
		test.dateHashMap();
	}
	
	@Test
	public void testDateHashMapSorted() throws IOException   {
		System.out.println("testDateHashMapSorted");
		DateTimeTwo test = new DateTimeTwo();
		test.dateHashMapSorted();
	}
	
	@Test public void testCalAverage()   {
		System.out.println("testCalAverage");
		MesoAsciiCal test = new MesoAsciiCal(new MesoStation("NRMN"));
		test.calAverage();
	}

}
