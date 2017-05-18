package _08_inner_classes_05_using_this_and_new;

public class Outer
{
    public Outer()
    {
        System.out.println("Outer");
    }

    public class Inner
    {
        public Inner()
        {
            System.out.println("Inner");
        }

        @Override
        public String toString()
        {
            return "Inner";
        }
    }
	
}
