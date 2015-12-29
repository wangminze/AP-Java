package mwang;

public class RoachPopulation 
{
	private double roaches;
	private final int originalRoaches;
	
	public RoachPopulation(double roaches, int originalRoaches)
	{
		this.roaches = roaches;
		this.originalRoaches = 10;
	}
	public int getOriginalRoaches()
	{
		return originalRoaches;
	}
	public void waitForDoubling()
	{
		roaches = roaches*(2);
	}
	public void spray(double percent)
	{
		roaches = roaches*(percent/100);
	}
	public double getRoaches()
	{
		return roaches;
	}

}
