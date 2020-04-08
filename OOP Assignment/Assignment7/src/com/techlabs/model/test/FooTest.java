package com.techlabs.model.test;

import com.techlabs.model.*;
import java.lang.reflect.*;

public class FooTest {
	public static void main(String args[]) {

		doReflection(Foo.class);

	}

	public static void doReflection(Class reflection) {
		Method[] m = reflection.getDeclaredMethods();
		int count = 0;
		for (Method methods : m) {
			if (methods.isAnnotationPresent(UnitTestCase.class)) {
				count++;
			}

		}
		System.out.println("No. of test cases is " + count);

	}
}