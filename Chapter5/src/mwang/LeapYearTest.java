package mwang;

public class LeapYearTest {

	public static void main(String[] args) 
	{
		EasyReader file = new EasyReader("dates.dat");		
		int year1 = file.readInt();
		LeapYear leap1 = new LeapYear(year1);
		System.out.println(leap1.getResult());
		
		int year2 = file.readInt();
		LeapYear leap2 = new LeapYear(year2);
		System.out.println(leap2.getResult());
		
		int year3 = file.readInt();
		LeapYear leap3 = new LeapYear(year3);
		System.out.println(leap3.getResult());
		
		int year4 = file.readInt();
		LeapYear leap4 = new LeapYear(year4);
		System.out.println(leap4.getResult());
		
		int year5 = file.readInt();
		LeapYear leap5 = new LeapYear(year5);
		System.out.println(leap5.getResult());
		
		
	}

}
