package _05_reusing_classes_08_constructors_with_arguments;

public class Animal 
{
    private String name;
    
    public Animal(String name)
    {
        this.name = name;
        System.out.print("Animal " + name);
    }
    
}
