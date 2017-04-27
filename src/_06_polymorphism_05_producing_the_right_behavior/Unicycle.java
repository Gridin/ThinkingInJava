package _06_polymorphism_05_producing_the_right_behavior;

public class Unicycle extends Cycle
{
    @Override public void ride()
    {
        System.out.println("Unicycle");
        super.wheels(1);
    }
}
