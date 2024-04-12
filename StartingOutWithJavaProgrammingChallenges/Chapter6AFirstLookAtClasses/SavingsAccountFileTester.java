import java.io.*;
import java.util.Scanner;

public class SavingsAccountFileTester
{
	
	public static void main(String[] args) throws Exception
	{
		SavingsAccount saving = new SavingsAccount(500.00);
		
		saving.setAnnualInterestRate(6.99);
		
		Scanner depositFile = new Scanner(fileOpener());
		
		while(depositFile.hasNext())
		{
			saving.deposit(depositFile.nextDouble());
		}
		
		Scanner withdrawalFile = new Scanner(fileOpener());
		
		while(withdrawalFile.hasNext())
		{
			saving.withdraw(withdrawalFile.nextDouble());
		}
		
		System.out.printf("The monthly interest: %.2f%%\n", saving.getMonthlyInterestRate());
		
		System.out.printf("The total interest earned: $%,.2f\n", saving.getBalance() * saving.getAnnualInterestRate());
		
		System.out.printf("The ending balance: $%,.2f\n", saving.getBalance());
				
	}
	
	public static File fileOpener()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the name of the file to be read:\n");
		String fileName = keyboard.nextLine();
		
		File file = new File(fileName);
		
		keyboard.close();

		return file;
	}
	
}

/*
Use Notepad or another text editor to create a text file named Deposits.txt.
The file should contain the following numbers, one per line:

100.00
124.00
78.92
37.55

Next, create a text file named Withdrawals.txt.
The file should contain the following numbers, one per line:



The program should call the class method to calculate the monthly interest,
	and then display the ending balance and the total interest earn
*/
