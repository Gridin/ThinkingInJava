package _05_reusing_classes_12_guaranteeing_proper_cleanup;

public class Component3 
{
    public Component3()
    {
        System.out.print("Component3 ");
    }
	
	public void dispose()
	{
		System.out.print("Component3-dispose ");
	}
}
