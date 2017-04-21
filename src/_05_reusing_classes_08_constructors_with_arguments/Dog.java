package _05_reusing_classes_08_constructors_with_arguments;

public class Dog extends Animal
{
    public Dog()
    {
        super("Default");
        System.out.print("-Dog");
    }

    public Dog(String name)
    {
        super(name);
        System.out.print("-Dog");
    }
}
