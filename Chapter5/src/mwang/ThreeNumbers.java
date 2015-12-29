package mwang;

public class ThreeNumbers 
{
	private double largest;
	private double middle;
	private double smallest;
	
	public ThreeNumbers(double x, double y, double z)
	{
		if (x>y && x>z && y>z)
		{	
			largest = x;
			middle = y;
			smallest = z;
		}	
		
		else if (x>y && x<z)
		{
			middle = x;
			largest = z;
			smallest = y;
		}
		
		else if (x<y && x<z && y<z)
		{
			smallest = x;
			middle = y;
			largest = z;
		}
		
		else if (x<y && x>z)
		{
			middle = x;
			largest = y;
			smallest = z;
		}
		
		else if (x>y && x>z && z>y)
		{
			largest = x;
			middle = z;
			smallest = y;
		}
	}

	public double getLargest()
	{
		return largest;
	}
	
	public double getMiddle()
	{
		return middle;
	}
	
	public double getSmallest()
	{
		return smallest;
	}

}


	