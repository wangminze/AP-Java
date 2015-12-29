package mwang;

public class DecodeBarcodeTest {

	public static void main(String[] args) {

		EasyReader file1 = new EasyReader("Barcode.dat");
		
		for(int loop = 0; loop < 4; loop++)
		{
			String barcode = file1.readLine();
			System.out.println("Barcode:");
			System.out.println(barcode);
			DecodeBarcode code = new DecodeBarcode(barcode);
			System.out.println("ZIP: " + code.decode());
			System.out.println();

		}
	}

}
