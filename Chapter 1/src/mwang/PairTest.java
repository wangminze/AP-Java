package mwang;

import javax.swing.JOptionPane;
public class PairTest 

{
	public static void main(String[] args) 
	
	{
		String input1 = JOptionPane.showInputDialog("Input a first numbers");
		double value1 = Double.parseDouble(input1);
		String input2 = JOptionPane.showInputDialog("Input a second numbers");
		double value2 = Double.parseDouble(input2);
		
		Pair pair1 = new Pair(value1, value2);
		String str = "";
		str = str + "Here are some characteristcs of the two numbers...";
		JOptionPane.showMessageDialog(null, str);
		
		String ans = "";
		ans = ans + "The sum is:  " + pair1.getSum() + '\n'; 
		ans = ans + "The difference is:  " + pair1.getDifference() + '\n';
		ans = ans + "The product is:  " + pair1.getProduct() + '\n';
		ans = ans + "The average is:  " + pair1.getAverage() + '\n';
		ans = ans + "The distance is:  " + pair1.getDistance() + '\n';
		ans = ans + "The maximum is:  " + pair1.getMax() + '\n';
		ans = ans + "The minumim is:  " + pair1.getMin() + '\n';
		
		JOptionPane.showMessageDialog(null,ans);
	}

}
