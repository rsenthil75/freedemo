package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleFormTest2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");

		//driver.get("file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLScCcCRrlC6wpkNj2LwHLcfv7VG4_UndRKrSyX9D9xCE6iNUiA/viewform");
		
		//Select select = new Select(driver.findElement(By.className("quantumWizMenuPaperselectOptionList")));
		Select select = new Select(driver.findElement(By.className("freebirdFormviewerComponentsQuestionSelectRoot")));
	
		select.selectByVisibleText("Id locator");

		
		
		WebElement optionSelect = driver.findElement(By.id("i22")).sendKeys(args);

		Select slct = new Select(optionSelect);
		slct.selectByVisibleText("");

		System.out.println(slct.getFirstSelectedOption().getText());

		driver.close();

	}

}
