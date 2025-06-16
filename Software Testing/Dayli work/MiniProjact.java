package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProjact {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Development\\chrome web drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("mobile")).sendKeys("6354700028");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("6354700028");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[value=Login]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class=btn-close]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Yatrik Prajapati")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("address")).sendKeys(" ,Ahmedabad");
		Thread.sleep(2000);
		driver.close();
		
	}

}
