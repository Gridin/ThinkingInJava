package _08_inner_classes_06_2_inner_classes_and_upcasting;

import _08_inner_classes_06_1_inner_classes_and_upcasting.*;

public class Outer
{
    public Outer()
    {
        System.out.println("Outer");
    }

    protected class Inner implements PrintName
    {
        public Inner()
        {
            System.out.println("Inner");
        }
        
        @Override
        public void name()
        {
            System.out.println("Name");
        }

        @Override
        public String toString()
        {
            return "Inner";
        }
    }
	
}
