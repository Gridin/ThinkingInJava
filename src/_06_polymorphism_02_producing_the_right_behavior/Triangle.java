package _06_polymorphism_02_producing_the_right_behavior;

public class Triangle extends Shape
{
    @Override public void draw()
    {
        System.out.println("Triangle.draw");
    }

    @Override public void erase()
    {
        System.out.println("Triangle.erase");
    }
}
