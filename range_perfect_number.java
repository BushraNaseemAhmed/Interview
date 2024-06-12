//wajp to display Special number form range 1-1000
public class range_perfect_number {


	public static void specialNumber(int no) 
	{
		int temp=no;
		int add=0;
		int mul=1;
		int sum=0;
		while(no>0)
		{
			int d=no%10;
			add=add+d;
			mul=mul*d;
			sum=add+mul;
			no=no/10;
		}if(sum==temp)
		{
			System.out.println(temp+ "Special Number");
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			specialNumber(i);
		}
	}
}
