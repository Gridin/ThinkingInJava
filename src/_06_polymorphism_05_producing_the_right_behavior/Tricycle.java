package _06_polymorphism_05_producing_the_right_behavior;

public class Tricycle extends Cycle
{
    @Override public void ride()
    {
        System.out.println("Tricycle");
        super.wheels(3);
    }
}
