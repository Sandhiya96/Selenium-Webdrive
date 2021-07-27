package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/?hl=en)");
	    Thread.sleep(3000);
	    WebElement txtUser = driver.findElement(By.name("username"));
	    txtUser.sendKeys("Sandhiya");
	    driver.findElement(By.name("password")).sendKeys("6785335");
	    
	    
	    
		
	}

}
