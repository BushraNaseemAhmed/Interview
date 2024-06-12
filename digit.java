import java.util.Scanner; 
//wajp to display number of digit and count of the number

public class digit {

	

	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter A Value");
		int no=a.nextInt();
		int count=0;
		while(no!=0)
		{
			int d=no%10;
			System.out.println(d);
			no=no/10;
			count++;
		}
		System.out.println("Count of Number is : "+count);
	}

}
