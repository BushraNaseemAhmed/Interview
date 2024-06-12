
public class automorphic {
public static boolean auto(int no)
{
	int sq=no*no;
	while(no>0)
	{
		if(no%10!=sq%10)
		{
			return false;
		}
		no=no/10;
		sq=sq/10;
	}
	return true;
	
}

	public static void main(String[] args) 
	{
		int no=35;
		System.out.println(auto(no)?no+" Automorphic Number":no+" Not an Automorphic Number");
	}
}
