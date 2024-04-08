import java.util.Scanner;

public class MonthDaysTester
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter a month (1-12):\n");
		int month = keyboard.nextInt();
		
		System.out.printf("Enter a year: \n");
		int year = keyboard.nextInt();
		
		MonthDays md = new MonthDays(month, year);
		
		System.out.printf("%d days\n", md.getNumberOfDays());
		
		keyboard.close();
	}
		
}
