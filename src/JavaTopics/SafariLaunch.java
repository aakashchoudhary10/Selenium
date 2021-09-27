package JavaTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {
		
		//First You need to add safaridriver extension into your safari browser
		//You must enable "Allow Remote Automation" under safari develop menu.
		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
