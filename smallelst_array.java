package array;

public class smallelst_array {

	public static void main(String[] args) 
	{
		int a[]= {3,4,7,6,5};
		int smallest=a[0];
		int small=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				small=smallest;
				smallest=a[i];

			}
			else if(a[i]<small && a[i]!=smallest)
			{
				small=a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(small);
	}
	}
