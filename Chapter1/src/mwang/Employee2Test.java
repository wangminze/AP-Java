package mwang;

public class Employee2Test {

	public static void main(String[] args) 
	{
		Employee2 employee1=new Employee2("Bob", 80000, 80000);
		{
			System.out.println(employee1.getName());
			System.out.println("Original salary: "+ employee1.getOriginalSalary());
			employee1.raiseSalary(20);
			System.out.println("The new salary is: " + employee1.getSalary());
			
		}
		

	}

}
