package mwang;

public class CarTest {

	public static void main(String[] args) 
	
	{
		Car car=new Car(29);
		car.addGas(20);
		car.drive(100);
		System.out.print("Gas left in tank: ");
		System.out.println(car.getGas());

	}

}
