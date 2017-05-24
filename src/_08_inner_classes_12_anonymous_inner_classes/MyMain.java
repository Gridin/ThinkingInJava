package _08_inner_classes_12_anonymous_inner_classes;

public class MyMain 
{
    public static void myMain()
    {
        Outer out = new Outer();
        out.getInner().setName("AccessOuterFromInner");
    }
}
