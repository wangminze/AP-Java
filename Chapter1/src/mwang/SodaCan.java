package mwang;

public class SodaCan 
{
	private double radius;
	private double height;
	private final double pi=3.14159;;
	
	public SodaCan()
	{
		this.radius = 2.0;
		this.height = 4.25;
	}
	
	public SodaCan(double radius, double height)
	{
		this.radius=radius;
		this.height=height;
		
	}
	public double getSurfaceArea()
	{
		return 2*pi*radius*radius+2*pi*radius*height;	
	}
	public double getVolume()
	{
		return pi*radius*radius*height;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
}
