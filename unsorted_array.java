package array;
// remove duplicate element from unsoretd array without using new array
public class unsorted_array {

	public static void main(String[] args) 
	{
			int a[]= {1,2,3,3,4,5};
			for(int l=0;l<a.length;l++)
			{
			int min=l;
			for(int b=l+1;b<a.length;b++)
			{
				if(a[b]<a[min])
				{
					min=b;
				}
				int temp=a[l];
				a[l]=a[min];
				a[min]=temp;
			}
			}
			int j=0; 
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]!=a[i+1])
				{
					a[j]=a[i];
					j++;
				}
			}
			a[j]=a[a.length-1];
			for(int k=0;k<a.length-1;k++)
			{
				System.out.println(a[k]);
			}
	}
	}
