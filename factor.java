
public class factor {
	public static void factor(int i)
	{
		for(int a=1;a<=i;a++)
		{
			if(i%a==0)
			{
				System.out.println("Factore of " +i+ "is........>" +a);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			factor(i);
		}
	}

}

