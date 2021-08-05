
package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdeToEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/en/");
	    //driver.manage().window().setSize(new Dimension(1936, 1056));
	    driver.findElement(By.linkText("Getting started")).click();
	    driver.findElement(By.id("getting-started")).click();
	    //assertThat(driver.findElement(By.id("getting-started")).getText(), is("Getting started"));
	    driver.findElement(By.cssSelector("li:nth-child(1) li:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("#body-inner > p")).click();
	    //assertThat(driver.findElement(By.cssSelector("#body-inner > p")).getText(), is("If you are new to Selenium, we have a few resources that can help you get up to speed right away."));
	    driver.findElement(By.cssSelector("ul:nth-child(2) > li:nth-child(1) > .highlight")).click();
	    driver.findElement(By.cssSelector("h1")).click();
	    //assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Quick tour"));
	    driver.close();

	}

}

