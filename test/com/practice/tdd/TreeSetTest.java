package com.practice.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeSetTest {

	@Test
	public void testIsEmpty() {
	
		TreeSet emptySet = new TreeSet();
		assertTrue(emptySet.empty());
		
		TreeSet nonEmptySet = new TreeSet();
		nonEmptySet.add("1");
		assertFalse(nonEmptySet.empty());
		
	}
	
	@Test
	public void testSize()
	{
		TreeSet emptySet = new TreeSet();
		assertEquals(0,emptySet.size());
		
		TreeSet nonEmptySet = new TreeSet();
		nonEmptySet.add("1");
		assertEquals(1,nonEmptySet.size());
		
	}
	
	@Test
	public void testContains()
	{
		TreeSet nonEmptySet = new TreeSet();
		nonEmptySet.add("1");
		nonEmptySet.add("2");
		
		assertTrue(nonEmptySet.contains("1"));
		assertFalse(nonEmptySet.contains("3"));
			
	}
	@Test
	public void testGrow()
	{
		
	}
	@Test
	public void testDelete()
	{
		TreeSet nonEmptySet = new TreeSet();
		nonEmptySet.add("1");
		nonEmptySet.add("2");
		nonEmptySet.add("3");
		nonEmptySet.add("4");
		nonEmptySet.add("5");
		nonEmptySet.add("6");

		assertTrue(nonEmptySet.contains("1"));
		nonEmptySet.delete("1");
		//assertFalse(nonEmptySet.contains("1"));
		assertTrue(nonEmptySet.contains("6"));
		//assertEquals(5,nonEmptySet.size());		
		//assertEquals(1, nonEmptySet.indexOf("4"));
		assertEquals(4, nonEmptySet.indexOf("6"));
	}
}
