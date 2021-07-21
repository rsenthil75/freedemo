package com.selenium.demo;

public class SumOfN {

	public static void main(String[] args) {

		SumOfN sn = new SumOfN();
		int n = 10;
		int sum = sn.getSum(n);

		System.out.println("Sum from 0..." + n + "= " + sum);

	}

	private int getSum(int n) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {

			sum = sum + i;

		}

		return sum;
	}

}
