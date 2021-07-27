package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubt2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement acc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	if (acc.isDisplayed()) {
		System.out.println("displayed");
		if (acc.isEnabled()) {
			acc.click();
			System.out.println("button is enabled");
			Thread.sleep(3000);
			WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			female.click();
			if (female.isSelected()) {
				System.out.println("female button is selected");
			} else {
               System.out.println("female button is not selected");
			}
		} else {
            System.out.println("not enable");
		}
	}
	else {
		System.out.println("not displayed");
	}
	

}


}
