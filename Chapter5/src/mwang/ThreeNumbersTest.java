package mwang;
public class ThreeNumbersTest 
{

	public static void main(String[] args)
	{
		EasyReader file = new EasyReader("Numbers.dat");
		double number1 = file.readDouble();
		double number2 = file.readDouble();
		double number3 = file.readDouble();
		ThreeNumbers set1 = new ThreeNumbers(number1, number2, number3);
		System.out.println("First set of inputs: " + number1 + "  " + number2 + "  " + number3);
		System.out.println("Sorted inputs: " + set1.getSmallest() + "  " + set1.getMiddle() + "  " + set1.getLargest() + '\n');
		
		double number4 = file.readDouble();
		double number5 = file.readDouble();
		double number6 = file.readDouble();
		ThreeNumbers set2 = new ThreeNumbers(number4, number5, number6);
		System.out.println("First set of inputs: " + number4 + "  " + number5 + "  " + number6);
		System.out.println("Sorted inputs: " + set2.getSmallest() + "  " + set2.getMiddle() + "  " + set2.getLargest() + '\n');
		
		double number7 = file.readDouble();
		double number8 = file.readDouble();
		double number9 = file.readDouble();
		ThreeNumbers set3 = new ThreeNumbers(number7, number8, number9);
		System.out.println("First set of inputs: " + number7 + "  " + number8 + "  " + number9);
		System.out.println("Sorted inputs: " + set3.getSmallest() + "  " + set3.getMiddle() + "  " + set3.getLargest());
	}

}
