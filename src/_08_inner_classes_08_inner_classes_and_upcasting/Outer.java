package _08_inner_classes_08_inner_classes_and_upcasting;

public class Outer
{
    public String setName(String name)
    {
        Inner in = this.new Inner();
        in.name = name;
        
        return  in.name;
    }
    
    
    public class Inner
    {
        private String name = "Inner";
            
    }
	
}
