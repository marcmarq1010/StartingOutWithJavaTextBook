
public class MonthDays
{
	private int month;
	private int year;
	
	public MonthDays()
	{
		
	}
	
	public MonthDays(int month, int year)
	{
		setMonth(month);
		setYear(year);
	}
	
	public int getNumberOfDays()
	{
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return -1; // Invalid month
        }
    }
	
	private boolean isLeapYear()
	{
        if (year % 100 == 0)
        {
            return year % 400 == 0;
        }
        else
        {
            return year % 4 == 0;
        }
        
    }

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
	
	
	
}
