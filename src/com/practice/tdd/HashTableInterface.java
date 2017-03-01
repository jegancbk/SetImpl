package com.practice.tdd;

public interface HashTableInterface {

	void clear();

	HashTableBean[] clone();

	boolean containsKey(Object key);

	boolean containsValue(Object value);

	Object get(Object key);

	boolean isEmpty();

	void put(Object key, Object value);

	void remove(Object key);

	int size();
}
