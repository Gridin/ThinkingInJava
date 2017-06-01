package _08_inner_classes_21_classes_inside_interfaces;

public interface INested 
{
    public static class Nested
    {
        public static void p()
        {
            print();
        }
        
    };

    public static void print()
    {
        System.out.println("INested.print()");
    }
}
