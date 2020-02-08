package ArrayModification;

public class WithForLoop {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i == k) {
				arr[i] = 50;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
