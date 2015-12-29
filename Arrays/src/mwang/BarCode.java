package mwang;

public class BarCode 
{
	private String zipCode;
	
	public BarCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public String getCode()
	{
		String newZipCode = "";
		for(int loop = 0; loop < 5; loop++)
		{
			char code = zipCode.charAt(loop); 
			Digit num = new Digit(code);
			newZipCode += num.getCode();
			
		}
		return newZipCode;
	}
	
	
	
	
	
}
