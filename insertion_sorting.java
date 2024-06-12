package array;

// wajp to sort the array using Insertion Sorting


public class insertion_sorting {

	public static void main(String[] args) 
	{
		int a[]= {6,2,3,4,1};
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];//2
			int j=i;//2
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];//6
				j--;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
