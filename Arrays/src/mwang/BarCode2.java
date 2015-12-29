package mwang;

public class BarCode2 
{
	private String zipCode;
	int sum = 0;
	
	public BarCode2(String zipCode)
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
		    sum += Character.getNumericValue(code);
		    
		}
	    int checkDigit = (20 - sum) + 48;
	    
		char checkDigit2 = (char) checkDigit;

		Digit num = new Digit(checkDigit2);
	    
		newZipCode += num.getCode();
		
		return newZipCode;
	}
	
	
	
	
	
}
