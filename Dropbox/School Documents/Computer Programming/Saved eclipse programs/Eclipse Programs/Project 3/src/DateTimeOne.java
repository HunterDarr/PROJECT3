import java.util.concurrent.TimeUnit;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private static final int MILLI_CONVERSION = 1000;
   
	
	
	
	
	public int getValueOfSecond()   {
		return (int)(System.currentTimeMillis() / MILLI_CONVERSION % 60);
	}
	
	
	public void dateTimeNow()   {
		
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
		
	}
	
	public void dateTimeDifferentZone()   {
		
	}
	
	public void timeZoneHashMap()   {
		
	}
}