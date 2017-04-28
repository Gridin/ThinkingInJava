package _06_polymorphism_10_extensibility;

public class Rodent 
{
    @Override public String toString()
    {
        return "Rodent";
    }
	
	public void print()
	{
		System.out.println(toString());
	}
}
