import java.util.Scanner;

public class SavingsAccountTester
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		SavingsAccount saver = new SavingsAccount();
		
		System.out.printf("You are creating a Savings Account.\n");
	
		System.out.printf("Enter the annual interest rate:\n");
		saver.setAnnualInterestRate(keyboard.nextDouble());
		
		System.out.printf("Enter the annual starting balance:\n");
		saver.setBalance(keyboard.nextDouble());
		
		System.out.printf("Enter the number of months that have passed since the account was established:\n");
		int numOfMonths = keyboard.nextInt();
		
		int numOfDeposits = 0,
			numOfWithdrawals = 0;
		
		double totalInterestEarned = 0;
		
		
		for(int i = 0; i < numOfMonths; i++)
		{
			System.out.printf("Enter the amount deposited into the account during the month:\n");
			double depositAmount = keyboard.nextDouble();
			
			if(depositAmount > 0)
			{
				saver.deposit(depositAmount);
				
				numOfDeposits++;
			}
				
			
			System.out.printf("Enter the amount withdrawn from the account balance:\n");
			double withdrawalAmount = keyboard.nextDouble();
			
			if(withdrawalAmount > 0)
			{
				saver.withdraw(withdrawalAmount);
				
				numOfWithdrawals++;
			}
			
			totalInterestEarned += saver.getBalance() * saver.getMonthlyInterestRate();
			
			saver.addInterestToBalance();
			
		}
		
		System.out.printf("The ending balance: $%,.2f\n", saver.getBalance());
		System.out.printf("The total amount of despoits: %d\n", numOfDeposits);
		System.out.printf("The total amount of withdrawals: %d\n", numOfWithdrawals);
		System.out.printf("The total interest earned: $%,.2f", totalInterestEarned);


		keyboard.close();
	}

}
