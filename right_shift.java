package array;

//
public class right_shift {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int n = 1;
		System.out.println("Before");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			int temp = a[a.length - 1];
			int j;
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
		System.out.println("After");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
