
public class Temperature
{
	private double fTemp;
	
	public Temperature()
	{
		
	}
	
	public Temperature(double temp)
	{
		setFahrenheit(temp);
	}
	
	public double getCelsius()
	{
		return (5.0/9.0) * (fTemp - 32);
	}
	
	public double getKelvin()
	{
		return ((5.0/9.0) * (fTemp - 32)) + 273;
	}
	
	public void setFahrenheit(double temp)
	{
		fTemp = temp;
	}
	
	public double getFahrenheit()
	{
		return fTemp;
	}
}
