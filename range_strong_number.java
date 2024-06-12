// wajp to check strong number in range of 1-10000
public class range_strong_number {
	public static int factorial(int d) 
	{
		int fact=1;
		for(int i=1;i<=d;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void strong(int i) 
	{
			int temp=i;
			int sum=0;
			while(i>0)
			{
				int d=i%10;
				int f=factorial(d);
				sum=sum+f;
				i=i/10;
				}
			if(sum==temp)
			{
				System.out.println(temp+" Strong Number");
			}
		
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=10000;i++)
		{
			strong(i);
		}
	}

}
