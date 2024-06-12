
public class spy_number {

	public static void main(String[] args) 
	{
		int a=1124;
		int temp=a;
		int sum=0;
		int mul=1;
		
		while(a>0)
		{
			int d=a%10;
			sum=sum+d;
			mul=mul*d;
			a=a/10;
		}
		if(sum==mul)
		{
			System.out.println(temp+" Spy Number");
		}
	}

}
