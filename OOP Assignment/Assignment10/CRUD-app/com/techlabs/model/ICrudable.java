package com.techlabs.model;

import java.util.List;

public interface ICrudable {

	void read(List list);

	void add(List list, Object obj);

	void update(List list, int index, Object obj);

	void delete(List list, Object obj);

	boolean search(List list, Object obj);
}
