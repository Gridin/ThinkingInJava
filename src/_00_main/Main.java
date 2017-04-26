package _00_main;

import _06_polymorphism_01_forgetting_the_object_type.*;

public class Main
{
    public static void main(String[] args) 
    {
        Cycle[] cycles = new Cycle[] {new Unicycle(), new Bicycle(), new Tricycle()};
        
        for (int i = 0; i < cycles.length; i++)
            cycles[i].ride();
    }
}
