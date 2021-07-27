package org.third.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		
	}


}
