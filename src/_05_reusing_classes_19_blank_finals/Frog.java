package _05_reusing_classes_19_blank_finals;

public class Frog
{
	public final Amphibian inside;
	
	public Frog()
	{
		inside = new Amphibian();
	}
	
	public Frog(String name)
	{
		inside = new Amphibian();
	}
	
}
