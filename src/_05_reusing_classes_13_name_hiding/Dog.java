package _05_reusing_classes_13_name_hiding;

public class Dog extends Animal
{
	public void setName(double name)
	{
		this.setName(Double.toString(name));
	}
}
