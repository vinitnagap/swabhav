package com.techlabs.model.test;

import java.util.Map;
import java.util.TreeMap;

import com.techlabs.model.Student;

public class Test {

	public static void main(String args[]) {

		Student s1 = new Student(1, 10, "abc", 8.0);
		Student s2 = new Student(1, 10, "xyz", 7.5);
		Student s3 = new Student(10, 1, "mno", 8.0);

		Map<Student, Student> map;
		map = new TreeMap<>();

		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);

		System.out.println(map.size());
	}
}
