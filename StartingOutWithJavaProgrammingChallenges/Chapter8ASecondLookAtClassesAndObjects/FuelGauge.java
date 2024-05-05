
public class FuelGauge
{
	private int gallonsOfFuel;
	
	public FuelGauge()
	{

	}
	
	public FuelGauge(int gallonsOfFuel)
	{
		setGallonsOfFuel(gallonsOfFuel);
	}
	
	public FuelGauge(FuelGauge fuelGauge)
	{
		setGallonsOfFuel(fuelGauge.getGallonsOfFuel());
	}
	
	public void incGallons()
	{
		if(gallonsOfFuel <= 15)
			gallonsOfFuel++;
	}
	
	public void decGallons()
	{
		if(gallonsOfFuel > 0)
			gallonsOfFuel--;
	}
	
	public int getGallonsOfFuel()
	{
		return gallonsOfFuel;
	}

	public void setGallonsOfFuel(int gallonsOfFuel)
	{
		this.gallonsOfFuel = gallonsOfFuel;
	}
	
}

/*
• The FuelGauge Class:
	This class will simulate a fuel gauge. Its responsibilities are as follows:
		• To know the car’s current amount of fuel, in gallons.
		• To report the car’s current amount of fuel, in gallons.
		• To be able to increment the amount of fuel by 1 gallon.
			This simulates putting fuel in the car. (The car can hold a maximum of 15 gallons.)
		• To be able to decrement the amount of fuel by 1 gallon,
			if the amount of fuel is greater than 0 gallons.
			This simulates burning fuel as the car runs.
*/
