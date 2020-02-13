package objectcalisthenics;

public class WithoutRule2Test {
	public static void main(String[] args) {
		int val = 3, x = 2;
		if (val == x) {
			x++;
			System.out.println("Incrementing x");
		} else {
			x--;
			System.out.println("Decrementing x");

		}
	}
}
