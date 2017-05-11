package _00_main;

import _06_polymorphism_14_inheritance_and_cleanup.*;

public class Main
{
    public static void main(String[] args) 
    {
		Cheese cheese = new Cheese();
        
		Mouse mouse = new Mouse(cheese);
        Rodent rodent = new Rodent(cheese);

		mouse.dispose();
        rodent.dispose();
	}
}
