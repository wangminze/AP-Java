package mwang;

public class Popcorn 
{
	private String name;
	private double jars;
	private double acres;
	private int asterisks;
	
	public Popcorn()
	{
		
	}
	
	public void addFarm(String name, double acres, double jars)
	{
		this.name = name;
		this.jars = jars;
		this.acres = acres;
		this.asterisks = (int) ((jars / acres) / 250+.5);
	}
	
	public double getJars()
	{
		return jars;
	}
	
	public double getAcres()
	{
		return acres;
	}
	
	public int printAsterisks()
	{
		return asterisks;
	}
	
	public String printBar()
	{    
		String ans=" ";
		for(int amount = 1; amount <= asterisks;amount++)
		{
			if(amount == 20)
			{
				ans = ans + "#";
			}
			ans = ans + "*";

			
		}
		if(asterisks <= 20)
		{
			ans = ans + EasyFormat.format("|", (20 - asterisks), 'r',2);
		}
		return ans;
		
	}
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
