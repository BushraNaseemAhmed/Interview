//wajp to display perfect square of range 1-100
public class square_root_range {

	public static void main(String[] args) 
	{
		int temp=0;
		for(int no=1;no<=100;no++)
		{
			for(int i=1;i<no;i++)
			{
				if(no%i==0 && i*i==no)
				{
					temp=i*i;
				}
			}
			if(temp==no)
			{
				System.out.println(no +" "+ "Perfect Number");
			}
		}
	}

}
