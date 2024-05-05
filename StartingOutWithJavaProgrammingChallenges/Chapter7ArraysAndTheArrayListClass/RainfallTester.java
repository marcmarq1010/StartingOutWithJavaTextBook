import java.util.Scanner;

public class RainfallTester
{

	public static void main(String[] args)
	{
		Rainfall rainfall = new Rainfall();
		
		displayMenu();
		enterMonthlyRainfall(rainfall);
		displayResults(rainfall);
	}
	
	public static void displayMenu()
	{
		System.out.printf("This program allows the user to store the total rainfall for each of 12 months.\n");

		System.out.printf("Enter the rainfall for each month starting with January.\n");		
	}
	
	public static void enterMonthlyRainfall(Rainfall rainfall)
	{
		Scanner keyboard = new Scanner(System.in);
		
		final int NUM_OF_MONTHS = 12; 
		String month = "";
		double amount = 0;
		
		for(int i = 0; i < NUM_OF_MONTHS; i++)
		{
			month = getMonth(i);
			
			System.out.printf("Enter the amount of rainfall for %s:\n", month);
			amount = keyboard.nextDouble();
			
			while(amount < 0)
			{
				System.out.printf("Input Validation: Do not enter negative numbers for monthly rainfall figures\n");
				System.out.printf("Enter the amount of rainfall for %s:\n", month);
				amount = keyboard.nextDouble();
			}
			
			rainfall.setMonthRainfall(i, amount);
			
		}
		
		keyboard.close();
	}
	
	public static String getMonth(int i)
	{
		switch(i)
		{
			case 0:
				return "January";
			case 1:
				return "February";
			case 2:
				return "March";
			case 3:
				return "April";
			case 4:
				return "May";
			case 5:
				return "June";
			case 6:
				return "July";
			case 7:
				return "August";
			case 8:
				return "September";
			case 9:
				return "October";
			case 10:
				return "November";
			case 11:
				return "December";
		}
		return "";
	}
	
	public static void displayResults(Rainfall rainfall)
	{
		System.out.printf("The total rainfall for the year is %.2f\n", rainfall.getTotalRainfall());
		
		System.out.printf("The month with the most rain was %s\n", getMonth(rainfall.getMonthWithMostRain()));
		
		System.out.printf("The month with the least rain was %s\n", getMonth(rainfall.getMonthWithLeastRain()));
		
		System.out.printf("The average monthly rainfall was %.2f\n", rainfall.getAverageMonthlyRainfall());
	}

}
