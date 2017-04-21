package _05_reusing_classes_02_inheritance_syntax;

public class Animal 
{
    protected String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return "Animal " + name;
    }
    
}
