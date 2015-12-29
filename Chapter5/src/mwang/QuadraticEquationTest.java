package mwang;
import javax.swing.JOptionPane;
public class QuadraticEquationTest {

	public static void main(String[] args)
	{
		String input1 = JOptionPane.showInputDialog("Enter the first coefficients for a quadratic function");
		double a = Double.parseDouble(input1);
		String input2 = JOptionPane.showInputDialog("Enter the second coefficients for a quadratic function");
		double b = Double.parseDouble(input2);
		String input3 = JOptionPane.showInputDialog("Enter the third coefficients for a quadratic function");
		double c = Double.parseDouble(input3);
		
		String ans = "";
		ans = ans + "Coefficients entered: " + a + ", " + b + ", " + c + '\n';
		ans = ans + "The equation will be: " + a + "x^2 + " + b + "x " + c + "=0" + '\n';
		
		QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
		
		if (equation1.hasSolutinon())
			ans = ans + "No real roots";
			
		else ans = ans + "The roots are " + equation1.getSolution1() + " and " + equation1.getSolution2();
		
		JOptionPane.showMessageDialog(null, ans);
		
		
		
		
		
		
	}

}
