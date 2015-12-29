package mwang;

public class StringCompare 
{
	private String max;
	private String min;
	
	public StringCompare(String min, String max) 
	{
		this.max = null;
		this.min = null;
		
	}
			
	public void addString(String x)
	{
		if (max == null || max.compareTo(x) < 0 )
			max = x;
		if (min == null || min.compareTo(x) > 0)
			min = x;
		
	}
	
	public String getMaxString()
	{
		return max;
		
	}
	
	public String getMinString()
	{
		return min;
	}
	
}
