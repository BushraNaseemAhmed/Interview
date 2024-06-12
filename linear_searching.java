package array;

public class linear_searching {

	public static void main(String[] args) 
	{
		int a[]= {5,2,4,3,1};
		int search=0;
		int count=0;
		int i=0;
//		boolean b=false;
		while(i<a.length)
		{
			if(search==a[i])
			{
				System.out.println(search+" Element Present" );
				break;
//				b=true;
			}
			i++;
		}
//		if(b==false)
//		{
//			System.out.println(search +" Element Not present");
//		}
			if(i==a.length) 
			{
				System.out.println(search+" Element Not Present");
			}
			
			}
}
