package com.techlabs.model;

import java.util.Iterator;
import java.util.List;

public class CollectionClass implements ICrudable {

	@Override
	public void add(List list, Object obj) {
		list.add(obj);
	}

	@Override
	public void update(List list, int index, Object obj) {
		list.set(index, obj);
	}

	@Override
	public void read(List list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public void delete(List list, Object obj) {
		list.remove(obj);
	}

	@Override
	public boolean search(List list, Object obj) {
		return list.contains(obj);
	}
}
