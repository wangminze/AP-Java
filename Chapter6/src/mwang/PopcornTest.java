package mwang;

public class PopcornTest {

	public static void main(String[] args)
	{
		
		System.out.println(EasyFormat.format("", 25) + EasyFormat.format("Popcorn Co-Op", 25));
		System.out.println(EasyFormat.format("Farm Name", 9) + EasyFormat.format("", 16) + EasyFormat.format("Production in", 25));
		System.out.println(EasyFormat.format("", 30) + EasyFormat.format("Thousands of", 19));
		System.out.println(EasyFormat.format("", 30) + EasyFormat.format("Pint Jars per Acre", 25));
		System.out.println(EasyFormat.format("   1   2   3   4   5   6", 58));
		System.out.println(EasyFormat.format("   |   |   |   |   |   |", 58));
		System.out.println(EasyFormat.format("---|---|---|---|---|---|", 58));

				
		Popcorn list = new Popcorn();
		EasyReader file = new EasyReader("Popcorn.dat");
		
		
		int times = file.readInt();
	
		for(int loop = 1; loop <= times; loop++)
			{		
				String dummy=file.readLine();
				String name = "";

				char ch = file.readChar();
				while(ch != '*')
				{
					name = name + ch;
					ch = file.readChar();
				}
				System.out.print(EasyFormat.format(name, 33, 'l',0));

			
		
	//	for(int loop = 1; loop <=times; loop++)
			
				list.addFarm(name, file.readDouble(), file.readDouble());
				System.out.println(list.printBar());
				
			}
		
		
	}	
}
  