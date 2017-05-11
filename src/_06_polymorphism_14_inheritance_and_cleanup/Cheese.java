package _06_polymorphism_14_inheritance_and_cleanup;

import com.sun.org.apache.xml.internal.serializer.ToStream;

public class Cheese
{
	private static long counter = 0;
	private long id = 0;
	private int refCount = 0;
	
	public Cheese()
	{
		id = ++counter;
		System.out.println("Create " + this);
	}
	
	public void addRef()
	{
		++refCount;
	}
	
	@Override public String toString()
	{
		return "Cheese " + id;
	}
	
	public void dispose()
	{
		if (--refCount == 0)
			System.out.println("Dispose " + this);
	}
}
