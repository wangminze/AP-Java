package mwang;

public class RoachPopulationTest 
{
	public static void main(String[] args) 
	{ 
		RoachPopulation roachpopulation1 = new RoachPopulation(10, 10);
		
			System.out.println("Original Population: " + roachpopulation1.getOriginalRoaches() + " roaches");
			roachpopulation1.waitForDoubling();
			roachpopulation1.spray(90);
			System.out.println("After 1 wait period: " + roachpopulation1.getRoaches());
			roachpopulation1.waitForDoubling();
			roachpopulation1.spray(90);
			System.out.println("After 2 wait period: " + roachpopulation1.getRoaches());
			roachpopulation1.waitForDoubling();
			roachpopulation1.spray(90);
			System.out.println("After 3 wait period: " + roachpopulation1.getRoaches());
			
		
	

	}

}
