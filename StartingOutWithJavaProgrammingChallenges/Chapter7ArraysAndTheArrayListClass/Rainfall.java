
public class Rainfall
{
	private double[] totalRainfall = new double[12];
	
	public Rainfall()
	{
		
	}
	
	public Rainfall(double [] rainArray)
	{
		int index = 0;
		
		for(double rain: rainArray)
		{
			totalRainfall[index] = rain;
			
			index++;
		}
	}
	
	public void setMonthRainfall(int i, double rainAmount)
	{
		totalRainfall[i] = rainAmount;
	}
	
	public double getMonthRainfall(int i)
	{
		return totalRainfall[i];
	}
	
	public double getTotalRainfall()
	{
		double total = 0;
		
		for(int i = 0; i < totalRainfall.length; i++)
		{
			total += totalRainfall[i];
		}
		
		return total;
	}
	
	public double getAverageMonthlyRainfall()
	{
		return getTotalRainfall() / 12.00;
	}
	
	public int getMonthWithMostRain()
	{
		double most = totalRainfall[0];
		
		int month = 0;
		
		for(int i = 1; i < totalRainfall.length; i++)
		{
			if(most < totalRainfall[i])
			{
				most = totalRainfall[i];
				month = i;
			}
		}
		
		return month;
	}
	
	public int getMonthWithLeastRain()
	{
		double least = totalRainfall[0];

		int month = 0;
		
		for(int i = 1; i < totalRainfall.length; i++)
		{
			if(least > totalRainfall[i])
			{
				least = totalRainfall[i];
				month = i;
			}
		}
		
		return month;
	}
}
