
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private String stid;
	
	
	
	public MesoAsciiCal(MesoStation mesoStation)   {
		this.stid = mesoStation.getStID();
		
	}
	
	
	public int calAverage()   {
		char[] stidChars = new char[4];
		for (int i = 0; i < stidChars.length; i++)   {
			stidChars[i] = stid.charAt(i);
		}
		double doubleAverage = (stidChars[0] + stidChars[1] + stidChars[2] + stidChars[3]) / 4.0;
		int asciiCeil = (int)(Math.ceil(doubleAverage));
		
		int asciiFloor = (int)(Math.floor(doubleAverage));
		
		int asciiRound = (int)(Math.round((asciiCeil + asciiFloor)/2.0));
		
		return asciiRound;
		
	}
}