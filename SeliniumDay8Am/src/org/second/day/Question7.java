package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.snapdeal.com/login\r\n" +"\r\n" +"");
		WebElement txtUser=driver.findElement(By.id("userName"));
		txtUser.sendKeys("9677029891");
		}

}
