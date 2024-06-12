package array;

public class left_shift {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int n = 1;
		for (int i = 1; i <= n; i++) {
			int temp = a[0];
			int j;
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
