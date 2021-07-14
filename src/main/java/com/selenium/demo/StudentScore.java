package com.selenium.demo;

public class StudentScore {

	private String studentName;
	private int elaScore;
	private int algbrScore;
	private int artsScore;

	private int totalScore;
	private float avgScore;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getElaScore() {
		return elaScore;
	}

	public void setElaScore(int elaScore) {
		this.elaScore = elaScore;
	}

	public int getAlgbrScore() {
		return algbrScore;
	}

	public void setAlgbrScore(int algbrScore) {
		this.algbrScore = algbrScore;
	}

	public int getArtsScore() {
		return artsScore;
	}

	public void setArtsScore(int artsScore) {
		this.artsScore = artsScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public float getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(float avgScore) {
		this.avgScore = avgScore;
	}

	public int getCalaculatedTotalScore() {
		//this.totalScore = this.elaScore+this.algbrScore+this.artsScore;
		totalScore = elaScore+algbrScore+artsScore;
		
		return totalScore;
	}

	public float calculateAvgScore() {
		this.avgScore = this.totalScore/3;
		
		return this.avgScore;
	}

	

}
