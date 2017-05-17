package _08_inner_classes_02_the_link_to_the_outer_class;

public class MyMain 
{
    public static void myMain()
    {

        Sequence str = new Sequence(5);
        str.add("Hello");
        str.add("World");
        str.add("!");
        str.add("!");
        str.add("!");

        System.out.println(str);
       
        Selector selector = str.selector();
        
        selector.select();
        while(selector.next())
            System.out.println(selector.current());
        
        selector.select();
        while(selector.next())
            System.out.println(selector.current());

    }
}
