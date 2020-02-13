package wrapperclass;

public class UnboxingTest {

	public static void main(String args[]) {
		Integer iobj = new Integer(100);
		int i = iobj.intValue();
		int j = iobj; // Unboxing
		System.out.println(i);
		System.out.println("Primitive value = " + j);
	}
}
