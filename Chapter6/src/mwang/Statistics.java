package mwang;

public class Statistics 
{
	private double SumOfScores;
	private int min;
	private int max;
	private int totalScores;
	private int a;
	private int b;
	private int c;
	private int d;
	private int f;
	private double squaresum;
	
	public Statistics()
	{
		this.min = 100;
		this.max = 0;
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.d = 0;
		this.f = 0;
		
	}
	
	public void calculateScores(int score)
	{
		totalScores++;
		SumOfScores = score + SumOfScores;
		max = Math.max(max, score);
		min = Math.min(min, score);
		squaresum = squaresum + score * score;

		
		if(score <= 100 && score >= 90)
		{
			a++;
		}
		
		else if(score <= 89 && score >= 80 )
		{
			b++;
		}
		
		else if(score <= 79 && score >= 70)
		{
			c++;
		}
		
		else if(score <= 69 && score >= 60)
		{
			d++;
		}
		
		else if(score <= 59 && score >= 0)
		{
			f++;
		}
	}
	
	public double getStandardDeviation()
	{
		double s;
		s = Math.sqrt((squaresum-(1.0/totalScores)*(SumOfScores*SumOfScores))/(totalScores-1));
		return s;
	}
	
	public double getTotalScores()
	{
		return totalScores;
	}
	
	public double getAverageScore()
	{
		return SumOfScores / totalScores;
	}
	
	public double getMaxScore()
	{
		return max;
	}
	
	public double getMinScore()
	{
		return min;
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public int getC()
	{
		return c;
	}
	
	public int getD()
	{
		return d;
	}
	
	public int getF()
	{
		return f;
	}
	
	public String getBar2()
	{
		int loop=0;
		String asteriksa="";
		while(loop<=a)
		{
			if(loop==10)
				asteriksa=asteriksa+"|";
			else
				asteriksa=asteriksa+"*";
			loop++;
		}
		return asteriksa;
	}
	
	public String printBar1(int last)
	{    
		String ans=" ";
		for(int amount = 1; amount <= last;amount++)
		{
			if(amount % 10 == 0 && amount != 0)
			{
				ans = ans + "|";
			}
			
			ans = ans + "*";
		}
		for(int amount = last+1; amount <= 40;amount++)
		{
			if(amount % 10 == 0 && amount != 0)
			{
				ans = ans + "|";
			}
			
			ans = ans + " ";
		}
		return ans;

	

	}

	
	
}
