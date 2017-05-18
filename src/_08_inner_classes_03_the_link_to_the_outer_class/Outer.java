package _08_inner_classes_03_the_link_to_the_outer_class;

public class Outer
{
	private String name = "";
	
	public Outer(String name)
	{
		this.name = name;
		System.out.println("Outer " + name);
	}
	
	public Inner getInner()
	{
		return new Inner();
	}
	
	public class Inner
	{
		public Inner()
		{
			System.out.println("Inner " + name);
		}
		
		public String toString()
		{
			return "Inner " + name;
		}
	}
	
}
