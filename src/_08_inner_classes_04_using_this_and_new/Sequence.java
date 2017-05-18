package _08_inner_classes_04_using_this_and_new;

public class Sequence 
{
    private String[] array;
    private int counter = 0;
    
    public Sequence(int size)
    {
        array = new String[size];
    }
    
    public int lenght()
    {
        return array.length;
    }
    
    public boolean add(String str)
    {
        if (counter < array.length)
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
        
        @Override
        public String current()
        {
            if (id < array.length && id >= 0)
                return array[id];
            
            return null;
        }
        
        @Override
        public boolean next()
        {
            return ++id < array.length;
        }
        
        @Override
        public void select()
        {
            id = -1;
        }
        
        /**
         *
         * @return
         */
        @Override
        public Sequence getSequence()
        {
            return Sequence.this;
        }
    }
}
