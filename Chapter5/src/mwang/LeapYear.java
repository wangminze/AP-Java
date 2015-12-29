package mwang;

public class LeapYear 
{
	private int year;
	
	public LeapYear(int year)
	{
		this.year = year;
	}
	
	public boolean isLeapYear()
	{
		if (year % 4 == 0 && year < 1582)
			return true;
		
		else if (year > 1582)
		{	
			if (year % 400 == 0 )
				return true;
		
			else if (year % 100 == 0)
				return false;
			
			else if (year % 4 == 0)
				return true;
		}
		
	
		return false;
	}
	
	public String getResult()
	{
		if (isLeapYear() == true)
			return ("The year " + year + " is a leap year.");
		else
			return ("The year " + year + " is not a leap year.");
	}
	
	
	
	
	
	
	
}
