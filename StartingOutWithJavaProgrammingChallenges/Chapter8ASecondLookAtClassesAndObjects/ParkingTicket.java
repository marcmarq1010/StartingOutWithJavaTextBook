
public class ParkingTicket
{
	private ParkedCar parkedCar;
	private ParkingMeter parkingMeter;
	
	public ParkingTicket()
	{
		
	}
	
	public ParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter)
	{
		this.parkedCar  = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	public double getFineAmount()
	{
		double fineAmount = 0;
		
		double hoursParked = (parkedCar.getMinutesParked() - parkingMeter.getNumOfMinutesPurchased()) / 60;
		
		
		
		for(int i = 0; i < hoursParked; i++)
		{
			if(i == 0)
				fineAmount += 25;
			
			fineAmount += 10;
		}
			return fineAmount;
	}
	
	public String reportIllegallyParkedCar()
	{
		String report = String.format("Make: %-10s\nModel: %-10s\nColor: %-10s\nLicense Number: %-10s\n\n"
									 , parkedCar.getMake()
									 , parkedCar.getModel()
									 , parkedCar.getColor()
									 , parkedCar.getLicenseNumber());
		return report;
	}
	
	public String reportFineAmount()
	{
		String report = String.format("Fine Amount: $%,-10.2f\n\n", getFineAmount());
		
		return report;
	}
	
	public String reportOfficerInfo(String officerName, int badgeNumber)
	{
		String report = String.format("Name: %-10s\nBadgeNumber: %-10s\n\n", officerName, badgeNumber);
				
		return report;
	}
}

/*
	The ParkingTicket Class: This class should simulate a parking ticket.
	The class’s responsibilities are as follows:
		– To report the make, model, color, and license number of the illegally parked car
		– To report the amount of the fine, which is $25 for the first hour or part of an
			hour that the car is illegally parked, plus $10 for every additional hour or part of
			an hour that the car is illegally parked
		– To report the name and badge number of the police officer issuing the ticket
*/