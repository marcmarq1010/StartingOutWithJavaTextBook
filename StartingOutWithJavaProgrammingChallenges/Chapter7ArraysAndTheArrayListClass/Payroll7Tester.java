import java.util.Scanner;

public class Payroll7Tester 
{

	public static void main(String[] args)
	{
		Payroll7 payroll = new Payroll7();
		
		enterEmployeeInformation(payroll);
		displayEmployeesIdsAndWage(payroll);
	}
	
	public static void enterEmployeeInformation(Payroll7 payroll)
	{
		Scanner keyboard = new Scanner(System.in);
		double hours, payRate;
		
		for(int i = 0 ; i < 7; i++)
		{
			System.out.printf("Enter the information for employee number %d\n", i + 1);
			
			System.out.printf("Enter the employee’s hours worked:\n");
			hours = keyboard.nextDouble();
			
			while(hours < 0)
			{
				System.out.printf("Input Validation: Do not enter negative values for hours.\n");
				System.out.printf("Enter the employee’s hours worked:\n");
				hours = keyboard.nextDouble();
			}
			
			payroll.setHours(hours, i);
			
			System.out.printf("Enter the employee’s pay rate:\n");
			payRate = keyboard.nextDouble();
			
			while(payRate < 6.00)
			{
				System.out.printf("Input Validation: Do not enter values less than 6.00 for the pay rate.\n");
				System.out.printf("Enter the employee’s pay rate:\n");
				payRate = keyboard.nextDouble();
			}
			
			payroll.setPayRate(payRate, i);
			
			payroll.setWages(i);
			
			keyboard.close();
			
		}
	}

	public static void displayEmployeesIdsAndWage(Payroll7 payroll)
	{
		for(int i = 0; i < 7; i++)
		{
			System.out.printf("Employee ID: %d\n", payroll.getEmployeeId(i));
			System.out.printf("Employee Gross Wage: $%,.2f\n\n", payroll.getWages(i));

		}
	}

}
