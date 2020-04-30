package com.techlabs.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.techlabs.model.CollectionClass;

public class CollectionTest {

	public static void main(String[] args) {

		collectionOperation(new ArrayList());
		collectionOperation(new LinkedList());
		collectionOperation(new ArrayList(new HashSet()));
		collectionOperation(new ArrayList(new LinkedHashSet()));
		collectionOperation(new ArrayList(new TreeSet()));
	}

	public static void collectionOperation(Object obj) {
		List collection = (List) obj;

		CollectionClass object = new CollectionClass();
		object.add(collection, 1);
		object.add(collection, "xyz");
		object.delete(collection, 1);
		object.read(collection);
		System.out.println(object.search(collection, "xyz"));
	}
}
