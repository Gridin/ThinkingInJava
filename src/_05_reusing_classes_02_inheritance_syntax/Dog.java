package _05_reusing_classes_02_inheritance_syntax;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    
    @Override public String toString()
    {
        return "Dog " + name;
    }
}
