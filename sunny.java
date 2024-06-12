// wajp to check whether number is sunny no or not 
public class sunny {

	public static void main(String[] args) {
		int no=24;
		int sq=0;
		int count=0;
		for(int i=1;i<=no;i++)
		{
			sq=i*i;
			if((sq-1)==no)
			{
				count++;// if we declare if else here so it will run in loop r
			}
		}
		if(count==1)
		{
			System.out.println("Sunny Number "+ no);
		}
		else
		{
			System.out.println("Not a Sunny Number "+ no);
		}
	}

}
