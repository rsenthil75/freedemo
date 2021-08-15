package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");

		//driver.get(
			//	"file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		driver.get("file:///C:/Selenium/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		WebElement chkbx = driver.findElement(By.id("rkwd"));
		chkbx.click();

		System.out.println(chkbx.isSelected());


	}

}
