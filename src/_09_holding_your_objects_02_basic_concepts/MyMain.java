package _09_holding_your_objects_02_basic_concepts;

import java.util.*;

public class MyMain
{
    public static void myMain()
    {
		ArrayList<Integer> array = new ArrayList<Integer>(10);

		for(int i = 0; i < 10; i++)
			array.add(i);

		for(int i = 100; i < 110; i++)
			array.set(i-100, i);
		
		for(Integer i : array)
			System.out.println(i);
	}
    
}