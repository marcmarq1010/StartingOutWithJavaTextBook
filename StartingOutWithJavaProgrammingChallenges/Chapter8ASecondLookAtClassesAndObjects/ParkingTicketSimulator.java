
public class ParkingTicketSimulator
{

	public static void main(String[] args)
	{
		ParkedCar myCar = new ParkedCar("Toyota", "Tacoma", "BLUE", "RHS-113", 210);
		
		ParkingMeter meter = new ParkingMeter(120);
		
		PoliceOfficer cop = new PoliceOfficer("Officer Sanchez", 90210);
		
		if(cop.issueParkingTicket(meter.getNumOfMinutesPurchased(), myCar.getMinutesParked()))
			cop.generateParkingTicket(myCar, meter);
		
		System.out.printf("%s", cop.getParkingTicket().reportIllegallyParkedCar());
		
		System.out.printf("%s", cop.getParkingTicket().reportFineAmount());
		
		System.out.printf("%s", cop.getParkingTicket().reportOfficerInfo(cop.getOfficerName(), cop.getBadgeNumber()));
		
	}
	
}

/*
	Write a program that demonstrates how these classes collaborate.
*/