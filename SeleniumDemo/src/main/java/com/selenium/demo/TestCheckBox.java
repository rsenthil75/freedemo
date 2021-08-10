package com.selenium.demo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(TestCheckBox.class);
	
	org.apache.log4j.BasicConfigurator.configure();
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");

		WebElement chkbx = driver.findElement(By.id("rkwd"));
		chkbx.click();

		log.info("Checkbox Selection: "+chkbx.isSelected());


	}

}
