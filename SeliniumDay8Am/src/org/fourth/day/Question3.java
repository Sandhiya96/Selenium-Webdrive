package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
          WebElement txtName = driver.findElement
        		  (By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
	
		System.out.println(txtName.getText());
	}

}
