
public class CoinTester
{

	public static void main(String[] args)
	{
		
		Coin coin = new Coin();
		
		System.out.printf("The side that is initially facing up is: %s\n", coin.getSideUp());
		
		int numTimesHeads = 0,
			numTimestails = 0;
		
		for(int i = 0; i < 20; i++)
		{
			coin.toss();
			
			System.out.printf("The side facing up is: %s\n", coin.getSideUp());
			
			if(coin.getSideUp().compareTo("heads") == 0)
				numTimesHeads++;
			
			if(coin.getSideUp().compareTo("tails") == 0)
				numTimestails++;
		}
		
		System.out.printf("The number of times head was side up: %d\n", numTimesHeads);
		
		System.out.printf("The number of times tails was side up: %d\n", numTimestails);

	}
	
}

/*
Write a program that demonstrates the Coin class.
The program should create an instance of the class and display the side that is initially facing up.
Then, use a loop to toss the coin 20 times.
Each time the coin is tossed, display the side that is facing up.
The program should keep count of the number of times heads is facing up and the number of times tails is facing up,
and display those values after the loop finishes.
*/