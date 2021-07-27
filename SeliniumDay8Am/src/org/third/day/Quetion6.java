package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quetion6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/\r\n" + "");
		WebElement fstName=driver.findElement(By.xpath("//option[@value='91'][1]"));
		fstName.click();
		driver.findElement(By.xpath("//input[@id='smsTXTBOX']")).sendKeys("9677029891");
		driver.findElement(By.xpath("//input[@id='sendLinkButton']")).click();
	

}
}