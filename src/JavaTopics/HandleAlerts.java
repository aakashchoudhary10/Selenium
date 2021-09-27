package JavaTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//aakashchoudhary//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating object of chromedriver and passing to WebDriver interface
		driver.get("https://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/"); //Launch URL
		driver.manage().window().maximize(); // Manage Browser Window(Maximize)
		
		/*
		 * driver.findElement(By.xpath("//button[@id='alert']")).click(); //Click the
		 * button to display an alert box: Thread.sleep(2000);
		 * System.out.println(alert.getText()); Thread.sleep(2000); alert.accept();
		 */
		  
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@id='confirm']")).click(); //Click the
		 * button to display a confirm box: Thread.sleep(2000);
		 * System.out.println(alert.getText()); //Get the text for displayed alert
		 * alert.accept(); //Click on Ok of the confirmation box
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@id='confirm']")).click(); //Click the
		 * button to display a confirm box: Thread.sleep(2000); alert.dismiss();
		 */		 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='prompt']")).click(); //Click the button to display a confirm box:
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//driver.switchTo().alert().sendKeys("");
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Aakash Testing");
		Thread.sleep(5000);
		alert.accept();
	}

}
