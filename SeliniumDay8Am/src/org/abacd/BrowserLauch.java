package org.abacd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserLauch {
	public static void main(String[] args) {
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		//instantiation.....obj creation
		WebDriver driver=new ChromeDriver();
		//to launch a url
		driver.get("https://www.facebook.com/");
		//to maximize the window
//		Options manage = driver.manage();
//		Window window = manage.window();
//		window.maximize();
		driver.manage().window().maximize();
		//user
	     WebElement user = driver.findElement(By.xpath("//input[@name='email']"));	
	     user.sendKeys("greens");
	     //pass
	     WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	     pass.sendKeys("67889");
	     //login
	     WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	     login.click();
	     
	     
	}

}
