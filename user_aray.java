package array;
import java.util.Scanner;
public class user_aray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Aray:");
		int b=sc.nextInt();
		int a[]=new int [b];
		System.out.println("Now Enter The Element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i:a)
		{
			System.out.println(i+" ");
		}
	}
	}

