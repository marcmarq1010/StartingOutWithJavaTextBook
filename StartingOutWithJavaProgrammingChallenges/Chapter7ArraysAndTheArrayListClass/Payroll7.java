
public class Payroll7
{
	private int[] employeeId = { 5658845, 4520125 ,7895122, 8777541,
		    					 8451277, 1302850, 7580489};
	private double[] hours = new double[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	
	public Payroll7()
	{
		
	}
	
	public int getEmployeeId(int i)
	{
		return employeeId[i];
	}
	
	public void setEmployeeId(int employeeId, int i) 
	{
		this.employeeId[i] = employeeId;
	}

	public double getHours(int i)
	{
		return hours[i];
	}
	
	public void setHours(double hours, int i)
	{
		this.hours[i] = hours;
	}
	
	public double getPayRate(int i)
	{
		return payRate[i];
	}
	
	public void setPayRate(double payRate, int i)
	{
		this.payRate[i] = payRate;
	}
	
	public double getWages(int i)
	{
		return wages[i];
	}
	
	public void setWages(int i)
	{
		this.wages[i] = getPayRate(i) * getHours(i);
	}
	
}

