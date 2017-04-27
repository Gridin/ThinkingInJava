package _06_polymorphism_04_producing_the_right_behavior;

public class Circle extends Shape
{
    @Override public void draw()
    {
        System.out.println("Circle.draw");
    }

    @Override public void erase()
    {
        System.out.println("Circle.erase");
    }
}
