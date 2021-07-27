package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Aff9UZ4Bcrltuh_kC-uKVEEEWOzPvcfi4bNjCt4TYupMX9HJgVUjhGco6Qd87kzVDSqXPp9XSMKEL--MifYHyNsAEUCa46WBkVtFPPyfozVBKQ&smuh=31027&lh=Ac_s6-W4b_Qf6SppYfA");
		
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("sharmi2507@gmail.com");
		
		WebElement txtpassword=driver.findElement(By.name("pass"));
		txtpassword.sendKeys("skyrunner");
		
		WebElement txtLogin=driver.findElement(By.name("login")); 
		txtLogin.click();
	
		
		
		
		
	}

}
