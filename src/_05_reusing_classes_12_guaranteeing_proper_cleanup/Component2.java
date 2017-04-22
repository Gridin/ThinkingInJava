package _05_reusing_classes_12_guaranteeing_proper_cleanup;

public class Component2 
{
    public Component2()
    {
        System.out.print("Component2 ");
    }

	public void dispose()
	{
		System.out.print("Component2-dispose ");
	}
}
