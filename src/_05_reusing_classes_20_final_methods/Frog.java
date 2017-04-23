package _05_reusing_classes_20_final_methods;

public class Frog extends Amphibian
{
	public final void swim()
	{
		System.out.println("fSwim");
	}

	@Override public void walk()
	{
		System.out.println("fWalk");
	}
}
