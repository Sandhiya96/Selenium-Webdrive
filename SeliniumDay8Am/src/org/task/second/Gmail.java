package org.task.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\IEDriverServer.exe");		
	        WebDriver driver=new InternetExplorerDriver();
	        driver.get("https://www.google.com/search?q=gmil&oq=&aqs=chrome.0.69i59i450l8.74200j0j7&sourceid=chrome&ie=UTF-8");
	
	}
}
