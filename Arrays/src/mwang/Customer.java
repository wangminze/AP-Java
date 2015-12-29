package mwang;

public class Customer 
{
	private char[] response;
	private final int size = 30;

	public Customer(char[] preference, String name)
	{
		response = preference;
		name = "";
		
	}
	
	public int compare(char[] x)
	{
		int match = 0;
		
		for(int loop = 0; loop < size; loop++)
		{
			if(x[loop] == response[loop])
			{
				match++;
			}
		}
		
		return match;
	}
	
		
}
	
	

