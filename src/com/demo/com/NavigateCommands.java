package com.demo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) 
	{
		// Create a new instance of the FireFox driver

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.saucedemo.com/");
		
		// Open ToolsQA web site
		String appUrl = "https://www.saucedemo.com/";
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("*//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("*//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("*//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']")).click();
		
		        // Go back to Home Page
				driver.navigate().back();

				// Go forward to Registration page
				driver.navigate().forward();

				// Go back to Home page
				driver.navigate().to(appUrl);

				// Refresh browser
				driver.navigate().refresh();

				// Close browser
				driver.close();
	}

}
