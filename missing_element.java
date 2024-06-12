package array;

// find missing element in an array ....
public class missing_element {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };
		int ex_ele = a.length + 1;
		int t_sum = (ex_ele * (ex_ele + 1)) / 2;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The missing element is: " + (t_sum - sum));
	}
}