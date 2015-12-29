package mwang;

public class StatisticsTest {

	public static void main(String[] args)
	{

		
		
		
		Statistics list = new Statistics();
		EasyReader file = new EasyReader("Scores.dat");
		int loop = 1;
		int score = file.readInt();
		while(score != 0)
		{
			list.calculateScores(score);
			System.out.print(score + " ");
			score = file.readInt();
			if(loop % 20 == 0)
			{
				System.out.println();
			}
			loop++;
			
		}
		
		System.out.println();
		System.out.println("The number of scores: "+ list.getTotalScores());
		System.out.println("The average score: "+ list.getAverageScore());
		System.out.println("The maximum score: "+ list.getMaxScore());
		System.out.println("The minimum score: "+ list.getMinScore());
		System.out.println("The standard deviation: "+ list.getStandardDeviation());
		
		System.out.println("");

		System.out.println("Bar Chart");
		System.out.println(EasyFormat.format("            10         20         30         40", 42));
		System.out.println(EasyFormat.format("             |          |          |          |", 42));
		System.out.println("A: " + list.printBar1(list.getA()));
		System.out.println("B: " + list.printBar1(list.getB()));
		System.out.println("C: " + list.printBar1(list.getC()));
		System.out.println("D: " + list.printBar1(list.getD()));
		System.out.println("F: " + list.printBar1(list.getF()));
		System.out.println(EasyFormat.format("             |          |          |          |", 42));
		System.out.println(EasyFormat.format("            10         20         30         40", 42));


	}

}
