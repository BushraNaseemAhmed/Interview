
public class range_perfect{
	
	public static void main(String[] args) 
	{
		for(int a=1;a<=1000;a++)
		{
			int sum=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==a)
			{
				System.out.println(a+"Perfect Number");
			}
		}
	}
	}