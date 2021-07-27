package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/\r\n" + "");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].setAttribute('value','Greens123')",txtUser );
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		js.executeScript("arguments[0].setAttribute('value','123456')",txtPass );
		WebElement txtLogin = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", txtLogin);
	}

}
