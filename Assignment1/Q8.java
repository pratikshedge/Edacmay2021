class Q8

{
	public static void main(String args[])
	{
		for(int i = 1; i<=4; i++)
		{
			for (int j = 1; j<=4; j++ )  // for J
			{
				if(i == 1 && j == 4 || i ==  2 && j ==  4 || i ==  3 && j ==  1 || i ==  3 && j ==  4||i ==  4 && j ==  2 || i ==  4 && j ==  3 )
				{
				System.out.print("J");
				}
				
				else{
				System.out.print(" ");
				}
				
				
			}
			System.out.println();
			
			
			

			for (int a = 1; a<=11; a++ ) //for A
			{
				if(i == 1 && a == 9 || i ==  2 && a ==  8 || i ==  2 && a ==  11 || i ==  3 && a ==  8 || i ==  3 && a ==  9||i ==  3 && a == 10  || i ==  3 && a ==  11 || i ==  4 && a ==  8 || i ==  4 && a == 11 )
				{
				System.out.print("A");
				}
				
				else{
				System.out.print(" ");
				}
				
				
			}System.out.println();



			for (int v = 1; v<=22; v++ ) //for A
			{
				if(i == 1 && v == 15 || i == 1 && v == 21 ||i ==  2 && v ==  16 || i ==  2 && v ==  20 || i ==  3 && v ==  17 || i ==  3 && v ==  19||i ==  4 && v == 18  )
				{
				System.out.print("V");
				}
				
				else{
				System.out.print(" ");
				}
				
				
			}System.out.println();

			
			
		


			for (int aa = 1; aa<=38; aa++ ) //for A
			{
				if(i == 1 && aa == 29 || i ==  2 && aa ==  28 || i ==  2 && aa ==  31 || i ==  3 && aa ==  28 || i ==  3 && aa ==  29||i ==  3 && aa == 30  || i ==  3 && aa ==  31 || i ==  4 && aa ==  28 || i ==  4 && aa == 31 )
				{
				System.out.print("A");
				}
				
				else{
				System.out.print(" ");
				}
				
				
			}System.out.println();

		}
			
			
	}

}