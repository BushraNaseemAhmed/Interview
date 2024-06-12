import java.util.Scanner;
public class neon_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		int no=sc.nextInt();
		int sq=no*no;
		int sum=0;
		while(sq!=0)
		{
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
		}
		if (sum==no)
		{
			System.out.println(" Neon Number");
		}
		else
		{
			System.out.println(" Not Neon Number");
		}
	}

}
