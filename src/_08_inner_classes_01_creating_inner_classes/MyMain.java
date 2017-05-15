package _08_inner_classes_01_creating_inner_classes;

public class MyMain 
{
    public static void myMain()
    {
		Outer out = new Outer();
		Outer.Inner in = out.getInner();
    }
}
