import java.util.Scanner; 

public class ChoHan619
{

	public static void main(String[] args)
	{
		final int MAX_ROUNDS = 5;	// Number of rounds
		String player1Name;			// First player's name 
		String player2Name;			// Second player's name
		
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Get the players' names.
		System.out.print("Enter the first player's name: ");
		player1Name = keyboard.nextLine();
		
		System.out.print("Enter the second player's name: ");
		player2Name = keyboard.nextLine();
		
		// Create the dealer.
		Dealer617 dealer = new Dealer617();
		
		// Create the two players.
		Player618 player1 = new Player618(player1Name);
		Player618 player2 = new Player618(player2Name);
		
		// Play the rounds.
		for (int round = 0; round < MAX_ROUNDS; round++)
		{
			System.out.println("----------------------------");
			System.out.printf("Now playing round %d.\n", round + 1);

			// Roll the dice.
			dealer.rollDice();
			
			// The players make their guesses.
			player1.makeGuess();
			player2.makeGuess();
			
			// Determine the winner of this round.
			roundResults(dealer, player1, player2);
		}
		
		// Display the grand winner.
		displayGrandWinner(player1, player2);
		
		keyboard.close();
		
	}
	
	/**
		The roundResults method determines the results of
		the current round.
		@param dealer The Dealer object
		@param player1 Player #1 object
		@param player2 Player #2 object
	*/
	
	public static void roundResults(Dealer617 dealer, Player618 player1,Player618 player2)
	{
		// Show the dice values.
		System.out.printf("The dealer rolled %d and %d.\n"
						 , dealer.getDie1Value(), dealer.getDie2Value());
		
		System.out.printf("Result: %s\n", dealer.getChoOrHan());
	
		// Check each player's guess and award points.
		checkGuess(player1, dealer);
		checkGuess(player2, dealer);
	}

	/**
		The checkGuess method checks a player's guess against
		the dealer's result.
		@param player The Player object to check.
		@param dealer The Dealer object.
	*/
	
	public static void checkGuess(Player618 player, Dealer617 dealer)
	{
		final int POINTS_TO_ADD = 1; // Points to award winner
		String guess = player.getGuess(); // Player's guess
		String choHanResult = dealer.getChoOrHan(); // Cho or Han
		
		// Display the player's guess.
		System.out.printf("The player %s guessed %s.\n"
						 , player.getName(), player.getGuess());

	
		// Award points if the player guessed correctly.
		if(guess.equalsIgnoreCase(choHanResult))
		{
			player.addPoints(POINTS_TO_ADD);
			
			System.out.printf("Awarding %d point(s) to %s.\n"
							 , POINTS_TO_ADD, player.getName());
		}
	}

	/**
		The displayGrandWinner method displays the game's grand winner. @param player1 Player #1
		@param player2 Player #2
	*/
	
	public static void displayGrandWinner(Player618 player1, Player618 player2)
	{
		System.out.println("----------------------------");
		
		System.out.println("Game over. Here are the results:");
		
		System.out.printf("%s: %d points.\n", player1.getName(), player1.getPoints());
		
		System.out.printf("%s: %d points.\n", player2.getName(), player2.getPoints());
		
		if (player1.getPoints() > player2.getPoints())
			System.out.println(player1.getName() + " is the grand winner!");
		else if (player2.getPoints() > player1.getPoints())
			System.out.println(player2.getName() + " is the grand winner!");
		else
			System.out.println("Both players are tied!");
	}
	
}