package array;
// wajpt to display sum of odd number
public class sum_array {

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
