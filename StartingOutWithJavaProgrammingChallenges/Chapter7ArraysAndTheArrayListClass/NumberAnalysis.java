import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalysis
{
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public NumberAnalysis(File file) throws IOException
	{
		readFile(file);
	}

	public void readFile(File file) throws IOException
	{
		Scanner fileReader = new Scanner(file);
		
		while(fileReader.hasNext())
		{
			numbers.add(fileReader.nextInt());
		}
	}
	
	public int lowestNumber()
	{
		int lowest = numbers.getFirst();
				
		for(int number : numbers)
		{
			if(lowest > number)
				lowest = number;
		}
		
		return lowest;
	}
	
	public int highestNumber()
	{
		int highest = numbers.getFirst();
				
		for(int number : numbers)
		{
			if(highest < number)
				highest = number;
		}
		
		return highest;
	}
	
	public int getTotal()
	{
		int total = 0;
				
		for(int number : numbers)
		{
			total += number;
		}
		
		return total;
	}
	
	public int getAverage()
	{
		return getTotal() / numbers.size();
	}
}
