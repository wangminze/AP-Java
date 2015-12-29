package mwang;

public class LoopExercise {

	public static void main(String[] args) 
	
	{
		//method16();
		//method17();
		//method18();
		//method19();
		//method20();
		//method21();
		//method22();
		//method23();
		//method24();
		//method25();
		//method26();
		//method27();
		//method28();
		method29();
	}
			
		public static void method16()
		{
			System.out.println("Enter a positive number: ");
			EasyReader kboard = new EasyReader();
			int value = kboard.readInt();
			
			while (value < 0)
			{
				System.out.println("Sorry, number not positive.");
				value = kboard.readInt();
				
			}
			
			System.out.println("Number is positive.");
		}
	
		
		public static void method17()
		{
			System.out.println("Enter an even number.");
			EasyReader kboard = new EasyReader();
			int value;
			
			do
			{
				value = kboard.readInt();
			}
			
			while (value % 2 != 0);
			System.out.println("It's even.");
		}
		
		
		public static void method18()
		{
			final int sentinel = 10;
			
			EasyReader kboard1 = new EasyReader();
			System.out.println("Enter a value.");
			int value1 = kboard1.readInt();
			
			while(value1 != sentinel)
			{
				System.out.println("Enter a new value.");
				value1 = kboard1.readInt();

			}
		}
		
		
		public static void method19()
		{
			final int sentinel = 0;
			
			EasyReader kboard1 = new EasyReader();
			System.out.println("Enter a value.");
			int value1 = kboard1.readInt();
			int product = 1;
			
			while(value1 != sentinel)
			{
				System.out.println("Enter a new value.");
				product = value1 * product;
				value1 = kboard1.readInt();
			}
			
			System.out.println(product);
		}
		

		public static void method20()
		{
			for (int value = 1; value <= 100; value = value + 2)
			{
				System.out.println(value);
			}
		}
		
		
		public static void method21()
		{
			for (int value = 300; value >= 3; value = value - 3)
			{
				System.out.println(value);
			}
		}
		
		
		public static void method22()
		{
			int LOW = 0;
			int HIGH = 100;
			int value = 1;
			
			while (LOW < value && value < HIGH)
			{
				if(value % 5 != 0 && value % 4 == 0)
					System.out.println(value);
				 value++;
				
			}
		}
		
		
		public static void method23()
		{
			int number = 100;
			int factor = 1;
			
			while(factor < 100)
			{
				if(number % factor == 0)
					System.out.println(factor);
				//else factor++;
				
				factor++;	
			}
		}
		
		
		public static void method24()
		{
			EasyReader kboard = new EasyReader();
			int value = kboard.readInt();
			
			int number = 10;
			int MIN_VALUE = value;
			int MAX_VALUE = value;
			//MAX_VALUE = Integer.MIN_VALUE;
			//MIN_VALUE = Integer.MAX_VALUE;
			
			for(number = 1; number < 10; number++)
			{
				value = kboard.readInt();
				MAX_VALUE = Math.max(MAX_VALUE, value);
				MIN_VALUE = Math.min(MIN_VALUE, value);	
				
				
			}
			System.out.println(MAX_VALUE);
			System.out.println(MIN_VALUE);
		}
		
		
		public static void method25()
		{
			String str = "Michael";
			int count = 0;
			
			for(int letter = 0; letter < str.length(); letter++)
			{
				if(str.charAt(letter) == 'a')
					{
						count++;
					}
			}
			System.out.println("There are " + count + "'a' in the string.");
		}
		
		
		public static void method26()
		{
			String str = "Michael Wang";
			String str2;
			
			for(int value = str.length(); value >= 1; value = value - 1)
			{
				str2 = str.substring((value - 1), value);
				System.out.print(str2);
			}
			
		}
		
		
		public static void method27()
		{
			String str = "Michael Wang";
			String str2;
			
			for(int value = 0; value < str.length(); value = value + 2)
			{
				str2 = str.substring(value, (value + 1));
				System.out.print(str2);
			}
			
		}
		
		
		public static void method28()
		{
			EasyReader kboard = new EasyReader();
			System.out.println("Input number of lines");
			int line = kboard.readInt();
			int loop;
			
			for (loop = 1; loop <= line; loop++)
			{
				for(int sp =1; sp < loop; sp++)
					System.out.print(" ");
			System.out.println("*");
			}
		}
	
		
		public static void method29()
		{
			EasyReader kboard = new EasyReader();
			System.out.println("Input a word");
			String str = kboard.readWord();
			String str2;
			int letter;
			
			for (letter = 0; letter < str.length() ; letter++)
			{
				for(int sp =0; sp < letter; sp++)
				{
					System.out.print(" ");
				}
				str2 = str.substring(letter, (letter + 1));
				System.out.println(str2);
			}

		}



}
