	// wajp to display whether number is perfect number or not 

public class perfect_number {

	public static void main(String[] args) {
		int a = 6;
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
			if (i % a == 0) {
				sum = sum + i;
			}
		}
		if (sum == a) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfet Number");
		}
	}

}
