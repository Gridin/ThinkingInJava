package _08_inner_classes_07_inner_classes_and_upcasting;

public class MyMain 
{
    public static void myMain()
    {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        String str = in.setName("AccessOuterFromInner");
        System.out.println(str);
    }
}
