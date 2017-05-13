package _06_polymorphism_17_downcasting_and_runtime_type_information;

public class Green extends Color
{
    public void beep()
    {
        System.out.println("beep");
    }

    @Override public String toString()
    {
	return "Green";
    }
}
