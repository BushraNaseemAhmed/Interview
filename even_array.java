package array;
//wajp to print even number in an array
public class even_array
{
	public static void main(String[]args)
	{
	int a[]=new int[5];
	a[0]=15;
	a[1]=25;
	a[2]=12;
	a[3]=14;
	a[4]=16;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	}
}
