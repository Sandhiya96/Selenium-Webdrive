package org.eight.day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://retail.onlinesbi.com/retail/login.htm");
	    WebElement txtLogin = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
	    txtLogin.click();
	    WebElement txtLogin2 = driver.findElement(By.xpath("//input[@type='submit']"));
	    txtLogin2.click();
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
	}

}
