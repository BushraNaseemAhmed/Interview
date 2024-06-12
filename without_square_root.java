
public class without_square_root {

	public static void main(String[] args) {
		int z = 25;
		int sr = z;// 25
		int temp;
		do {
			temp = sr;// 25
			sr = (temp + (z / temp)) / 2;// (9+(9/9))/2
		} while (sr - temp != 0);// 25-
		System.out.println(sr);
	}

}
