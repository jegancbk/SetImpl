package com.practice.tdd;

import java.util.Arrays;

public class TreeSet {

	private int count = 0;
	private String objectPool[] = new String[5];
	
	public boolean empty() {
		if(count == 0)
			return true;
			else 
		    return false;
	}

	public void add(String string) {
		
		if(contains(string))
			return;
	
		if(count == objectPool.length)
		{
			grow();
		}
		objectPool[count] = string; //1
		count++;

		if(count > 1)
		{
			insertionSort();
		}
	}
	
	private void grow(){
		String tempArr[] = new String[objectPool.length*2];
		System.arraycopy(objectPool,0, tempArr, 0, count);
		objectPool = tempArr;
		
	}
	private void insertionSort()
	{	
			/*if(objectPool[count-1].compareTo(objectPool[count])<0)
			{
				String temp = objectPool[count-1];
				objectPool[count-1]= objectPool[count];//2
				objectPool[count] = temp;				
			}*/


		for (int i = 1; i < count; i++) {
			for (int j = i; j > 0; j--) {

				if (objectPool[j].compareTo(objectPool[i]) > 0) {
					String temp = objectPool[j];
					objectPool[j] = objectPool[i];
					objectPool[i] = temp;
				}

			}
		}
	}

	public int size() {
		return count;
	}

	public boolean contains(String string) {
	
		for(int i=0;i<count;i++)
		{
			if(objectPool[i].equals(string))
				return true;
		}
		return false;
	}

	public void delete(String string) {
		for(int i=0;i<count;i++)
		{
			if(objectPool[i].equals(string))
			{
				objectPool[i] = null;
				count --;
				//String tempArr[] = new String[count];
				System.arraycopy(objectPool, i+1, objectPool, i, objectPool.length-1-i);
				
			}
		}
	}

	public int indexOf(String string) {
		for(int i=0;i<count;i++)
		{
			//System.out.println(objectPool[i]);
			if(objectPool[i].equals(string))
			{			
				return i;
			}
		}
		return -1;
	}
}
