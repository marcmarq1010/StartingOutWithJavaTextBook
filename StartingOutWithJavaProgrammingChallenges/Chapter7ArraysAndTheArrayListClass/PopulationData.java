import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PopulationData
{
	public static void main(String[] args)
	{
		ArrayList<Integer> population = new ArrayList<Integer>();
	}
	
	public static String getFileName()
	{
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
				
		// Get the filename.
		System.out.print("Enter the filename: ");
		String filename = keyboard.nextLine();
		
		//Close the keyboard Scanner
		keyboard.close();
		
		return filename;
	}
	
	public static void openFileReader(ArrayList<Integer> population) throws IOException
	{
		// Open the file.
		File file = new File(getFileName());
		Scanner inputFile = new Scanner(file);
				
				
		// Read lines from the file until no more are left.
		while (inputFile.hasNext())
		{
			// Read the next population integer.
			population.add(inputFile.nextInt()); 
		}
			
		// Close the file.
		inputFile.close();			
	}
	
	public static double getAverageAnnualChange(ArrayList<Integer> population)
	{
		int totalChange = 0;
		for(int i = 0; i < population.size() - 1; i++)
		{
			int change = population.get(i + 1) - population.get(i);
			
			totalChange += change;
		}
		return totalChange / population.size();
	}
	
	public static double getGreatestIncrease(ArrayList<Integer> population)
	{
		int greatestIncrease = population.getFirst();
		
		for(int i = 0; i < population.size() - 1; i++)
		{
			if(greatestIncrease < population.get(i))
				greatestIncrease = population.get(i);
		}
		
		return greatestIncrease;
	}
	
	public static double getSmallestIncrease(ArrayList<Integer> population)
	{
		int smallestIncrease = population.getFirst();
		
		for(int i = 0; i < population.size() - 1; i++)
		{
			if(smallestIncrease > population.get(i))
				smallestIncrease = population.get(i);
		}
		
		return smallestIncrease;
	}
	
}
