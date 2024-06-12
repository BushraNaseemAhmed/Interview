
public class SpecialNumber {

	public static void tocheckSpecial(int n) {
		int t=n;
		int d;
		int sum=0;
		int mul=1;
		int add=0;
		while(t!=0)
		{
			d=t%10;
			sum=sum+d;
			mul=mul*d;
			add=sum+mul;
			t=t/10;
		}
		if(add==n)
		{
			System.out.println(n+" is Specials");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i <=1000; i++) {
			tocheckSpecial(i);
		}
	}

}
