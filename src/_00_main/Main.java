package _00_main;

import _06_polymorphism_17_downcasting_and_runtime_type_information.*;

public class Main
{
    public static void main(String[] args) 
    {
        TrafficLight light = new TrafficLight();
        System.out.println(light);
        light.beep();
        
        light.next();
        System.out.println(light);

        light.next();
        System.out.println(light);
        //light.beep();

    }
}
