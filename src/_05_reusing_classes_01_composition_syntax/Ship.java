package _05_reusing_classes_01_composition_syntax;

public class Ship 
{
    //ShipDesk[] desks = new ShipDesk[]{new ShipDesk(), new ShipDesk(), new ShipDesk()};
    //ShipDesk[] desks = {new ShipDesk(), new ShipDesk(), new ShipDesk()};
    ShipDesk[] desks = new ShipDesk[3];
    
    {
        //for (int i = 0; i < 3; i++)
        //    desks[i] = new ShipDesk();
    }
    
    public Ship()
    {
        //for (int i = 0; i < 3; i++)
        //    desks[i] = new ShipDesk();
    }
    
    public void init()
    {
        for (int i = 0; i < 3; i++)
            desks[i] = new ShipDesk();
    }
    
}
