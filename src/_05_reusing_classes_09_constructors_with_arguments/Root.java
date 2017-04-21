package _05_reusing_classes_09_constructors_with_arguments;

public class Root 
{
    private Component1 cm1 = new Component1();
    private Component2 cm2 = new Component2();
    private Component3 cm3 = new Component3();
    
    public Root()
    {
        System.out.print("Root ");
    }
}
