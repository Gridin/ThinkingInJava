package _07_interfaces_16_adapting_to_an_interface;

import java.nio.*;

public class MyInput implements Readable
{
    public int read(CharBuffer cb)
    {
        cb.append("Hello World!");
        
        return -1;
    }
}
