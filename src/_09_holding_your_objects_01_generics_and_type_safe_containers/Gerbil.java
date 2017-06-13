package _09_holding_your_objects_01_generics_and_type_safe_containers;

public class Gerbil
{
	public static int nextNumber;
	public int gerbilNumber;
	
	public Gerbil()
	{
		gerbilNumber = nextNumber++;
	}
	
	public void hop()
	{
		System.out.print("Gerbil №" + gerbilNumber + " ");
		for (int i = 0; i < gerbilNumber; i++)
			System.out.print("HOP ");
		System.out.println();
	}
}
