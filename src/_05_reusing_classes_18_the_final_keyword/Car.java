package _05_reusing_classes_18_the_final_keyword;

import java.util.*;

public class Car
{
	private static Random rand = new Random();
	final public static int MODEL = rand.nextInt();
	final public int number = rand.nextInt();
}
