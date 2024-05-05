
public class PoliceOfficer
{
	private String officerName;
	private int badgeNumber;
	private ParkingTicket parkingTicket;
	
	public PoliceOfficer()
	{
		
	}
	
	public PoliceOfficer(String officerName, int badgeNumber)
	{
		setOfficerName(officerName);
		setBadgeNumber(badgeNumber);
	}
	
	public boolean issueParkingTicket(double numOfMinutesPurchased, double minutesParked)
	{
		if(numOfMinutesPurchased < minutesParked)
			return true;//	generate a ParkingTicket object
		else
			return false;// Do not generate a ParkingTicket object
	}
	
	public void generateParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter)
	{
		parkingTicket = new ParkingTicket(parkedCar, parkingMeter);
	}
	
	public ParkingTicket getParkingTicket()
	{
		return parkingTicket;
	}

	public String getOfficerName()
	{
		return officerName;
	}

	public void setOfficerName(String officerName)
	{
		this.officerName = officerName;
	}

	public int getBadgeNumber()
	{
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber)
	{
		this.badgeNumber = badgeNumber;
	}
	
	
}

/*
For this assignment you will design a set of classes
that work together to simulate a police officer issuing a parking ticket.
You should design the following classes:
				
	• The PoliceOfficer Class:
		This class should simulate a police officer inspecting parked cars.
		The class’s responsibilities are as follows:
			– To know the police officer’s name and badge number
			– To examine a ParkedCar object and a ParkingMeter object, and determine whether
				the car’s time has expired
			– To issue a parking ticket (generate a ParkingTicket object) if the car’s time
				has expired
*/