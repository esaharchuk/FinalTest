package by.htp.lsn.FinalTask.driver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton {
	private static WebDriver driver;

	private static final Logger logger = LogManager.getRootLogger();
	private static final String CHROMEDRIVER = "webdriver.chrome.driver";
	private static final String CHROMDRIVER_PATH = "C://drivers/chromedriver.exe";

	private Singleton() {

	};

	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty(CHROMEDRIVER, CHROMDRIVER_PATH);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			logger.info("Browser started");
		}

		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}