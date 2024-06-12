
public class prime_factor {
	public static void prime(int a) //1
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if (a%i==0)// 1%1==0 , 1%2==0, 1%3==0
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Factor are : "+a);
		}
	}
	
	public static void main(String[] args)
	{
		int a=12;
		for(int i=1;i<=a;i++)//1
		{
			if(a%i==0)//12%1==0
				
			{
				prime(i);// 1 will be passed to the method
			}
		}
	}

}
