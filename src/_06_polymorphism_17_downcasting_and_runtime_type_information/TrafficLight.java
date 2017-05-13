package _06_polymorphism_17_downcasting_and_runtime_type_information;

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
    
    public void beep()
    {
        ((Green)color).beep();
    }
    
    @Override public String toString()
    {
        return "" + color;
    }
}
