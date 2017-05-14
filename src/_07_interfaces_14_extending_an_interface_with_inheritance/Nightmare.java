package _07_interfaces_14_extending_an_interface_with_inheritance;

public class Nightmare extends Monster implements Move
{
	public void fly()
	{
		System.out.println("Fly");
	}

	public void swim()
	{
		System.out.println("Swim");
	}

	public void dive()
	{
		System.out.println("Dive");
	}

	public void crawl()
	{
		System.out.println("Crawl");
	}

	public void bury()
	{
		System.out.println("Bury");
	}

}
