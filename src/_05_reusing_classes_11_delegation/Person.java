package _05_reusing_classes_11_delegation;

public class Person
{
	private Head head = new Head();
	
	public void look()
	{
		head.look();
	}

	public void speak()
	{
		head.speak();
	}
}
