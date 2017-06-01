package _08_inner_classes_20_classes_inside_interfaces;

public interface INested
{
    public static class Nested
    {
      public Nested()
      {
          System.out.println("Nested");
      }
    };
}
