package _07_interfaces_07_interfaces;

public class TrafficLight 
{
    private Color color = new Green();
    private Color prev = new Yellow();
    
    public void next()
    {
        if (color.name() == "Green" || color.name() == "Red")
        {
            prev = color;
            color = new Yellow();
        }
        else if (prev.name() == "Green")
        {
            prev = color;
            color = new Red();
        }
        else if (prev.name() == "Red")
        {
            prev = color;
            color = new Green();
        }
    }
    
    @Override public String toString()
    {
        return "" + color.name();
    }
}
