package _00_main;

import _05_reusing_classes_18_the_final_keyword.*;

public class Main
{
    public static void main(String[] args) 
	{
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("Car1 model is " + car1.MODEL);
		System.out.println("Car1 number is " + car1.number);

		System.out.println("Car2 model is " + car2.MODEL);
		System.out.println("Car2 number is " + car2.number);
		
		//car1.number = 0;
		
	}

}
