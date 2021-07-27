package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("agalya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kutty");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("agalyakutty");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Karna@6782");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Karna@6782");
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
		
	}

}
