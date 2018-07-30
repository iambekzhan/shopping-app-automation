package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		String browser = Config.getValue("browserType").toLowerCase();
		
		if(driver != null) {
			return driver;
		}
//		System.setProperty("webdriver.chrome.driver", "/Users/iambekzhan/Documents/Selenium/Drivers/chromedriver");

		switch(browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
		}
//		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		// getting the value of implicitlyWait from Configuration.properties and convert it to int,
				// then giving the certain time to implicitlyWait
				String time = Config.getValue("implicitWait");
				driver.manage().timeouts().implicitlyWait(Integer.valueOf(time), TimeUnit.SECONDS);
				
		return driver;
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
