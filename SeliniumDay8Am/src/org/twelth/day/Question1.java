package org.twelth.day;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtAdds = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		System.out.println(txtAdds.getText());
		js.executeScript("arguments[0].scrollIntoView(true)", txtAdds);
		
		
	}

}
