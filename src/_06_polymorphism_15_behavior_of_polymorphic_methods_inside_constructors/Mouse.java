package _06_polymorphism_15_behavior_of_polymorphic_methods_inside_constructors;

public class Mouse
{
	public Cheese cheese = new Cheese();
	
    public Mouse()
    {
        System.out.println("Create " + this);
    }

	@Override public String toString()
	{
		return "Mouse " + cheese;
	}
	
}
