package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelectOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Senthil/dev_downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///Users/Senthil/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		
		WebElement optionSelect = driver.findElement(By.id("selectTest1"));
		
		Select slct = new Select(optionSelect);
		slct.selectByVisibleText("New York");
		
		System.out.println(slct.getFirstSelectedOption().getText());
		

	}

}
