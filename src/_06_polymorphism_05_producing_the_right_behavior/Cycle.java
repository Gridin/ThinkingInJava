package _06_polymorphism_05_producing_the_right_behavior;

public class Cycle
{
    public void ride()
    {
        System.out.println("Cycle");
        wheels(0);
    }
    
    public void wheels(int x)
    {
        System.out.println(", wheels " + x);
    }
}
