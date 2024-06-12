// check if 145 is strong number or not
public class strong_number {
	public static int factorial(int d) {
		int fact = 1;
		for (int i = 1; i <= d; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int a = 145;
		int temp = a;
		int sum = 0;
		while (a > 0) {
			int d = a % 10;
			int fact = factorial(d);
			sum = sum + fact;
			a = a / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " Strong Number");
		} else {
			System.out.println(temp + " Strong Number");
		}

	}

}
