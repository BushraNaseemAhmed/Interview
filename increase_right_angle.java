
public class increase_right_angle {

	public static void main(String[] args)
	{
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					count++;
					System.out.print(" "+count);
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		
	}

}
