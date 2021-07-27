package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		txtLogin.click();
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','Sandhiya')", txtUser);
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		System.out.println(o1);
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','96779298')", txtPass);
		Object o2 = js.executeScript("return arguments[0].getAttribute('value')", txtPass);
		System.out.println(o2);
		
	}

}
