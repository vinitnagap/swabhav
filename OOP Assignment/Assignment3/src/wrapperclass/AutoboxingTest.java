package wrapperclass;

public class AutoboxingTest {

	public static void main(String args[]) {
		int i = 100;
		Integer iobj = Integer.valueOf(i);
		Integer iobj1 = i; // Autoboxing
		System.out.println(iobj);
		System.out.println("Object value = " + iobj1);
	}
}
