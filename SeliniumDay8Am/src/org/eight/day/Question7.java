package org.eight.day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    driver.switchTo().frame(0);
	    WebElement txtUser = driver.findElement(By.xpath("//input[@type='text']"));
	    txtUser.sendKeys("sandhiya");
	    String s1 = txtUser.getAttribute("value");
	    System.out.println(s1);
	    WebElement txtCon = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
	    txtCon.click();
	    WebElement txtPass = driver.findElement(By.xpath("//input[@name='fldPassword']"));
	    txtPass.sendKeys("967702");
	    String s2 = txtPass.getAttribute("value");
	    System.out.println(s2);
	    WebElement txtLogin = driver.findElement(By.xpath("//img[@alt='Login']"));
	    txtLogin.click();
	}

}
