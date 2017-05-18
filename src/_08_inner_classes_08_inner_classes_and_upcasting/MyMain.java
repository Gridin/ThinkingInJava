package _08_inner_classes_08_inner_classes_and_upcasting;

public class MyMain 
{
    public static void myMain()
    {
        Outer out = new Outer();
        String str = out.setName("Inner");
        
        System.out.println(str);
        
        
    }
}
