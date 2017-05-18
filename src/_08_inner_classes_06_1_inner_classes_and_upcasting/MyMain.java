package _08_inner_classes_06_1_inner_classes_and_upcasting;

import _08_inner_classes_06_3_inner_classes_and_upcasting.OuterNext;

public class MyMain 
{
    public static void myMain()
    {
        OuterNext out = new OuterNext();
        PrintName pr = out.getInner();
        pr.name();
    }
}
