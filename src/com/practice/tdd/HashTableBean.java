package com.practice.tdd;

public class HashTableBean {
	
	private Object key, value;
	
	public HashTableBean(Object key, Object value)
	{
		this.key = key;
		this.value = value;
			
	}
	public void setKey(Object key){
		this.key = key;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public Object getKey()
	{
		return key;
	}
}

