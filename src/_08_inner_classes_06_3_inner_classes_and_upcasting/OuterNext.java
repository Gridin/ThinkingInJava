package _08_inner_classes_06_3_inner_classes_and_upcasting;

import _08_inner_classes_06_1_inner_classes_and_upcasting.*;
import _08_inner_classes_06_2_inner_classes_and_upcasting.*;

public class OuterNext extends Outer
{

    public PrintName getInner()
    {
        return (PrintName)(new Inner());
    }
}
