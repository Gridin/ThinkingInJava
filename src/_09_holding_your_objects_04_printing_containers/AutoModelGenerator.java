package _09_holding_your_objects_04_printing_containers;

import java.util.*;

public class AutoModelGenerator
{
	private ArrayList<String> list = new ArrayList<String>(Arrays.asList("Audi", "Porshe", "Mersedes", "Opel", "Skoda"));
	private int current = -1;
	
	public boolean next()
	{
		if(++current >= list.size())
		{
			current = -1;
			return false;
		}
		
		return true;
	}
	
	public String get()
	{
		return list.get(current);
	}
	
}
