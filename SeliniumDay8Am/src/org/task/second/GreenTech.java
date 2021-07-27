package org.task.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class GreenTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", 
		"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/search?q=greentechnology&oq=green&aqs=chrome.0.69i59l2j69i57j69i59j0i271l2j69i60l2.2392j0j7&sourceid=chrome&ie=UTF-8");
	}
	

}
