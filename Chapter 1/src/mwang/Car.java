package mwang;

public class Car 
{
	private double miles;
	private double gas;
	private double fuelEfficiency;

	public Car(double fuelEfficiency)
			
	{
		this.fuelEfficiency=fuelEfficiency;
		
	}
	public void addGas(double gas)
	{
		this.gas = gas;
		
	}
	public void drive(double miles)
	{
		this.miles=miles;
	}
	public double getGas()
	{
		return gas-miles/fuelEfficiency;
	}
			
		

}
