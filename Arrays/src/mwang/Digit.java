package mwang;

public class Digit 
{
	private char num;
	private String code;
	
	public Digit(char num)
	{
		this.num = num;
	}
	
	public String getCode()
	{
		if(num == '0')
		{
			code = "||:::";
		}
		
		else if(num == '1')
		{
			code = ":::||";
		}
		
		else if(num == '2')
		{
			code = "::|:|";
		}
		
		else if(num == '3')
		{
			code = "::||:";
		}
		
		else if(num == '4')
		{
			code = ":|::|";
		}
		
		else if(num == '5')
		{
			code = ":|:|:";
		}
		
		else if(num == '6')
		{
			code = ":||::";
		}
		
		else if(num == '7')
		{
			code = "|:::|";
		}
		
		else if(num == '8')
		{
			code = "|::|:";
		}
		
		else if(num == '9')
		{
			code= "|:|::";
		}
		
		return code;
				
	}
	
	
}
