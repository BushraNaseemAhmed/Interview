
public class decimal_octal {

	public static void main(String[] args)
	{
		int a=65;
		String octa=" ";
		while(a>0)
		{
			int d=a%4;
			octa=d+octa;
			a=a/4;
		}
		System.out.println(octa);
	}
}
