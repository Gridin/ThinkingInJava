package _06_polymorphism_05_producing_the_right_behavior;

public class Bicycle  extends Cycle
{
    @Override public void ride()
    {
        System.out.println("Bicycle");
        super.wheels(2);
    }
}
