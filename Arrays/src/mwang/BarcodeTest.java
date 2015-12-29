package mwang;


public class BarcodeTest {

	public static void main(String[] args) 
	{
		EasyReader kboard = new EasyReader();
		System.out.println("Enter a 5 digit zipcode:");

		String zipcode = kboard.readLine();
		BarCode2 newCode = new BarCode2(zipcode);
		
		
		System.out.println("|" + newCode.getCode() + "|");
	}

}
