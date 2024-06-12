//wajp to convert decimal to hexadecimal
public class decimal_hexadecimal {

	public static void main(String[] args) 
	{
		int a=6523;
		String hexa=" ";
		while(a>0)
		{
			int d=a%16;
			switch(d)
			{
			case 10:hexa=hexa+"A";
			break;
			case 11:hexa=hexa+"B";
			break;
			case 12:hexa=hexa+"C";
			break;
			case 13:hexa=hexa+"D";
			break;
			case 14:hexa=hexa+"E";
			break;
			case 15:hexa=hexa+"F";
			break;
			default:hexa=hexa+d;
			}
			a=a/16;
		}
		System.out.print(hexa);
	}

}
