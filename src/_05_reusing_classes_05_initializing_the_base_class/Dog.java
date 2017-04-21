package _05_reusing_classes_05_initializing_the_base_class;


public class Dog extends Animal
{
    private Worm worm = new Worm();
    
    public Dog()
    {
        System.out.println("Dog");
    }
}
