package _00_main;

import _06_polymorphism_09_extensibility.*;

public class Main
{
    public static void main(String[] args) 
    {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < rodents.length; i++)
            rodents[i] = Generator.next();
        
        for(Rodent i : rodents)
            System.out.println(i);
    }
}
