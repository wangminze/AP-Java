 package mwang;

public class Pair 
{
	private double aFirst;
	private double aSecond;
	
	public Pair (double aFirst, double aSecond)
	
	{
		this.aFirst = aFirst;
		this.aSecond = aSecond; 
	}
	
	public double getSum()
	{
		return aFirst + aSecond;
	}
	
	public double getDifference()
	{
		return aFirst - aSecond;
	}
	
	public double getProduct()
	{
		return aFirst * aSecond;
	}
	
	public double getAverage()
	{
		return ((aFirst + aSecond) / 2);
	}
	
	public double getDistance()
	{
		return Math.abs(aFirst - aSecond);
	}
	
	public double getMax()
	{
		return Math.max(aFirst, aSecond);
	}
	
	public double getMin()
	{
		return Math.min(aFirst,  aSecond);
	}
}

