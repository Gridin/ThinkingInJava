package _06_polymorphism_12_inheritance_and_cleanup;

public class Mouse extends Rodent
{
    private String str = toStr();

    public Mouse()
    {
        System.out.println("Concsructor Mouse");
    }

    @Override public String toString()
    {
        return "Mouse";
    }

    private String toStr()
    {
        System.out.println("Initialisation field Mouse");
        
        return "";
    }

    @Override public void dispose()
    {
        System.out.println("Dispose Mouse");
        System.out.println("Dispose field Mouse");
        
        super.dispose();
    }
}
