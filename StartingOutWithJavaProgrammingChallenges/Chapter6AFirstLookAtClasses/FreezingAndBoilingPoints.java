
public class FreezingAndBoilingPoints
{
	private double temperature;
	
	
	public FreezingAndBoilingPoints()
	{
		
	}
	
	public void setTemperature(double temp)
	{
		temperature = temp;
	}
	
	public double getTemperature()
	{
		return temperature;
	}
	
	public boolean isEthylFreezing()
	{
		if(temperature <= -173)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isEthylBoiling()
	{
		if(temperature >= 172)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isOxygenFreezing()
	{
		if(temperature <= -362)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isOxygenBoiling()
	{
		if(temperature >= -306)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isWaterFreezing()
	{
		if(temperature <= 32)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isWaterBoiling()
	{
		if(temperature >= 212)
		{
			return true;
		}
		
		return false;
	}
}
