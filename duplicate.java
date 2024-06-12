package array;

//find the array has duplicate element or not.....
public class duplicate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 6 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)
				if (a[i] == a[j]) {
					System.out.println("Duplicate Element Exist " + j);
					count++;
				}
		}
		if (count == 0) {
			System.out.println("Duplicate Element not Exist");
		}
	}

}
