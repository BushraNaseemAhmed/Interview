package array;

// binary search an element that is 6
public class binary_search {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int search = 7;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		for (int i = 0; i < a.length; i++) {
			if (search == a[mi]) {
				System.out.println("Element Present in Middle at index position :" + mi);
				break;
			} else if (search > a[mi]) {
				li = mi + 1;
			} else if (search < a[mi]) {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
			if (li > hi) {
				System.out.println("Elment Doesnot Exist");
				break;
			}
		}
	}

}
