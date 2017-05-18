package _08_inner_classes_05_using_this_and_new;

public class Separate 
{
    private Outer.Inner inner;
    
    public Separate(Outer out)
    {
        inner = out.new Inner();
    }
}
