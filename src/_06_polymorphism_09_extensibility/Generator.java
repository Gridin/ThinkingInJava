package _06_polymorphism_09_extensibility;

import java.util.Random;

public class Generator 
{
    private static Random rand = new Random();
    
    public static Rodent next()
    {
        Rodent result = null;
        
        switch(rand.nextInt(3))
        {
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }

        return result;
    }
}
