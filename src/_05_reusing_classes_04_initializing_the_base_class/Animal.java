package _05_reusing_classes_04_initializing_the_base_class;

public class Animal 
{
    protected String name;
    
    public Animal()
    {
        System.out.println("Animal");
    }
    
    public String toString()
    {
        return "Animal " + name;
    }
    
}
