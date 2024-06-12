//check whether 19 is special number or not.
public class special_no {
	
	public static void main(String[] args)
	{
		int no=19;
		int temp=no;
		int sum=0;
		int mul=1;
		int add=0;
		while(no>0)
		{
			int d=no%10;
			no=no/10;
			sum=sum+d;
			mul=mul*d;
			add=sum+mul;
		}
		if(add==temp)
		{
			System.out.println(temp+" Perfect Number");
		}
		else
		{
			System.out.println(temp +" Not Perfect Number");
		}
		
	}

}
