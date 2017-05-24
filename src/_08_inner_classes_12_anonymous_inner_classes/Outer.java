package _08_inner_classes_12_anonymous_inner_classes;

public class Outer
{
    private String name = "Outer";
            
    private String getName()
    {
        return name;
    }

    public TestInner getInner()
    {
        return new TestInner()
        {
            @Override
            public void setName(String name)
            {
                System.out.println(Outer.this.getName());
                Outer.this.name = name;
                System.out.println(Outer.this.getName());
            }
        };
    }
}
