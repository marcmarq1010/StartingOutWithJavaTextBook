import java.util.Random;

public class Lottery
{
	private int[] lotteryNumbers = new int[5];
	private Random randy = new Random();
	
	public Lottery()
	{
		populateArray(5);
	}
	
	public int generateRandomNumber()
	{
		int randomNumber = randy.nextInt(0,10);
		
		return randomNumber;
	}
	
	public void populateArray(int size)
	{
		for(int i = 0; i < size; i++)
		{
			lotteryNumbers[i] = generateRandomNumber();
		}
	}
	
	public int acceptArray(int[] personsPicks)
	{
		int numDigitsMatch = 0;
		
		for(int i = 0; i < lotteryNumbers.length; i++)
		{
			if(personsPicks[i] == lotteryNumbers[i])
				numDigitsMatch++;
		}
		
		return numDigitsMatch;
	}
	
	public int[] getLotteryNumbers()
	{
		return lotteryNumbers;
	}
}
