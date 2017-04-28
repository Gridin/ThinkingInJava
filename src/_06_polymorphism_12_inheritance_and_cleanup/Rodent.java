package _06_polymorphism_12_inheritance_and_cleanup;

public class Rodent 
{
    private String str = toStr();
    
    public Rodent()
    {
        System.out.println("Concsructor Rodent");
    }
    
    @Override public String toString()
    {
        return "Rodent";
    }
    
    private String toStr()
    {
        System.out.println("Initialisation field Rodent");
        
        return "";
    }
    
    public void dispose()
    {
        System.out.println("Dispose Rodent");
        System.out.println("Dispose field Rodent");
    }
}
