package _08_inner_classes_05_using_this_and_new;

public class MyMain 
{
    public static void myMain()
    {
        Outer out = new Outer();

        Separate separate = new Separate(out);
    }
}
