package _09_holding_your_objects_01_generics_and_type_safe_containers;

import java.util.*;

public class MyMain
{
    public static void myMain()
    {
        ArrayList<Gerbil> array = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			array.add(new Gerbil());
		
		for(Gerbil g : array)
			g.hop();
    }
    
}