package mwang;

public class SodaCanTest 
{	
	public static void main(String[] args) 
	{
		SodaCan sodacan1=new SodaCan();
		{
			
			System.out.println("Dimensions of the can:");
			System.out.println("   Height = " + sodacan1.getRadius());
			System.out.println("   Radius = " + sodacan1.getHeight());
		}
		
		SodaCan sodacan2=new SodaCan(2.0, 4.25);
		{
			System.out.println();
			System.out.println("Calculated Values:");
			System.out.print("   Surface area = ");
			System.out.println(sodacan2.getSurfaceArea());
			System.out.print("   Volume = ");
			System.out.print(sodacan2.getVolume());
			
		}
		
	}
		

	

}
