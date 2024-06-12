// wajp to display the prime number range between 1-100
public class range_prime {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int a=1;a<=i;a++)
			{
				if(i%a==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime Number"+i);
			}
		}
	}

}
