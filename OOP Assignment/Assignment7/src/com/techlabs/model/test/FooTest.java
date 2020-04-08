package com.techlabs.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.*;

public class FooTest {
	public static void main(String args[]) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Foo obj = new Foo();

		getMethods(obj.getClass(), obj);
	}

	public static void getMethods(Class className, Object obj)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Method[] methods = className.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(UnitTestCase.class)) {
				if ((boolean) method.invoke(obj)) {
					System.out.println(method.getName() + " is passing case");
				} else
					System.out.println(method.getName() + " is failing case");
			} else {
				System.out.println(method.getName() + " is not a testcase");
			}
		}
	}

}