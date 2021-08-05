package com.selenium.demo;

public class FirstJavaClass {


	private static String getMyName() {

		return "Java";
	}

	private static int getSumOfTwoNumber(int i, int j) {
		int k=i+j;
		return k;
	}

	private static int getSumOfnNumber(int i) {
		int sum = ((i)*(i+1))/2;
		return sum;
	}


	public static void main(String[] args) {

		String myName = getMyName();
		System.out.println("My Name is "+myName);

		int sum = getSumOfTwoNumber(10,15);
		System.out.println("Sum of 10 and 15 = "+sum);

		int sumOfnNumber = getSumOfnNumber(15);
		System.out.println("Sum of 0..15 ="+sumOfnNumber);


	}




}
