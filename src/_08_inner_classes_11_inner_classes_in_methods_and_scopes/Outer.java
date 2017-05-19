package _08_inner_classes_11_inner_classes_in_methods_and_scopes;

public class Outer
{
    public String setName(String name)
    {
        Inner in = this.new Inner();
        in.name = name;
        
        return  in.name;
    }
    
    public Print getPrint()
    {
        return this.new Inner();
    }
    
    private class Inner implements Print
    {
        private String name = "Inner";
            
        @Override
        public void print()
        {
            System.out.println(name);
        }
    }
}
