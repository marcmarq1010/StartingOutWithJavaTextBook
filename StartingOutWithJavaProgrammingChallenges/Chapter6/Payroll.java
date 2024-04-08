
public class Payroll
{
	private String employeeName;
	private int idNumber;
	private double hourlyRate;
	private int numOfHoursWorked;
	
	public Payroll()
	{
		
	}
	
	public Payroll(String employeeName, int idNumber)
	{
		setEmployeeName(employeeName);
		setIdNumber(idNumber);
	}
	
	public double getGrossPay()
	{
		return getNumOfHoursWorked() * getHourlyRate();
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	public int getNumOfHoursWorked()
	{
		return numOfHoursWorked;
	}

	public void setNumOfHoursWorked(int numOfHoursWorked)
	{
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
}
