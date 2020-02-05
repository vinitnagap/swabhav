package ArrayModification;

public class withforeachloop {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		for (int s : arr) {
			s = 1 + s;
			System.out.println(s);
		}

	}
}