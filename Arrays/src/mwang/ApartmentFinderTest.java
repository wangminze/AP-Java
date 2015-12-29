package mwang;

public class ApartmentFinderTest {

	 public static void main(String[] args) 
	{
		final int size = 30;
		EasyReader file1 = new EasyReader("Cust.dat");
		EasyReader file2 = new EasyReader("Apt.dat");
		final int x = file2.readInt();
		String dummy=file2.readLine();
		char[] preference = new char[size];
		for(int loop = 0; loop < size; loop++)
		{
			preference[loop] = file1.readChar();
		}
		String name = file1.readLine();
		
		Customer customer1 = new Customer(preference, name);


		System.out.println("For: M/M Omar Palace");
		System.out.println();
		System.out.println("Address             Number of Matches  % Response");
		System.out.println("-----------         -----------------  -----------");
		
		char[] features = new char[size];
		for(int loop = 1; loop <= x; loop++)
		{
			for(int loop2 = 0; loop2 < size; loop2++)
			{
				features[loop2] = file2.readChar();
			}
			String address = file2.readLine();
			Apartment apts = new Apartment(features, address);
			double match = (double) customer1.compare(features);
			if(match >= size * 0.8)
			{
				System.out.println(apts.getAddress() + "         " + EasyFormat.format((int) match, 2) + "          possible");
			}
			
		}

		
		
	}

}
