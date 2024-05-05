
public class ParkingMeter
{
	private int numOfMinutesPurchased;
	
	public ParkingMeter()
	{
		
	}
	
	public ParkingMeter(int numOfMinutesPurchased)
	{
		setNumOfMinutesPurchased(numOfMinutesPurchased);
	}


	public ParkingMeter(ParkingMeter parkingMeter)
	{
		setNumOfMinutesPurchased(parkingMeter.getNumOfMinutesPurchased());
	}

	public int getNumOfMinutesPurchased()
	{
		return numOfMinutesPurchased;
	}

	public void setNumOfMinutesPurchased(int numOfMinutesPurchased)
	{
		this.numOfMinutesPurchased = numOfMinutesPurchased;
	}
	
	
}
