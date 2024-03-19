/**
	This program rolls a 6-sided die and a 20-sided die.
*/

public class DieArgument616
{
	public static void main(String[] args)
	{
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		// Create a 6-sided die.
		Die614 sixDie = new Die614(SIX_SIDES);
		
		// Create a 20-sided die.
		Die614 twentyDie = new Die614(TWENTY_SIDES);
		
		// Roll the dice.
		rollDie(sixDie);
		rollDie(twentyDie);
		
	}
	
	/**
		This method simulates a die roll, displaying
		the die's number of sides and value.
		@param d The Die object to roll.
	*/
	
	public static void rollDie(Die614 d)
	{
		
		// Display the number of sides.
		System.out.println("Rolling a " + d.getSides() + " sided die.");
		
		// Roll the die.
		d.roll();
		
		// Display the die's value.
		System.out.println("The die's value: " + d.getValue());
		
	}
	
}
