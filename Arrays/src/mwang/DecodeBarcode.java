package mwang;

public class DecodeBarcode 
{
	private String code;
	private String digit1;
	private String digit2;
	private String digit3;
	private String digit4;
	private String digit5;
	private String digit6;
	String sum = "";
	
	public DecodeBarcode(String code)
	{
		this.code = code;
	}
	
	public String decode()
	{
		
		for(int i=0; i<25; i=i+5)
		{
		String digit1= code.substring(i+1,i+6);
		DecodeDigit D1 = new DecodeDigit(digit1);
		sum=sum+D1.getDigit();
		
		/*DecodeDigit D2 = new DecodeDigit(digit2);
		DecodeDigit D3 = new DecodeDigit(digit3);
		DecodeDigit D4 = new DecodeDigit(digit4);
		DecodeDigit D5 = new DecodeDigit(digit5);
		DecodeDigit D6 = new DecodeDigit(digit6);*/
		}
		
		
		//sum = D1.getDigit() + D2.getDigit() + D3.getDigit() + D4.getDigit() + D5.getDigit();
		if(sum.length() == 5)
		{
			return sum;
		}
		
		else
		{
			return("Error in Barcode");
	
		}
	}
	
	
	
}
