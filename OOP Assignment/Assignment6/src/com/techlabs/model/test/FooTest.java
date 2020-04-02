package com.techlabs.model.test;

import com.techlabs.model.*;
import java.lang.reflect.*;

public class FooTest {
	public static void main(String args[]) {

		doReflection(Foo.class);

	}

	public static void doReflection(Class reflection) {
		Method[] m = reflection.getDeclaredMethods();
		for (Method methods : m) {
			if (methods.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println(methods.getName() + " "
						+ NeedToRefactor.value);

			}

		}

	}
}