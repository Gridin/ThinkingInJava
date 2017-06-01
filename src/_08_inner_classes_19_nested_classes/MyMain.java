package _08_inner_classes_19_nested_classes;

public class MyMain 
{
    public class Inner1
    {
        public Inner1()
        {
            System.out.println("Inner1");
        }

        public class Inner2
        {
            public Inner2()
            {
                System.out.println("Inner2");
            }

        };
    };

    public static class Nested1
    {
        public Nested1()
        {
            System.out.println("Nested1");
        }

        public static class Nested2
        {
            public Nested2()
            {
                System.out.println("Nested2");
            }

        };
    };

    public static void myMain()
    {
        MyMain obj = new MyMain();
        Inner1 inn1 = obj.new Inner1();
        Inner1.Inner2 inn2 = inn1.new Inner2();
        
        Nested1 nes1 = new Nested1();
        Nested1.Nested2 nes2 = new Nested1.Nested2();
        
    }
    
}