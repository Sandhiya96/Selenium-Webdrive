package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtSer=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		txtSer.sendKeys("sandhuajap@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("6578898");
		
	}

}
