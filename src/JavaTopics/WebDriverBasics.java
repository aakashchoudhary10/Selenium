package JavaTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// 1. FF Browser
		// Geckodriver (This Class is selenium, We need to create object of it)


		System.setProperty("webdriver.gecko.driver","C://Users//aakashchoudhary//Downloads//geckodriver-v0.26.0-win64//geckodriver.exe"); 
		WebDriver driverff = new FirefoxDriver(); //Launch FF
		driverff.get("https://www.google.com/"); //Launch Google URL


				// 1. Chrome Browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\aakashchoudhary\\eclipse-workspace\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); // Creating object of chromedriver and passing to WebDriver interface
				driver.get("https://www.google.com/"); // Launch URL
				driver.manage().window().maximize(); // Manage Browser Window(Maximize)

				String ActualTabTitle = driver.getTitle(); // get Title
				System.out.println(ActualTabTitle); // Print Title

				// Validation Point:
				if (ActualTabTitle.equals("Google")) {
					System.out.println("Correct Title");
				} else {
					System.out.println("In-correct Title");
				}

				System.out.println(driver.getCurrentUrl()); // To get current browser URL
				// System.out.println(driverchrome.getPageSource()); // To get page source HTML
				// code

				driver.quit(); // To quit browser

	}

}
