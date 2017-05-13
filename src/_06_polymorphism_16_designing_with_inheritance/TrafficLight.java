package _06_polymorphism_16_designing_with_inheritance;

public class TrafficLight 
{
    private Color color = new Green();
    private Color prev = new Yellow();
    
    public void next()
    {
        if (color.toString() == "Green" || color.toString() == "Red")
        {
            prev = color;
            color = new Yellow();
        }
        else if (prev.toString() == "Green")
        {
            prev = color;
            color = new Red();
        }
        else if (prev.toString() == "Red")
        {
            prev = color;
            color = new Green();
        }
    }
    
    @Override public String toString()
    {
        return "" + color;
    }
}
