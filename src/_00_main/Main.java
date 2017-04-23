package _00_main;

import _05_reusing_classes_20_final_methods.*;

public class Main
{
    public static void main(String[] args) 
	{
		Frog frog = new Frog();
		frog.swim();
		frog.walk();
		
		Amphibian am = frog;
		am.walk();
	}

}
