package mwang;

public class Student 
{
	private String name;
	private int totalScore;
	private int numberOfTests;
	
	public Student(String name)
	{
		this.name=name;
		totalScore=0;
		numberOfTests=0;
		
	}
	public String getName()
	{
		return name;
		
	}
	
	public int getTotalScore()
	{
		return totalScore;
		
	}
	public int getNumberofTests()
	{
		return numberOfTests;
		
	}
	public void addQuiz(int score)
	{
		totalScore=totalScore+score;
		numberOfTests++;
		
	}
	
	public double getAverageScore()
	{
		double answer=0;
		answer=totalScore/(double) numberOfTests;
		return answer;
		
	}
}