import java.util.Scanner;

public class RoulettePocketTester
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		do{
			System.out.printf("Enter a number within the range of 0 through 36.\n");
			number = keyboard.nextInt();
		}while(number < 0 || number > 36);
		
		
		RoulettePocket pocket = new RoulettePocket(number);

		System.out.printf("The pocket is %s!\n", pocket.getPocketColor(number));
		
		keyboard.close();
	}

}
