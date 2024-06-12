import java.util.Scanner;
public class odd_even {
	public static void perfect(int no)
	{
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(no%1==0)
			{
				sum=sum+1;
			}
				
		}
		if(sum==no)
		{
			System.out.println("Perfect Number");
		}
	}
	public static void prime(int no) 
	{
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		
	}

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 int no=sc.nextInt();
		 if(no%2==0)
		 {
			 perfect(no);
		 }
		 else
		 {
			 prime(no);
		 }
		 
	}

}
