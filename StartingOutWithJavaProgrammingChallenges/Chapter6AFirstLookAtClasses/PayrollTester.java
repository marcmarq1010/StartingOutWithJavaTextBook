import java.util.Scanner;

public class PayrollTester
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Payroll pr = new Payroll();
				
		System.out.printf("Enter the name of the employee:\n");
		pr.setEmployeeName(keyboard.nextLine());
		
		System.out.printf("Enter the id number of the employee:\n");
		pr.setIdNumber(keyboard.nextInt());
		
		System.out.printf("Enter the hourly rate of the employee:\n");
		pr.setHourlyRate(keyboard.nextDouble());
		
		System.out.printf("Enter the number of hours worked by the employee:\n");
		pr.setNumOfHoursWorked(keyboard.nextInt());
		
		System.out.printf("The amount of gross pay earned was: $%,.2f\n", pr.getGrossPay());
		
		keyboard.close();

	}
	
}
