package _05_reusing_classes_12_guaranteeing_proper_cleanup;

public class Component1
{
    public Component1()
    {
        System.out.print("Component1 ");
    }
	
	public void dispose()
	{
		System.out.print("Component1-dispose ");
	}
}
