package array;
// print element in 2D from ....
public class matrix {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3,4},{5,6,7,8},{0,1,2,3}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
