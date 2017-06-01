package _08_inner_classes_18_nested_classes;

public class MyMain 
{
    public static class Nested
    {
        public Nested(String str)
        {
            print(str);
        }
        
        public static void print(String str)
        {
            System.out.println(str);
        }
    };

    public static void myMain()
    {
        Nested nested = new Nested("Hello World!");
        nested.print("OK");
        
    }
    
}