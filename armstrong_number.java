	//
public class armstrong_number {
	static int count=0;
	public static int raise(int d,int c)
	{ 
		int r=1;
		for(int i=1;i<=c;i++)
		{
			r=r*d;
		}
		return r;
	}
	public static int count(int a) {

		while(a>0)
		{
			count++;
			a=a/10;
		}
		return count;
	}
	public static void main(String[] args) {
		int a=153;
		int temp=a;//153
		int add=0;
		int count=count(a);
		while(temp!=0)
		{
			int d=temp%10;
			int s=raise(d,count);
			add=add+s;
			temp=temp/10;
		}
		if(add==a)
		{
			System.out.println(a+ " is a Armstrong Number");
		}
		else 
		{
			System.out.println(a +" is not a Armstrong Number");			
		}
	}
}