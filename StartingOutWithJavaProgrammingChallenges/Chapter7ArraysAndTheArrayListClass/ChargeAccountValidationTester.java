import java.io.IOException;
import java.util.Scanner;

public class ChargeAccountValidationTester 
{

	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		ChargeAccountValidation chargeAccount = new ChargeAccountValidation();
				
		System.out.printf("Enter a number charge account number:\n");
		int number = keyboard.nextInt();
		
		if(chargeAccount.locateNumber(number))
		{
			System.out.printf("The number is valid.\n");
		}
		else
		{
			System.out.printf("The number is invalid.\n");
		}
		
		keyboard.close();
		
	}

}
