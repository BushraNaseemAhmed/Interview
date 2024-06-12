//wajp to display number is Palindrome or not
public class palindrome {

	public static void main(String[] args) {

		int a = 121;
		int temp = a;
		int rev = 0;
		while (a > 0) {
			int d = a % 10;
			a = a / 10;
			rev = rev * 10 + d;
		}
		if (temp == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println(" Not Plaindrome Number");
		}
	}
}
