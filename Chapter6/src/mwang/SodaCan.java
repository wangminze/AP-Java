package mwang;

public class SodaCan 
{
	private String soda;
	private int ID;
	private int transaction;
	private int inventory;
	
	public SodaCan(String soda, int ID, int inventory)
	{
		this.soda = soda;
		this.ID = ID;
		this.inventory = inventory;
	}
	
	public String getName()
		{
			return soda;
		}
		
	public int getID()
	{
		return ID;
	}
	
	public int getInventory()
	{
		return inventory;
	}
	
	public int getTransaction()
	{
		return transaction;
	}
		
	public void adjustInventory(int value)
	{
		inventory = inventory + value;
		transaction++;
	}

	
	
}
