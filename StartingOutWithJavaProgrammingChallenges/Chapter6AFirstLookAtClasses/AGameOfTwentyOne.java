import java.util.Scanner;

public class AGameOfTwentyOne
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("This is  a variation of the popular blackjack card game.\n"
						 +"In this variation of the game, two six-sided dice are used instead of cards.\n"
						 +"The dice are rolled, and the player tries to beat the computer’s hidden total "
						 +"without going over 21\n");
		
		char playAgain;
		
		do{
			int playerTotal = 0, computerTotal = 0;
			
			Die computerDie = new Die(6);
			computerTotal += computerDie.getValue();
			
			Die playerDie = new Die(6);
			playerTotal += playerDie.getValue();
			
			char roll;
			
			do{
				
				computerDie.roll();
				computerTotal += computerDie.getValue();
				
				computerDie.roll();
				computerTotal += computerDie.getValue();
				
				
				System.out.printf("Do you want to roll the dice to accumulate points?\n"
							 	 +"(Y for yes or N for no)\n");
				roll = keyboard.next().toUpperCase().charAt(0);
								
				switch(roll)
				{
					case 'Y':
						playerDie.roll();
						playerTotal += playerDie.getValue();
						
						playerDie.roll();
						playerTotal += playerDie.getValue();
						break;
					case 'N':
						break;
				}
				
			}while(roll == 'Y' && playerTotal <= 21);
				
			determineWinner(computerTotal, playerTotal);
			
			System.out.printf("Would you like to play again?\n"
							 +"(Y for yes or N for no\n");
			playAgain = keyboard.next().toUpperCase().charAt(0);
			
		}while(playAgain == 'Y');
		
		keyboard.close();
		
	}
	
	public static void determineWinner(int computerTotal, int playerTotal)
	{
		if(computerTotal > 21 && playerTotal > 21)
		{
			System.out.printf("Both players went over 21.\nNo one wins.\n");
			System.out.printf("Player score: %d\n", playerTotal);
			System.out.printf("Computer score: %d\n", computerTotal);

		}
		else if(computerTotal > playerTotal)
		{
			System.out.printf("The computer wins.\n");
			System.out.printf("Player score: %d\n", playerTotal);
			System.out.printf("Computer score: %d\n", computerTotal);
		}
		else if(computerTotal < playerTotal)
		{
			System.out.printf("The player wins.\n");
			System.out.printf("Player score: %d\n", playerTotal);
			System.out.printf("Computer score: %d\n", computerTotal);
		}
		else
		{
			System.out.printf("Both players have the same score.\nNo one wins.\n");
			System.out.printf("Player score: %d\n", playerTotal);
			System.out.printf("Computer score: %d\n", computerTotal);
		}
	}

}
