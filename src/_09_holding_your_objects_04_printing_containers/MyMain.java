package _09_holding_your_objects_04_printing_containers;

import java.lang.reflect.Array;
import java.util.*;

public class MyMain
{
    public static void myMain()
    {
		AutoModelGenerator gen = new AutoModelGenerator();
		
		ArrayList<String> aList = new ArrayList<String>();
		while(gen.next())
			aList.add(gen.get());
		
		LinkedList<String> lList = new LinkedList<String>();
		while(gen.next())
			lList.add(gen.get());
		
		HashSet<String> hSet = new HashSet<String>();
		while(gen.next())
			hSet.add(gen.get());
		
		LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
		while(gen.next())
			lhSet.add(gen.get());
		
		TreeSet<String> tSet = new TreeSet<String>();
		while(gen.next())
			tSet.add(gen.get());
		
		System.out.println(aList);
		System.out.println(lList);
		System.out.println(hSet);
		System.out.println(lhSet);
		System.out.println(tSet);
		
	}
    
}