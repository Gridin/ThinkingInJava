package _06_polymorphism_04_producing_the_right_behavior;

public class Ellipse extends Shape
{
    @Override public void draw()
    {
        System.out.println("Ellipse.draw");
    }

    @Override public void erase()
    {
        System.out.println("Ellipse.erase");
    }

}
