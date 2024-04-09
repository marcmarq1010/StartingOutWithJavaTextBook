
public class SavingsAccount
{
	private double annualInterestRate;
	private double balance;
	
	public SavingsAccount()
	{
		
	}
	
	public SavingsAccount(double startingBalance)
	{
		setBalance(startingBalance);
	}

	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate / 100;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void addInterestToBalance()
	{
		balance += balance * getMonthlyInterestRate();
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12.00;
	}
	
}
