package com.techlabs.model.test;

import java.lang.reflect.Method;

import com.techlabs.model.Foo;
import com.techlabs.model.Testing;

public class FooTest {
	public static void main(String args[]) {

		doReflection(Foo.class);

	}

	public static void doReflection(Class reflection) {
		Method[] methods = reflection.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Testing.class)) {
				System.out.println(method.getName());

			}

		}

	}
}
