package org.leventh.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
//		driver.navigate().refresh();
//		driver.navigate().to("https://www.redbus.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(login.getCssValue("font-family"));
		System.out.println(login.getCssValue("color"));
		System.out.println(login.getCssValue("line-height"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background-color:black;color:red')", login);
        
	}

}
