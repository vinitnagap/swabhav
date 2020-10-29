package com.techlabs.model.test;

import java.lang.reflect.Modifier;

import java.lang.reflect.Method;

public class StringClassReflection {
	private static int gettercount = 0, settercount = 0;

	public static void main(String[] args) {
		Class reflectionclass = String.class;
		String classname = reflectionclass.getName();
		System.out.println("Name of class is : " + classname);
		Method[] methods = reflectionclass.getDeclaredMethods();
		for (Method method : methods) {

			if (isPublic(method)) {
				System.out.println("Public - " + method);
			} else if (isPrivate(method)) {
				System.out.println("Private - " + method);
			}
			if (isGetter(method)) {
				System.out.println("Getter - " + method);
				gettercount++;
			} else if (isSetter(method)) {
				System.out.println("Setter - " + method);
				settercount++;
			}
		}

		System.out.println("Getter Method Count = " + gettercount);
		System.out.println("Setter Method Count = " + settercount);
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get")) {
			return false;
		}
		return true;

	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set")) {
			return false;
		}
		return true;

	}

	public static boolean isPublic(Method method) {
		int modifier = method.getModifiers();
		if (Modifier.toString(modifier).equals("public")) {
			return true;
		}
		return false;

	}

	public static boolean isPrivate(Method method) {
		int modifier = method.getModifiers();
		if (Modifier.toString(modifier).equals("private")) {
			return true;
		}
		return false;

	}
}