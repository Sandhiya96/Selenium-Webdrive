package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("sharmi2507@gmail.com");
		String u1 = txtUserName.getAttribute("placeholder");
		System.out.println(u1);
		String u2 = txtUserName.getAttribute("value");
		System.out.println(u2);
		
		
		WebElement txtpassword=driver.findElement(By.name("pass"));
		txtpassword.sendKeys("skyrunner");
		String p1 = txtpassword.getAttribute("type");
		System.out.println(p1);
		String p2 = txtpassword.getAttribute("value");
		System.out.println(p2);
		
		

		
	}

}
