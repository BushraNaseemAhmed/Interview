 ///wajp to reverse the number
public class reverse {
	public static void main(String[] args) 
	{
		int a=1223;
		int temp=a;
		int rev=0;
		while(a>0)
		{
			int d=a%10;
			a=a/10;
			rev=rev*10+d;
		}
		System.out.println("Reverse Order of the Number "+temp+ " "+rev);
	}

}