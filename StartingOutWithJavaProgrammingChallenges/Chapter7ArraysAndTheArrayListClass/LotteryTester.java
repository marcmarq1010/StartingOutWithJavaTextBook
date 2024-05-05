import java.util.Scanner;

public class LotteryTester
{

	public static void main(String[] args)
	{
		Lottery lottery = new Lottery();
		
		int[] userNums = new int[5];
		
		int picksCorrect = 0;
		
		System.out.printf("Enter five numbers:\n");
		
		enterNumbers(userNums);
		
		picksCorrect = lottery.acceptArray(userNums);
		
		System.out.printf("The number of digits that match the lottery numbers: %d\n", picksCorrect);
		
		System.out.println();
		
		System.out.printf("The lottery numbers:\n");
		
		displayArray(lottery.getLotteryNumbers());
		
		System.out.printf("The player's numbers:\n");
		
		displayArray(userNums);
		
		displayWinner(picksCorrect);
		
	}
	
	public static void enterNumbers(int[] userNums)
	{
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter number %d:", i + 1);
			userNums[i] = keyboard.nextInt();
		}
		
		keyboard.close();
	}
	
	public static void displayArray(int[] array)
	{
		for(int num : array)
		{
			System.out.printf("%d - ", num);
		}
		
		System.out.println();
	}
	
	public static void displayWinner(int player)
	{
		if(player == 5)
			System.out.printf("You are the grand prize winner!!!\n");
	}

}
