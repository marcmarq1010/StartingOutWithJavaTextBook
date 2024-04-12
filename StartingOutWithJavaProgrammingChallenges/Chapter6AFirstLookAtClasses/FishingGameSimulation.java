import java.util.Scanner;

public class FishingGameSimulation
{

	public static void main(String[] args)
	{	
		displayMenu();

		playRounds();
		
		displayScore(playRounds());
		
	}
	
	public static void displayMenu()
	{
		System.out.printf("This program simulates a fishing game.\n");
		
		System.out.printf("Each item the user catches is worth a different amount of points.\n");
		
		System.out.printf("You need to get 25 points to win.\nGood Luck!\n");
	}
	
	public static int playRounds()
	{
		Scanner keyboard = new Scanner(System.in);
		
		Die fishing = new Die(6);
		
		String continueToPlay = "",
			   item;
		
		int points = 0;
		
		do{
			fishing.roll();
			
			item = itemCaught(fishing.getValue());
			
			points += itemPoints(fishing.getValue());
			
			System.out.printf("You caught %s\n", item);
			
			System.out.printf("Do you want to continue fishing? (type \"yes\" or \"no\")\n");
			continueToPlay = keyboard.next();
			
		}while(continueToPlay.equalsIgnoreCase("yes"));
		
		keyboard.close();
		
		return points;
	}
	
	public static String itemCaught(int num)
	{
		switch(num)
		{
			case 1:
				return "a huge fish";
			case 2:
				return "an old shoe";
			case 3:
				return "a little fish";
			case 4:
				return "nothing";
			case 5:
				return"treasure";
			case 6:
				return "a shark";
		}
		return "Out of Bounds";				
	}
	
	public static int itemPoints(int num)
	{
		switch(num)
		{
			case 1:
				return 5;
			case 2:
				return 0;
			case 3:
				return 2;
			case 4:
				return 0;
			case 5:
				return 8;
			case 6:
				return 10;
		}
		return 0;				
	}
	
	public static void displayScore(int points)
	{
		System.out.printf("You earned a total of %d points!\n", points);
		
		if(points >= 25)
			System.out.printf("You earned 25 or more points and won!\nCONGRATULATIONS!!!\n");
		
		else
			System.out.printf("You did not win. Try again next time!!\n");
	}

}

/*
Here are some suggestions for the game’s design:
• Each item the user catches is worth a different amount of points.
• The loop keeps a running total of the user’s fishing points.
• After the loop has finished, the total number of fishing points is displayed, along with
	a message that varies depending on the number of points earned.
*/