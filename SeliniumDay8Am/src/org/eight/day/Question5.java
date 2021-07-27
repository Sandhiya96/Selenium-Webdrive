package org.eight.day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp\r\n" +"");
	    WebElement txtSign = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	    txtSign.click();
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
	    
	}

}
