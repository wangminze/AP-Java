package mwang;

public class StringCompareTest {

	public static void main(String[] args) 
	{
		EasyReader kboard = new EasyReader();
		
		StringCompare set1 = new StringCompare(null, null);
		System.out.println("Enter 4 strings: ");
		
		String input1 = kboard.readLine();
		set1.addString(input1);
		
		String input2 = kboard.readLine();
		set1.addString(input2);
		
		String input3 = kboard.readLine();
		set1.addString(input3);
		
		String input4 = kboard.readLine();
		set1.addString(input4);
		
		System.out.println("The lexicographic minimum is " + set1.getMinString());
		System.out.println("The lexicographic minimum is " + set1.getMaxString());

	}

}
