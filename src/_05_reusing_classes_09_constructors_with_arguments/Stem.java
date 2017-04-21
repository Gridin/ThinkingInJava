package _05_reusing_classes_09_constructors_with_arguments;

public class Stem extends Root
{
    private Component1 cm1 = new Component1();
    private Component2 cm2 = new Component2();
    private Component3 cm3 = new Component3();

    public Stem()
    {
        System.out.print("Stem ");
    }
    
}
