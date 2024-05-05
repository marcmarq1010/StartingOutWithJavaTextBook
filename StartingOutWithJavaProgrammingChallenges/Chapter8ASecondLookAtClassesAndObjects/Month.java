
public class Month
{
	private int monthNumber;
	
	public Month()
	{
		setMonthNumber(1);
	}
	
	public Month(int monthNumber)
	{
		setMonthNumber(monthNumber);
	}
	
	public Month(String monthName)
	{
		//	• A constructor that accepts the name of the month, such as “January” or “February” as an argument.
		//		It should set the monthNumber field to the correct corresponding value.
	}
	
	public String getMonthName()
	{
		switch(monthNumber)
		{
			case 1:
				return "January";
			case 2:
				return "Ferbruary";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "Error: No month exists for that number";
		}
	}
	
	public boolean equals(Month month)
	{
		if(monthNumber == month.getMonthNumber())
			return true;
		else
			return false;
	}
	
	public boolean greaterThan(Month month)
	{
		if(monthNumber > month.getMonthNumber())
			return true;
		else
			return false;
	}
	
	public boolean lessThan(Month month)
	{
		if(monthNumber < month.getMonthNumber())
			return true;
		else
			return false;
	}

	@Override
	public String toString()
	{
		return getMonthName();
	}

	public int getMonthNumber()
	{
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber)
	{
		if(monthNumber > 12 || monthNumber < 1)
			this.monthNumber = 1;
		else
			this.monthNumber = monthNumber;
	}
	
}
