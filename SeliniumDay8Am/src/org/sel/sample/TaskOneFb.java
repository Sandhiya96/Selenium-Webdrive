package org.sel.sample;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOneFb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231346502318%7Ce%7Cfacebook%7C&placement=&creative=231346502318&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIgrzVvKPI7wIVFSQrCh0kCwXnEAAYASAAEgK7yvD_BwE");
		
		
	}

}
