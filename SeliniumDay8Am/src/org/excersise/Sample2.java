package org.excersise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
//	    System.out.println(login.getCssValue("font-size"));
	    
	    //how to enhance and highlight a webelement
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].setAttribute('style','font-size:50px;color:red;background-color:yellow')", login);
	   
		
	
		
		

}
}