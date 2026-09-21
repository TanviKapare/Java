package basicJavaPrograms;

public class PrintTheNumber {
	
	//Print 1 to 100 numbers
	
	public void print()
	{
		int i;
		for(i=1; i<=100; i++)
		{
			System.out.print(" "+i);
		}
			
	}

	public static void main(String[] args) {
		
		PrintTheNumber pn = new PrintTheNumber();
		pn.print();
		
	}

}
