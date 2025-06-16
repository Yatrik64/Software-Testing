package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.name("name"));
		for(int i=0;i<list.size();i++)
		{
			Thread.sleep(5000);
			list.get(i).click();
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
