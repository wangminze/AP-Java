package mwang;

public class Apartment 
{
	private String address;
	private final int size = 30;
	private char[] features;
	
	public Apartment(char[] features, String address)
	{
		this.address = address;
		features = new char[size];
		
	}
	
	public char[] getFeatures()
	{
		return features;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	
	
	
}