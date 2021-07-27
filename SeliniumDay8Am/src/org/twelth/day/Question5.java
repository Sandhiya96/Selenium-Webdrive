package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		js.executeAsyncScript("arguments[0].setAttribute('value','sandhiya')",txtUserName );
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		js.executeScript("arguments[0].setAttribute('value','967702')",txtPass);
		WebElement txtLogin = driver.findElement(By.xpath("//input[@id='login']"));
		js.executeScript("arguments[0].click()", txtLogin);
		
	}

}
