package JavaTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aakashchoudhary\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating object of chromedriver and passing to WebDriver interface
		driver.get("https://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/"); //Launch URL
		driver.manage().window().maximize(); // Manage Browser Window(Maximize)
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Test Pages"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("JavaScript Alert,Confirm,Prompt Boxes")).click();

	}

}
