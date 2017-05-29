package _08_inner_classes_14_anonymous_inner_classes;

public class MyMain 
{
    public static void myMain()
    {
        Print printer = getPrinter(); 
        printer.print("Hello World!");
    }
    
    public static Print getPrinter()
    {
        return new Print()
        {
            @Override
            public void print(String str)
            {
                System.out.println(str);
            }
        };
    }
}
