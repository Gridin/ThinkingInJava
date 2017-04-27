package _00_main;

import _06_polymorphism_08_extensibility.*;

public class Main
{
    public static void main(String[] args) 
    {
        Instrument[] instruments = new Instrument[10];
        for (int i = 0; i < instruments.length; i++)
            instruments[i] = Generator.next();
        
        for(Instrument i : instruments)
            System.out.println(i);
    }
}
