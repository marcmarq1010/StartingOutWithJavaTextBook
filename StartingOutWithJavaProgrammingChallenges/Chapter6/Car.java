
public class Car 
{
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year, String make)
	{
		setYearModel(year);
		setMake(make);
		setSpeed(0);
	}

	public void accelerate()
	{
		setSpeed(getSpeed() + 5);
	}
	
	public void brake()
	{
		setSpeed(getSpeed() - 5);
	}
	
	public int getYearModel()
	{
		return yearModel;
	}

	public void setYearModel(int yearModel)
	{
		this.yearModel = yearModel;
	}

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
}
