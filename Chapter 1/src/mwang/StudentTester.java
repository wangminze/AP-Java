package mwang;

public class StudentTester {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Student student1 = new Student("Cracker, Carla");
		student1.addQuiz(91);
		student1.addQuiz(88);
		student1.addQuiz(98);
		
		System.out.println(student1.getName());
		System.out.println(student1.getTotalScore());
		System.out.println(student1.getAverageScore());
		

	}

}
