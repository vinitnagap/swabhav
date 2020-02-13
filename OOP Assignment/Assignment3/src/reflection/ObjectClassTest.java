package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ObjectClassTest {
	public static void main(String[] args) {
		Class<?> reflectionclass = Object.class;
		int methodcount = 0, gettercount = 0, settercount = 0, constructorcount = 0;
		String classname = reflectionclass.getName();
		System.out.println("Name of class is : " + classname);

		// System.out.println();
		// System.out.println("List of Methods are :");
		Method[] classmethods = reflectionclass.getMethods();
		for (Method a : classmethods) {
			// System.out.println(a);
			methodcount++;
			if (a.getName().startsWith("get")) {
				// System.out.println("Method is getter");
				gettercount++;
			} else if (a.getName().startsWith("set")) {
				// System.out.println("Method is setter");
				settercount++;
			}
		}

		// System.out.println();
		// System.out.println("List of Constructors are :");
		Constructor<?>[] constructor = reflectionclass.getConstructors();
		for (Constructor<?> a : constructor) {
			constructorcount++;
			// System.out.println(a);

		}
		System.out.println("Method Count = " + methodcount);
		System.out.println("Getter Method Count = " + gettercount);
		System.out.println("Setter Method Count = " + settercount);
		System.out.println("Constructor Count = " + constructorcount);
	}
}
