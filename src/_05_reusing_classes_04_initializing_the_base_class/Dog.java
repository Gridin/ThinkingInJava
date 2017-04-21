package _05_reusing_classes_04_initializing_the_base_class;

public class Dog extends Animal
{
    public Dog()
    {
        System.out.println("Dog");
    }
    
    @Override public String toString()
    {
        return "Dog " + name;
    }
}
