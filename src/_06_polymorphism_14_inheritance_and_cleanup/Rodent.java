package _06_polymorphism_14_inheritance_and_cleanup;

public class Rodent
{
	public Cheese cheese;

	public Rodent(Cheese cheese)
    {
		this.cheese = cheese;
		cheese.addRef();
        System.out.println("Create " + this);
    }

    public void dispose()
    {
        System.out.println("Dispose " + this);
		cheese.dispose();
    }
	
	@Override public String toString()
	{
		return "Rodent " + cheese;
	}
}
