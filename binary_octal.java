
public class binary_octal {

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
		int decimal=sum;
		String octal=" ";
		while(sum>0)
		{
			int d=sum%8;
			octal=d+octal;
			sum=sum/8;
		}
		System.out.println(octal);
	}

}
