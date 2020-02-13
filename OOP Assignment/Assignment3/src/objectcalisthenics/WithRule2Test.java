package objectcalisthenics;

public class WithRule2Test {
	public static void main(String[] args) {
		int val = 3, x = 2;
		if (val == x) {
			x++;
			System.out.println("Incrementing x");
		}
		x--;
		System.out.println("Decrementing x");
	}
}
