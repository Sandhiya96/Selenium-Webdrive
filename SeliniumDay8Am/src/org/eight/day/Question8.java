package org.eight.day;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?");
	    WebElement txtClick = driver.findElement(By.xpath("//a[text()='click here']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", txtClick);
	  
	   
	    WebElement txtUser = driver.findElement(By.xpath("(//a[text()='Get User ID'])[2]"));
	    js.executeScript("arguments[0].setAttribute('value','sandhiya')", txtUser);
		WebElement txtPass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		js.executeScript("arguments[0].setAttribute('value','45678')", txtPass);
		
	}

}
