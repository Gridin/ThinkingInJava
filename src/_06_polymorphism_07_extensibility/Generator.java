package _06_polymorphism_07_extensibility;

import java.util.Random;

public class Generator 
{
    private static Random rand = new Random();
    
    public static Instrument next()
    {
        Instrument result = null;
        
        switch(rand.nextInt(5))
        {
            case 0: return new Wind();
            case 1: return new Brass();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Gitar();
        }

        return result;
    }
}
