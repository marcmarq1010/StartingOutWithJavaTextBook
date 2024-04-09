
public class DiceGame
{

	public static void main(String[] args)
	{
		Die playerDice = new Die(6);
		
		Die computerDice = new Die(6);
		
		int numOfPlayerWins = 0,
			numOfComputerWins = 0;
		
		for(int i = 0; i < 10; i++)
		{
			playerDice.roll();
			
			computerDice.roll();
			
			if(playerDice.getValue() > computerDice.getValue())
				numOfPlayerWins++;
			
			if(playerDice.getValue() < computerDice.getValue())
				numOfComputerWins++;				
		}
		
		String winner = "";
		int numOfWins = 0;
		
		if(numOfPlayerWins > numOfComputerWins)
		{
			winner = "player";
			numOfWins = numOfPlayerWins;
		}
		
		if(numOfPlayerWins < numOfComputerWins)
		{
			winner = "computer";
			numOfWins = numOfPlayerWins;
		}
		
		System.out.printf("The grand winner is the %s with %d total wins!!!\n", winner, numOfWins);
	}

}

/*
Write a program that uses the Die class that was presented in this chapter to play a simple dice game
between the computer and the user.
The program should create two instances of the Die class (each a 6-sided die).
One Die object is the computer’s die, and the other Die object is the user’s die.
The program should have a loop that iterates 10 times.
Each time the loop iterates, it should roll both dice.
The die with the highest value wins. (In case of a tie,
there is no winner for that particular roll of the dice.)
As the loop iterates, the program should keep count of the number of times the computer wins,
and the number of times that the user wins.
After the loop performs all of its iterations, the program should display who was the grand winner,
the computer or the user.
*/