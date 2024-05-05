
public class ArrayOperations
{
	
	public static void main(String[] args)
	{
		double[] testData = {18.86, 19.95, 21.34, 23.77, 24.05};
		
		System.out.printf("The total of the values in the array: %.2f\n", getTotal(testData));
		
		System.out.printf("The average of the values in the array: %.2f\n", getAverage(testData));
		
		System.out.printf("The highest value in the array: %.2f\n", getHighest(testData));
		
		System.out.printf("The lowest value in the array: %.2f", getLowest(testData));
	}
	
	public static double getTotal(double[] array)
	{
		double total = 0.00;
		for(double number : array)
		{
			total += number;
		}
		
		return total;
	}
	
	public static double getAverage(double[] array)
	{
	
		return getTotal(array) / array.length;
	}
	
	public static double getHighest(double[] array)
	{
		double highest = array[0];
		
		for(double number : array)
		{
			if(number > highest)
				highest = number;
		}
		
		return highest;
	}
	
	public static double getLowest(double[] array)
	{
		double lowest = array[0];
		
		for(double number : array)
		{
			if(number < lowest)
				lowest = number;
		}
		
		return lowest;
	}
	
}
