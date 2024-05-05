import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ChargeAccountValidation
{
	public ArrayList<Integer> validNumbers = new ArrayList<>();
	String fileName;
	
	public ChargeAccountValidation() throws IOException
	{
		setFileName("validNumbers.txt");
		setValidNumbers();
	}

	public ArrayList<Integer> getValidNumbers()
	{
		return validNumbers;
	}

	public void setValidNumbers() throws IOException
	{
		File file = new File(getFileName());
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext())
		{
			validNumbers.add(inputFile.nextInt());
		}
		
		inputFile.close();
	}
	
	public boolean locateNumber(int value)
	{
		//Use a sequential search to locate the number passed as an argument.
		//If the number is in the array, the method should return true, indicating the number is valid.
		//If the number is not in the array, the method should return false, indicating the number is invalid.
		
		int index = 0;			// Loop control variable
		boolean found = false;		// Flag indicating search results
		
		// Search the array.
		while (!found && index < validNumbers.size())
		{
			if (validNumbers.get(index) == value)
			{
				found = true;
			}
			
			index++;
		}

		return found;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	
	
	
}
