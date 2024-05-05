
public class Odometer
{
	private int mileage;
	private FuelGauge fuelGauge;
	
	public Odometer()
	{
		setMileage(0);
	}
	
	public Odometer(int mileage)
	{
		setMileage(mileage);
	}
	
	public Odometer(FuelGauge fuelGauge)
	{
		setMileage(0);
		this.fuelGauge = new FuelGauge(fuelGauge);
	}
	
	public FuelGauge getFuelGauge()
	{
		return new FuelGauge(fuelGauge); 		
	}
	
	public void incMileage()
	{
		mileage++;
		
		if(mileage > 999999)
			mileage = 0;	
	}
	
	public void resetOdometer()
	{
		mileage = 0;
	}
	
	public void useFuel()
	{		
		if(mileage % 24 == 0)
			fuelGauge.decGallons();
	}

	public int getMileage()
	{
		return mileage;
	}

	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}
	
}

/*
• The Odometer Class:
	This class will simulate the car’s odometer. Its responsibilities are as follows:
		• To know the car’s current mileage.
		• To report the car’s current mileage.
		• To be able to increment the current mileage by 1 mile.
		The maximum mileage the odometer can store is 999,999 miles.
		When this amount is exceeded, the odometer resets the current mileage to 0.
		• To be able to work with a FuelGauge object.
		It should decrease the FuelGauge object’s current amount of fuel by 1 gallon for every 24 miles traveled.
		(The car’s fuel economy is 24 miles per gallon.)
*/