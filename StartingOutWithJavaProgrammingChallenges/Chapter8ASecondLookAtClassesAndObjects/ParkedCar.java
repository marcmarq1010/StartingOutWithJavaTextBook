
public class ParkedCar
{
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;
	
	public ParkedCar()
	{
		
	}
	public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked)
	{
		setMake(make);
		setModel(model);
		setColor(color);
		setLicenseNumber(licenseNumber);
		setMinutesParked(minutesParked);
	}

	public ParkedCar(ParkedCar parkedCar)
	{
		setMake(parkedCar.getMake());
		setModel(parkedCar.getModel());
		setColor(parkedCar.getColor());
		setLicenseNumber(parkedCar.getLicenseNumber());
		setMinutesParked(parkedCar.getMinutesParked());
	}

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getLicenseNumber()
	{
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) 
	{
		this.licenseNumber = licenseNumber;
	}

	public int getMinutesParked()
	{
		return minutesParked;
	}

	public void setMinutesParked(int minutesParked)
	{
		this.minutesParked = minutesParked;
	}
	
}
