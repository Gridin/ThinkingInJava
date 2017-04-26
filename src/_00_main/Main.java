package _00_main;

import _06_polymorphism_02_producing_the_right_behavior.*;

public class Main
{
    public static void main(String[] args) 
    {
        Shape[] array = new Shape[10];
        for (int i = 0; i < array.length; i++)
            array[i] = ShapeGenerator.next();

        for (Shape s : array)
            s.draw();
    }
}
