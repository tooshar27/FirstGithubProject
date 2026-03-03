package com.demo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName 
{

	public static void main(String[] args) 
	{
		// Create a new instance of the FireFox driver

				WebDriver driver = new ChromeDriver();
				
				//driver.get("https://www.saucedemo.com/");
				
				// Open ToolsQA web site
				String appUrl = "https://demoqa.com/text-box/";
				driver.get(appUrl);
				driver.manage().window().maximize();
				
				   // Find elements using tag name
				List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
				
				if(allInputElements.size() !=0)
				{
					System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
					for(WebElement inputElement : allInputElements) 
					   {
						   System.out.println(inputElement.getAttribute("placeholder"));
					   }
							
				}
				
	}

}
