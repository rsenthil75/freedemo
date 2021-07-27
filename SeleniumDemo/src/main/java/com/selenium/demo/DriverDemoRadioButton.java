package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDemoRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Senthil/dev_downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///Users/Senthil/dev/freedemo/SeleniumDemo/src/main/WebApp/RadioButtonDemo.html");
		
		

		List<WebElement> radioButtons = driver.findElements(By.name("color"));

		radioButtons.get(2).click();

		for (WebElement rb : radioButtons) {

			if (rb.isSelected()) {
				System.out.println(rb.getAttribute("value"));
				break;	
			}
				
		}
		
		driver.close();

	}

}
