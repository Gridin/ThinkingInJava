package _08_inner_classes_04_using_this_and_new;

public class MyMain 
{
    public static void myMain()
    {

        Sequence str = new Sequence(5);
        Selector selector = str.selector();

        str.add("Hello");
        str.add("World");

        Sequence newReference = selector.getSequence();
        newReference.add("!");
        newReference.add("!");
        newReference.add("!");

        System.out.println(newReference);
       
        
        selector.select();
        while(selector.next())
            System.out.println(selector.current());
        
        selector.select();
        while(selector.next())
            System.out.println(selector.current());

    }
}
