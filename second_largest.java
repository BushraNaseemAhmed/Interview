package array;

public class second_largest {

	public static void main(String[] args) 
	{
		int a[]= {3,4,7,5,6};
		int largest=0;
		int s_large=0;
		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i])
			{
				s_large=largest;
				largest=a[i];
			}
			else if(s_large<a[i] && a[i]!=largest)
				{
					s_large=a[i];
						
				}
		}
		System.out.println(largest);
		System.out.println(s_large);
	}
}
