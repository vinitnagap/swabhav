package DifferenceOfForLoop;

public class difference {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		// for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		// foreach loop
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = (arr.length) - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		//We cannot print elements in reverse order in for each loop
		}
	}
}
