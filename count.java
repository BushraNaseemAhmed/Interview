// wajp to display the even number in a number .......346
public class count {

	public static void main(String[] args) 
	{
		int a=346;
		int count=0;
		while(a>0)
		{
			int d=a%10;
			if(d%2==0)
			{
			count++;
			}
			a=a/10;
		}
		System.out.println(count);
	}

}
