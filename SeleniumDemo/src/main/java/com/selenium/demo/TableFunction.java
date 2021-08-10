package com.selenium.demo;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFunction {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(TableFunction.class);
		
		org.apache.log4j.BasicConfigurator.configure();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");

		WebElement tableElement = driver.findElement(By.tagName("table"));

		WebElement dataElement = tableElement.findElements(By.tagName("td")).get(4);
		
		log.info("Fetched Table data by using Tag Name: " + dataElement.getText());

		// Fetch the table element by using xpath

		WebElement dataElement2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[1]"));

		log.info("Fetched Table data by using XPATH: " + dataElement2.getText());
		
		
		//Fetch and Print all the elements from the <TD>
		log.info("Fatching all the elements from TD");
		List<WebElement> dataElements = tableElement.findElements(By.tagName("td"));
		
		for (WebElement we :  dataElements) {
			
			log.info("Table Data Element Tag: "+we.getTagName()+" Text="+we.getText());
		}
		
		driver.close();

	}

}
