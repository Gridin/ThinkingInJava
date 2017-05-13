package _06_polymorphism_15_behavior_of_polymorphic_methods_inside_constructors;

public class Cheese
{
	private static long counter = 0;
	private long id = 0;
	
	public Cheese()
	{
		id = ++counter;
		System.out.println("Create " + this);
	}
	
	@Override public String toString()
	{
		return "Cheese " + id;
	}
	
}
