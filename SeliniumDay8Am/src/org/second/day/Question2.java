package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		WebElement txtFrom=driver.findElement(By.id("src"));
		txtFrom.sendKeys("chennai");
		
		WebElement txtTo=driver.findElement(By.id("dest"));
		txtTo.sendKeys("Thanjavor");
		
		}

}
