package _05_reusing_classes_10_constructors_with_arguments;

public class Stem extends Root
{
    private Component1 cm1 = new Component1(1);
    private Component2 cm2 = new Component2(1);
    private Component3 cm3 = new Component3(1);

    public Stem(int i)
    {
        super(i);
        System.out.print("Stem ");
    }
    
}
