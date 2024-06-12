import java.util.Scanner;

//wajp to display the product of sum of all even and odd digit
public class product_digit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		int pro=1;
		while(a>0)
		{
			int d=a%10;
			if(d%2==0)
			{
				evensum=evensum+d;
			}
			else
			{
				oddsum=oddsum+d;
			}
			pro=evensum*oddsum;
			a=a/10;
		}
		System.out.println(pro);
	}

}
