package _06_polymorphism_02_producing_the_right_behavior;

import java.util.*;

public class ShapeGenerator 
{
    private static Random rand = new Random();

    public static Shape next()
    {
        Shape result;
        switch(rand.nextInt(3))
        {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
        
        return null;
    }
}
