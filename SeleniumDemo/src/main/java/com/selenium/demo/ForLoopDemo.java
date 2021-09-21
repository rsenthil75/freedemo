package com.selenium.demo;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {

	/** Test
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			System.out.println("value of i =" + i);

		}
		System.out.println("End of First For loop");




		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Vetri");
		names.add("Raja");
		names.add("Kannan");


		for (String s : names) {
			System.out.println(s);

			if (s.equalsIgnoreCase("john")) {
				System.out.println(s + " found");
				break;
			}
		}
		System.out.println("End of Second For loop");

	}

}
