/**
	Dealer class for the game of Cho-Han
*/

public class Dealer617
{
	private int die1Value; // The value of die #1
	private int die2Value; // The value of die #2
	
	/**
		Constructor
	*/

	public Dealer617()
	{
	
		die1Value = 0;
		die2Value = 0;
		
	}

	/**
		The rollDice method rolls the dice and saves
		their values.
	*/

	public void rollDice()
	{
		
		final int SIDES = 6; // Number of sides for the dice
		// Create the two dice. (This also rolls them.)
		Die614 die1 = new Die614(SIDES);
		Die614 die2 = new Die614(SIDES);
		
		// Record their values.
		die1Value = die1.getValue();
		
		die2Value = die2.getValue();
		
	}
	
	/**
		The getChoOrHan method returns the result of the dice roll, Cho or Han.
		@return Either "Cho (even)" or "Han (odd)"
	*/
	
	public String getChoOrHan()
	{
		
		String result; // To hold the result
	
		// Get the sum of the dice.
		int sum = die1Value + die2Value;
	
		// Determine even or odd.
		if (sum % 2 == 0)
			result = "Cho (even)";
		else
			result = "Han (odd)";
	
		// Return the result.
		return result;
		
	}
	
	/**
		The getDie1Value method returns the value of die #1.
		@return The die1Value field
	*/
	
	public int getDie1Value()
	{
	
		return die1Value;
		
	}
	/**
		The getDie2Value method returns the value of die #2.
		@return The die2Value field
	*/
	
	public int getDie2Value()
	{
		
		return die2Value;
		
	}
	
}
	