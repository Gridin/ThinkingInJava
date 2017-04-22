package _05_reusing_classes_13_name_hiding;

public class Animal 
{
    private String name;
    
	public void setName(String name)
	{
		this.name = name;
	}
    
	public void setName(int name)
	{
		this.name = Integer.toString(name);
	}
    
	public void setName(float name)
	{
		this.name = Float.toString(name);
	}
    
}
