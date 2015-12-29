package mwang;

public class Employee2 
{
	private String name;
	private double salary;
	private final double originalSalary = 8000;
	
	public Employee2(String name, double salary, double originalSalary)
	{
		this.name=name;
		this.salary=salary;	
	}
	
	public String getName()
	
	{
		return name;	
	}
	public double getSalary()
	{
		return salary;	
	}
	public double getOriginalSalary()
	{
		return originalSalary;
	}			
	
	public void raiseSalary(double percent)
	{
		salary = ((percent / 100) + 1) * salary;
		
	}
}

