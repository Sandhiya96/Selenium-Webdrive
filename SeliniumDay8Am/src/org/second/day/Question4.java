package org.second.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUser=driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtUser.sendKeys("sandhiya");
		WebElement txtclk = driver.findElement(By.xpath(""));
		txtclk.click();

		WebElement txtPass=driver.findElement(By.xpath("//input[@class='login-input-password']"));
		txtPass.sendKeys("9677029891");
		}

}
