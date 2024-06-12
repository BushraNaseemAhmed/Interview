
public class leap_year {

	public static void main(String[] args) 
	{
		int a=2000;
		if(a%4==0 && a%100!=0 ||a%400==0)
		{
			System.out.println(a+ " Leap Year");
		}
		else
		{
			System.out.println(a+ " Not a Leap Year");
		}
	}

}
