package array;

public class selection_array {

	public static void main(String[] args) 
	{
		int a[]= {5,2,4,3,1};
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for( int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
	}

}
