package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/ \r\n" + "");
	    driver.findElement(By.xpath("(//span[@class='catText'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='sub-cat-name selected']")).click();
		
	}

}
