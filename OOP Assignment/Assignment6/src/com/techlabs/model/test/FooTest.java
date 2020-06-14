package com.techlabs.model.test;

import com.techlabs.model.*;
import java.lang.reflect.*;

public class FooTest {
	public static void main(String args[]) {

		doReflection(Foo.class);

	}

	public static void doReflection(Class reflection) {
		Method[] methods = reflection.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println(method.getName() + " "
						+ NeedToRefactor.value);

			}

		}

	}
}