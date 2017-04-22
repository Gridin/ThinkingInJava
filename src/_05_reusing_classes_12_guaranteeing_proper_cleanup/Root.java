package _05_reusing_classes_12_guaranteeing_proper_cleanup;

public class Root 
{
    private Component1 cm1 = new Component1();
    private Component2 cm2 = new Component2();
    private Component3 cm3 = new Component3();
    
    public Root()
    {
        System.out.print("Root ");
    }
	
	public void dispose()
	{
		System.out.print("Root-dispose ");
		cm3.dispose();
		cm2.dispose();
		cm1.dispose();
	}
}
