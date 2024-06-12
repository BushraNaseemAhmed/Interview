
public class binary_hexadecimal {

	public static void main(String[] args) {
		int a=1000001;
		int sum=0;
		int power=1;
		while(a>0)
		{
			int d=a%10;
			sum=sum+d*power;
			power=power*2;
			a=a/10;
		}
		int decimal=sum;
		String hexa=" ";
		while(decimal>0)
		{
			int d=decimal%16;
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
			decimal=decimal/16;
		}
		System.out.println(hexa);
	}
		

}
