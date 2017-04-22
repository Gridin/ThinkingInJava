package _05_reusing_classes_12_guaranteeing_proper_cleanup;

public class Stem extends Root
{
    private Component1 cm1 = new Component1();
    private Component2 cm2 = new Component2();
    private Component3 cm3 = new Component3();

    public Stem()
    {
        System.out.print("Stem ");
		System.out.println();
    }
    
	@Override public void dispose()
	{
		System.out.print("Stem-dispose ");
		cm3.dispose();
		cm2.dispose();
		cm1.dispose();
		super.dispose();
	}
}
