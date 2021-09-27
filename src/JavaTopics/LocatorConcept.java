 package JavaTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//aakashchoudhary//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating object of chromedriver and passing to WebDriver interface
		driver.get("https://qa-login.cengage.com"); //Launch URL
		driver.manage().window().maximize(); // Manage Browser Window(Maximize)
		
		//1. Xpath -- 2 (Don't use absolute xpath, Use only relative xpath)
		
		  driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys(
		  "mt_inst_101@swlearning.com");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("A123456");
		  driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		  
		  Select select = new Select(driver.findElement(By.id("productISBN")));
		  select.selectByValue("9781285421230");
		
		//2. Id --1
		//driver.findElement(By.id("emailId")).sendKeys("mt_inst_101@swlearning.com");
		
		//3. name --3 
		//driver.findElement(By.name("email")).sendKeys("mt_inst_101@swlearning.com");
		
		//4. linkText : This is only for links
		//driver.findElement(By.linkText("Tech Support")).click();
		
		//5. ParitalLinkText : Not Useful
		//driver.findElement(By.partialLinkText("Support")).click();
		
		//6. CSSSlector --2
		//driver.findElement(By.cssSelector("#emailId")).sendKeys("mt_inst_101@swlearning.com");
		
		//7. className: --4 Not Useful
		//driver.findElement(By.className("")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
