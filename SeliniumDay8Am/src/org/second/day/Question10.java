package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeliniumDay8Am\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtUser=driver.findElement(By.xpath("//input[@name='username']"));
		txtUser.sendKeys("sandhiya");
		WebElement txtPass=driver.findElement(By.xpath("//input[@name='password']"));
		txtPass.sendKeys("123456");
		
	}
	
	

}
