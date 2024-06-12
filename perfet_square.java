//wajp to find if the number is perfect square or not 
public class perfet_square {

	public static void main(String[] args) 
	{
		int no=9;
		int temp=0;
		for(int i=1;i<=9;i++)
		{
			if(no%i==0 && i*i==no)
			{
				temp=i*i;
			}
			
		}
		if(temp==no)
		{
		System.out.println(no+ " Perfect Sqare ");
		}
		else
		{
			System.out.println(no+"Not a Perfect Sqare");
		}
		
				
	}

}
