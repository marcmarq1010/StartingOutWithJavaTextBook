
public class TossingCoinsForADollar
{

	public static void main(String[] args)
	{
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
		
		double balance = 0;
		
		while(balance < 1.00)
		{
			quarter.toss();
			dime.toss();
			nickel.toss();
			
			if(quarter.getSideUp().compareTo("heads") == 0)
				balance += 0.25;
			
			if(dime.getSideUp().compareTo("heads") == 0)
				balance += 0.10;
			
			if(nickel.getSideUp().compareTo("heads") == 0)
				balance += 0.05;
			
		}

		System.out.printf("Your ending balance is %.2f\n", balance);
		
		if(balance == 1.00)
			System.out.printf("You win!\n");
		else
			System.out.printf("You lose.\n");
		
	}

}

/*
you will create a game program using the Coin class from Programming Challenge 16.

The program should have three instances of the Coin class: 
	one representing a quarter, one representing a dime, and one representing a nickel.
	
When the game begins, your starting balance is $0.
During each round of the game, the program will toss the simulated coins.
When a coin is tossed, the value of the coin is added to your balance if it lands heads-up.
For example, if the quarter lands heads-up, 25 cents is added to your balance.
Nothing is added to your balance for coins that land tails-up.
The game is over when your balance reaches one dollar or more.
If your balance is exactly one dollar, you win the game.
You lose if your balance exceeds one dollar
*/