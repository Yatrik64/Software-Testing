package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.id("mobile")).sendKeys("6354700028");
		Thread.sleep(5000);
		driver.findElement(By.name("user_password")).sendKeys("6354700028");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(5000);
		driver.close(); 
		
	}

}
