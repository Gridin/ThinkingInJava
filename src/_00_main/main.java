package _00_main;

import _05_reusing_classes_12_guaranteeing_proper_cleanup.*;

public class main 
{

    public static void main(String[] args) 
    {
		Stem st = new Stem();
		st.dispose();
		System.gc();
	}

}
