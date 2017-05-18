package _08_inner_classes_07_inner_classes_and_upcasting;

public class Outer
{
    private String name = "Outer";
            
    private String getName()
    {
        return name;
    }
    
    public class Inner
    {
        public String setName(String name)
        {
            Outer.this.name = name;
            return getName();
        }
    }
	
}
