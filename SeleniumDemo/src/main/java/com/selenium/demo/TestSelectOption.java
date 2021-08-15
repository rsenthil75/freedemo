package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelectOption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		driver.get("file:///C:/Selenium/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		WebElement optionSelect = driver.findElement(By.id("selectTest1"));

		Select slct = new Select(optionSelect);
		slct.selectByVisibleText("New York");

		System.out.println(slct.getFirstSelectedOption().getText());

		Thread.sleep(5000);
		driver.close();

	}

}
