package _08_inner_classes_10_inner_classes_in_methods_and_scopes;

public class MyMain 
{
    public static void myMain()
    {

     Print printer = getPrint(); 
     printer.print("Hello World!");
        
    }
    
    public static Print getPrint()
    {
        if (true)
        {
            class Printer implements Print
            {
                @Override
                public void print(String str)
                {
                    System.out.println(str);
                }
            }
            Printer printer = new Printer();
            
            return (Print)printer;
        }
        
        return null;
    }
}
