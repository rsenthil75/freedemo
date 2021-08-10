package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFunction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/java/dev/freedemo/SeleniumDemo/src/main/WebApp/WebAppForTest.html");

		WebElement tableElement = driver.findElement(By.tagName("table"));

		WebElement dataElement = tableElement.findElements(By.tagName("td")).get(4);
		
		System.out.println("Fetched Table data by using Tag Name: " + dataElement.getText());

		// Fetch the table element by using xpath

		WebElement dataElement2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[1]"));

		System.out.println("Fetched Table data by using XPATH: " + dataElement2.getText());
		
		
		//Fetch and Print all the elements from the <TD>
		System.out.println("Fatching all the elements from TD");
		List<WebElement> dataElements = tableElement.findElements(By.tagName("td"));
		
		for (WebElement we :  dataElements) {
			
			System.out.println("Table Data Element Tag: "+we.getTagName()+" Text="+we.getText());
		}
		
		driver.close();

	}

}
