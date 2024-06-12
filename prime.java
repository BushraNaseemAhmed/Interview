	// wajp to display if 7 is prime number or not 
public class prime {

	public static void main(String[] args) 
	{
		int a=6;
		int count=0;
		for(int i=1;i<=a;i++)
		{
		if(a%i==0)
		{
			count++;
		}
		
		}
		if(count==2) 
		{
			System.out.println("Number is Prime Number : "+a);
		}
		else
		{
			System.out.println("Number is Not a Prime Number : "+a);
		}
		
		
	}

}
