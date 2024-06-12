
public class binary_decimal {
	
	public static void main(String[] args) 
	{
		int a=1000001;
		int power=1;
		int sum=0;
		while(a>0)
		{
			int d=a%10;//1
			sum=sum+d*power;//0+1*1=1
			power=power*2;//1*2
			a=a/10;//100000
		}
		System.out.println(sum);
	}
}
