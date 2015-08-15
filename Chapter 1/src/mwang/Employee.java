package mwang;

public class Employee 
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public Employee()
	{
		name="John Doe";
		salary=0;
	}
	public String getName()
	
	{
		return name;	
		
	}
	public double getSalary()
	{
		return salary;	
				
	}
	
}

