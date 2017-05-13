package _06_polymorphism_15_behavior_of_polymorphic_methods_inside_constructors;

public class Rodent extends Mouse
{
	public Cheese cheese = new Cheese();

	public Rodent()
    {
        System.out.println("Create " + this);
    }

	@Override public String toString()
	{
		return "Rodent " + cheese;
	}
}
