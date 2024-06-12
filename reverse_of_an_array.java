package array;
// perform the reverse of an array
public class reverse_of_an_array {

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,6,7};
		int j=a.length-1;
		int i=0;
		int temp=0;
		System.out.println("Before Reverse");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("After Reverse");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
