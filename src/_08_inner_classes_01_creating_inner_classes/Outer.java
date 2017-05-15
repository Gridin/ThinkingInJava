package _08_inner_classes_01_creating_inner_classes;

public class Outer
{
	public Outer()
	{
		System.out.println("Outer");
	}
	
	public Inner getInner()
	{
		return new Inner();
	}
	
	public class Inner
	{
		public Inner()
		{
			System.out.println("Inner");
		}
		
	}
	
}
