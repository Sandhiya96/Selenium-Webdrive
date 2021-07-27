package org.nineth.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtLogin = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		txtLogin.click();
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s=new Select(year);
		s.selectByValue("1996");
	    List<WebElement> allOptions = s.getOptions();
	    for (int i = 0; i < allOptions.size(); i++) {
	    	WebElement eachOptions = allOptions.get(i);
	    	System.out.println(eachOptions.getText());
			
		}
	    
		
		
	}

}
