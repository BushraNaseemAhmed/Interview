// factor in range of 1-8
public class range_factor {
	public static void factor(int i) {
		
		
	}

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=8;i++)
		{
			int fact=1;
			for(int a=1;a<=i;a++)
			{
				fact=fact*a;
			}
			System.out.println("Fcatorial of " +i+" "+"is : " +fact);
		}
		
		}

}
