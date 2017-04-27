package _00_main;

import _06_polymorphism_05_producing_the_right_behavior.*;

public class Main
{
    public static void main(String[] args) 
    {
        Cycle[] cycles = new Cycle[] {new Unicycle(), new Bicycle(), new Tricycle()};
        
        for (int i = 0; i < cycles.length; i++)
            cycles[i].ride();
    }
}
