package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleFormTest1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");

		//driver.get(
			//	"file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLScCcCRrlC6wpkNj2LwHLcfv7VG4_UndRKrSyX9D9xCE6iNUiA/viewform");
		
				
		WebElement chkbx1 = driver.findElement(By.id("i31"));
		chkbx1.click();
		WebElement chkbx2 = driver.findElement(By.id("i34"));
		chkbx2.click();
		WebElement chkbx3 = driver.findElement(By.id("i40"));
		chkbx3.click();

		System.out.println("CheckBox1 is selected"+chkbx1.isSelected());
		System.out.println(chkbx2.isSelected());
		System.out.println(chkbx3.isSelected());
		
		


	}

}

	


