package com.selenium.demo;

public class FirstObjectDemo {

	int a,b;
	String myName;


	public static void main(String[] args) {

		FirstObjectDemo demo1 = new FirstObjectDemo();
		String nameDemo1 = demo1.getMyName("Demo1");
		System.out.println("My Name is "+nameDemo1);
		int sum1 = demo1.getSum(10,15);
		System.out.println("Sum of 10 and 15="+sum1);


		FirstObjectDemo demo2 = new FirstObjectDemo();
		String nameDemo2 = demo2.getMyName("Demo2");
		System.out.println("My Name is "+nameDemo2);
		int sum2 = demo2.getSum(50,15);
		System.out.println("Sum of 50 and 15="+sum2);
		
	}


	private int getSum(int i, int j) {

		return i+j;
	}


	private String getMyName(String string) {

		return "Java "+string;
	}

}
