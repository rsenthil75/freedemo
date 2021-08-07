package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();


		// Test name: Test1
	    // Step # | name | target | value
	    // 1 | open | / |
	    driver.get("https://www.google.com/");

	    driver.findElement(By.name("q")).click();
	    // 4 | type | name=q | Selenium
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	    // 5 | sendKeys | name=q | ${KEY_ENTER}
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    // 6 | click | linkText=Images |
	    driver.findElement(By.linkText("Images")).click();
	    // 7 | click | css=.islrc > .isv-r:nth-child(1) .rg_i |
	    driver.findElement(By.cssSelector(".islrc > .isv-r:nth-child(1) .rg_i")).click();

	    driver.close();

	}

}
