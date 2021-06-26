package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class base {

	public static WebDriver driver;

	@Before
	public static WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream inputStream = new FileInputStream(
				"/Users/ganesan/eclipse-workspace/ProjectDemo/src/main/java/config.properties");
		prop.load(inputStream);
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {

			setChromeDriverProperty();
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	@After
	public static void closeBrowser() {
		driver.quit();
	}

	private static void setChromeDriverProperty() {
		System.setProperty("webdriver.chrome.driver", "//Users//ganesan//Downloads//chromedriver");
	}

}
