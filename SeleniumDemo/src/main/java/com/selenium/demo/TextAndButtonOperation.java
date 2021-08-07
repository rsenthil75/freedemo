package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAndButtonOperation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");

		WebElement fName = driver.findElement(By.id("fname"));
		fName.sendKeys("Test First Name");

		WebElement lName = driver.findElement(By.id("lname"));
		lName.sendKeys("Test Last Name");

		WebElement btn1 = driver.findElement(By.id("btn1"));
		btn1.click();

		WebElement btn2 = driver.findElement(By.id("btn2"));
		btn2.click();
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text="+alert.getText());
		alert.accept();
		System.out.println("Alert Accepted");

		driver.close();

	}

}
