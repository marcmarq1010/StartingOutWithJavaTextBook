
public class CarInstrumentSimulator
{

	public static void main(String[] args)
	{
		FuelGauge fuelGauge = new FuelGauge(15);
		
		Odometer odometer = new Odometer(fuelGauge);
		
		driveCar(odometer);
	}
	
	public static void driveCar(Odometer odometer)
	{		
		while(odometer.getFuelGauge().getGallonsOfFuel() > 0)
		{
			System.out.printf("Current mileage: %d\n", odometer.getMileage());
			System.out.printf("Current fuel: %d\n\n", odometer.getFuelGauge().getGallonsOfFuel());
			odometer.incMileage();
			odometer.useFuel();
		}
	}

}

/*
	Demonstrate the classes by creating instances of each.
	Simulate filling the car up with fuel, and then run a loop that increments the odometer until the car runs out of fuel.
	During each loop iteration, print the car’s current mileage and amount of fuel.
*/