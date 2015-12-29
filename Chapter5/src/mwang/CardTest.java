package mwang;
import javax.swing.JOptionPane;
public class CardTest {

	public static void main(String[] args) 
	{
		String input1 = JOptionPane.showInputDialog("Input card notation");
		
		String number = "";
		String letter = "";
		
		String ans = "";
		
		if (input1.length() == 2)
		{
			number = input1.substring(0, 1);
			letter = input1.substring(1);
		}
		
		else if (input1.length() == 3)
		{
			number = input1.substring(0, 2);
			letter = input1.substring(2);
		}
		
		else if (input1.length() > 3)
		{
			ans = ans + "Too many characters" + '\n';
		}
			
		Card card1 = new Card(number, letter);
		
		
		ans = ans + "Notations entered: " + input1 + '\n';
		ans = ans  + card1.getDescription();
		JOptionPane.showMessageDialog(null, ans);
		
	}

}
