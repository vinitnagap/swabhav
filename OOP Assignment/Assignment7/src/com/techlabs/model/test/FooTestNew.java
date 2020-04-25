package com.techlabs.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.BeforeEveryUnitTest;
import com.techlabs.model.Foo;
import com.techlabs.model.UnitTestCase;

public class FooTestNew {
	public static void main(String args[]) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Foo obj = new Foo();

		getMethods(obj.getClass(), obj);
	}

	public static void getMethods(Class className, Object obj)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Method beforeUnitTest = invokeBeforeEveryUnitTest(className);
		Method[] methods = className.getDeclaredMethods();
		int count = 0;
		for (Method method : methods) {
			beforeUnitTest.invoke(obj);
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				count++;
				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing case");
				} else
					System.out.println(method.getName() + " is failing case");
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
		System.out.println("No. of Test cases are " + count);
	}

	public static Method invokeBeforeEveryUnitTest(Class className) {
		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(BeforeEveryUnitTest.class)) {
				return method;
			}
		}
		return null;

	}

}
