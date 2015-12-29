package mwang;

public class practice {
	
	public int howManyLetters( String phrase){
		  
		  int letter = 0;
		  String str = " ";
		  int x=phrase.length();
		  while(x < str.length())
		  {
		     if(phrase.charAt(x) != ' ')
		     letter++;
		  }
		  
		  return letter;  
		}

}
