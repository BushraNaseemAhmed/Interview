//wajp to convert decimal to binary
public class convert_decimal_binary 
{
	public static void main(String[] args) 
	{
		int a=65; 
		String bin=" ";
		while(a>0)
		{
			int d=a%2;
			bin=d+bin;
			a=a/2;
		}
		System.out.println(bin);
		
	}

}
