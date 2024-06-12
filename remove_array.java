package array;
// remove duplicate element from an array
public class remove_array {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,3,4,5};	
		int j=0;
		int []temp=new int[a.length];
		System.out.println("Before Removal");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println(" ");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
			temp[j]=a[a.length-1];
		}
		System.out.println("After Removal");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(temp[k]);
		}
	}

}
