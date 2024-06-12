package array;

public class largest_array {

	public static void main(String[] args) 
	{
		int a[]= {6,4,7,3,1};
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}
}
