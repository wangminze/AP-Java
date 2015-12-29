package mwang;

public class Card 
{
	private String number;
	private String letter;
	
	public Card(String number, String letter)
	{
		this.number = number;
		this.letter = letter;
		
		
	}
	
	public String getDescription()
	{
		if (number.equalsIgnoreCase("A"))
			number = "Ace";
		else if (number.equalsIgnoreCase("J"))
			number = "Jack";
		else if (number.equalsIgnoreCase("Q"))
			number = "Queen";
		else if (number.equalsIgnoreCase("K"))
			number = "King";
		else if (number.equals("2"))
			number = "2";
		else if (number.equals("3"))
			number = "3";
		else if (number.equals("4"))
			number = "4";
		else if (number.equals("5"))
			number = "5";
		else if (number.equals("6"))
			number = "6";
		else if (number.equals("7"))
			number = "7";
		else if (number.equals("8"))
			number = "8";
		else if (number.equals("9"))
			number = "9";
		else if (number.equals("10"))
			number = "10";
		else number =  "illegal suit";

					 if (letter.equalsIgnoreCase("D"))
			letter = "Diamonds";
		else if (letter.equalsIgnoreCase("H"))
			letter = "Hearts";
		else if (letter.equalsIgnoreCase("S"))
			letter = "Spades";
		else if (letter.equalsIgnoreCase("C"))
			letter = "Clubs";
		else letter = "illegal suit";
		
		if (number.equals("illegal suit"))
			return number;
		else if (letter.equals("illegal suit"))
			return letter;
		else return number + " of " + letter;
		
		
	}
	
	
	
	
	
}
