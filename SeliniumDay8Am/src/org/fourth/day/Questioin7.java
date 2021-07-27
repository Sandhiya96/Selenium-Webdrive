package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questioin7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("green velmurugan");
		 
		 driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		 driver.findElement(By.xpath("//h3[contains(text(),'Greens Technologys')]")).click();
	}

}
