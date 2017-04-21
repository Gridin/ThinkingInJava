package _05_reusing_classes_07_constructors_with_arguments;


public class Dog extends Animal
{
    private Worm worm;
    
    public Dog(String name)
    {
        super(name);
        System.out.print("-Dog");
        Worm worm = new Worm("");
    }
}
