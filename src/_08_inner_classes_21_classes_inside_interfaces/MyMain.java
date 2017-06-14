package _08_inner_classes_21_classes_inside_interfaces;

public class MyMain
{
    public static void myMain()
    {
        int x = 0;
        
        while (x < 4) //
        {
            x = x - 1; 
                    
            if (x < 1)
            {
                System.out.print("a "); 
            }

            x = x + 2;
            
            if (x > 3) //
            {
                System.out.print("an"); 
                System.out.print(" oyster");
            }
            
            if (x == 1)
            {
                System.out.print("noise");
            }
            
            if (x > 1) //
            {
                System.out.print("annoys");
            }
            
            System.out.println("");
            x = x + 1;
        }                
    }
    
}