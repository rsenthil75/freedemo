package com.selenium.demo;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			System.out.println("value of i =" + i);

		}
		System.out.println("End of First For loop");
		
		
		

		List<String> names = new ArrayList<String>();
		names.add("Priya");
		names.add("Sumathy");
		names.add("Dhanabal");
		names.add("Kokila");
		

		for (String s : names) {
			System.out.println(s);
			
			if (s.equalsIgnoreCase("priya")) {
				System.out.println(s + " found");
				break;
			}
		}
		System.out.println("End of Second For loop");

	}

}
