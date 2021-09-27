package JavaTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//aakashchoudhary//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Creating object of chromedriver and passing to WebDriver interface
		driver.manage().window().maximize(); // Manage Browser Window(Maximize)
		driver.manage().deleteAllCookies(); //Delete All Cookies
		driver.get("http://mindtap-qa.cengage.com/nb/service/launch?token=94DDC7F3C77EF173A37E94172873E93CD9D1FD38DB20D9A9FF4FEDC1ECB6153E9BB8AD88DFD7A4357F6B41819FDD6A9354782C6371E3A6B87B74BF39998B6F732EC9C0418B180BE0&pid=483129&eISBN=9781285778976&ILRN_CODE=bun_daftum09_mt&courseKey=MTPPRBFPZ0W4&titleIsbn=9781285421230"); //Launch URL
		//driver.manage().window().maximize(); // Manage Browser Window(Maximize)
		//driver.manage().deleteAllCookies(); //Delete All Cookies

		//driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@id='resizable']/div[3]")), 100, 0).build().perform();

		/*	
		 * Thread.sleep(12000); driver.findElement(By.xpath(
		 * "//img[@src='https://siteintercept.qualtrics.com/WRSiteInterceptEngine/../WRQualtricsShared/Graphics/siteintercept/bwc_close.png']"
		 * )).click();
		 * driver.findElement(By.xpath("//button[@id='outlineViewPane']")).click();
		 * Thread.sleep(5000); System.out.println("About to Click on Edit Button");
		 * driver.findElement(By.xpath(
		 * "//span[text()='Edit']//..//div[@class='react-toggle-track']")).click();
		 * System.out.println("Click on Edit Button"); Thread.sleep(5000);
		 * driver.findElement(By.
		 * xpath("//div[text()='Part 3: ']//ancestor::div[@role='heading']//preceding-sibling::label//span[@class='display-checkbox']"
		 * )).click();
		 */

	}

}
