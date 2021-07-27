package org.task.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumHtml {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", 
		"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    

  }
}
