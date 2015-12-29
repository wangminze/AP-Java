package mwang;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee employee1=new Employee("Bob", 80000);
		{
			System.out.println("Employee 1\n Name: "+employee1.getName());
			System.out.println(" Salary: "+employee1.getSalary());
			System.out.println();
		}
		Employee employee2=new Employee();
		{
			System.out.println("Employee 2\n Name: "+employee2.getName());
			System.out.println(" Salary: "+employee2.getSalary());
		
		}
		

	}

}
