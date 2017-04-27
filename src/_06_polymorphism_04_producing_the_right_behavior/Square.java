package _06_polymorphism_04_producing_the_right_behavior;

public class Square extends Shape
{
    @Override public void draw()
    {
        System.out.println("Square.draw");
    }

    @Override public void erase()
    {
        System.out.println("Square.erase");
    }
}
