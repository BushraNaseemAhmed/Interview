package array;

public class multilpication_2D {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{1,1,1},{1,0,1}};
		int b[][]= {{1,2,1},{2,1,2},{1,0,1}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int sum=0;
				for(int k=0;k<c.length;k++)
				{
					sum=sum+a[i][k]*b[k][j];
					c[i][j]=sum;
				}
				
			}
		}
		for(int l=0;l<c.length;l++)
		{
			for(int m=0;m<c.length;m++)
			{
				System.out.print(c[l][m]+" ");
			}
			System.out.println(" ");
		}
	
	}

}
