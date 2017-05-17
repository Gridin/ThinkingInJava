package _08_inner_classes_03_the_link_to_the_outer_class;

public class MyMain 
{
    public static void myMain()
    {
		Outer out = new Outer("Access");
		Outer.Inner in = out.getInner();
    }
}
