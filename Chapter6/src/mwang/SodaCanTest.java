package mwang;

public class SodaCanTest {

	public static void main(String[] args) 
	{
		
		EasyReader file = new EasyReader("pop.dat");
		
		SodaCan soda1 = new SodaCan(file.readWord(), file.readInt(), file.readInt());
		SodaCan soda2 = new SodaCan(file.readWord(), file.readInt(), file.readInt());
		SodaCan soda3 = new SodaCan(file.readWord(), file.readInt(), file.readInt());
		SodaCan soda4 = new SodaCan(file.readWord(), file.readInt(), file.readInt());
				

		
		int ID = file.readInt();

		while(ID != 0)
		{
			if(ID == 1)
			{
				soda1.adjustInventory(file.readInt());
				
			}
			
			else if(ID == 2)
			{
				soda2.adjustInventory(file.readInt());
			}
			
			else if (ID == 3)
			{
				soda3.adjustInventory(file.readInt());
			}
			
			else if (ID == 4)
			{
				soda4.adjustInventory(file.readInt());
			}
			
			ID = file.readInt();
		}
		
		System.out.println(EasyFormat.format("Soft Drink", 12) + EasyFormat.format("ID", 4) 
			+ EasyFormat.format("Transactions", 15) + EasyFormat.format("Inventory", 11));
		System.out.println(EasyFormat.format(soda1.getName(), 12) + EasyFormat.format(soda1.getID(), 4) 
			+ EasyFormat.format(soda1.getTransaction(), 15) + EasyFormat.format(soda1.getInventory(), 11));
		System.out.println(EasyFormat.format(soda2.getName(), 12) + EasyFormat.format(soda2.getID(), 4) 
			+ EasyFormat.format(soda2.getTransaction(), 15) + EasyFormat.format(soda2.getInventory(), 11));
		System.out.println(EasyFormat.format(soda3.getName(), 12) + EasyFormat.format(soda3.getID(), 4) 
			+ EasyFormat.format(soda3.getTransaction(), 15) + EasyFormat.format(soda3.getInventory(), 11));
		System.out.println(EasyFormat.format(soda4.getName(), 12) + EasyFormat.format(soda4.getID(), 4) 
			+ EasyFormat.format(soda4.getTransaction(), 15) + EasyFormat.format(soda4.getInventory(), 11));
			
		
		
		
	
		
	}

}
