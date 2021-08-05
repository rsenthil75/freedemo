package com.selenium.demo;

public class StudentAdmin {

	public static void main(String s[]) {

		System.out.println("I am in Main Method");

		StudentScore s1 = new StudentScore();
		s1.setStudentName("Nila");
		s1.setElaScore(100);
		s1.setAlgbrScore(99);
		s1.setArtsScore(95);

		int totScore = s1.getCalaculatedTotalScore();
		System.out.println("Score Details of Student1, ELA=" + s1.getElaScore() + ",Algebra=" + s1.getAlgbrScore()
				+ ",Arts=" + s1.getArtsScore());

		System.out.println("Total Score of Student1 =" + totScore);
		System.out.println("Total Score of Student1 =" + s1.getTotalScore());

		s1.calculateAvgScore();
		System.out.println("Average Score of Student1 =" + s1.getAvgScore());

		s1.calculateTwoSubTot();
		System.out.println("Total of Two Subjects =" + s1.gettwoSubTot());

	}

}
