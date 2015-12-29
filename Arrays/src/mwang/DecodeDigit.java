package mwang;

public class DecodeDigit 
{
	private String code;
	private String digit="";
	
	public DecodeDigit(String code)
	{
		this.code = code;
	}
	
	public String getDigit()
	{
		if(code.equals("||:::"))
		{
			digit = "0";
		}
		
		if(code.equals(":::||"))
		{
			digit = "1";
		}
		
		if(code.equals("::|:|"))
		{
			digit = "2";
		}
		
		if(code.equals("::||:"))
		{
			digit = "3";
		}
		
		if(code.equals(":|::|"))
		{
			digit = "4";
		}
		
		if(code.equals(":|:|:"))
		{
			digit = "5";
		}
		if(code.equals(":||::"))
		{
			digit = "6";
		}
		
		if(code.equals("|:::|"))
		{
			digit = "7";
		}
		
		if(code.equals("|::|:"))
		{
			digit = "8";
		}
		
		if(code.equals("|:|::"))
		{
			digit = "9";
		}
		
		return digit;
	}
	
	
	
	
}
