package _08_inner_classes_02_the_link_to_the_outer_class;

public class Sequence 
{
    private String[] array;
    private int size = 0;
    private int counter = 0;
    
    public Sequence(int size)
    {
        array = new String[size];
        this.size = size;
    }
    
    public int lenght()
    {
        return size;
    }
    
    public boolean add(String str)
    {
        if (counter < size)
        {
            array[counter++] = str;
            return true;
        }
        
        return false;
    }
    
    public String toString()
    {
        String str = "";
        for (int i = 0; i < counter; i++)
        {
            str = str + array[i] + " ";
        }
        
        return str.trim();
    }
    
    public SelectorSequence selector()
    {
        return new SelectorSequence();
    }
    
    public class SelectorSequence implements Selector
    {
        private int id = -1;
        
        public String current()
        {
            if (id < size && id >= 0)
                return array[id];
            
            return null;
        }
        
        public boolean next()
        {
            return ++id < size;
        }
        
        public void select()
        {
            id = -1;
        }
    }
}
