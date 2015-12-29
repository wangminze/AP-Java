package mwang;

public class QuadraticEquation 
{
	private double a;
	private double b;
	private double c;
	private double discriminant;
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		discriminant = (Math.pow(b, 2) - 4 * a * c);		
	}
		
	public double getSolution1()
	{
		double solution1 = ((-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
		return solution1;
	
			
	}
	
	public double getSolution2()
	{
		double solution2 = ((-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
		return solution2;
	}
	
	public boolean hasSolutinon()
	{
		if (discriminant >= 0){
			return false;
		}
		else return true;
	}
	
	
	
}
