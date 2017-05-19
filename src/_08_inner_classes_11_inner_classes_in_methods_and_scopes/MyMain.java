package _08_inner_classes_11_inner_classes_in_methods_and_scopes;

public class MyMain 
{
    public static void myMain()
    {
        Outer out = new Outer();
        Print inner = out.getPrint();
        inner.print();
    }
}
