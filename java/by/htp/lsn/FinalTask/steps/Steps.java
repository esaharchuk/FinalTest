package by.htp.lsn.FinalTask.steps;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import by.htp.lsn.FinalTask.driver.Singleton;
import by.htp.lsn.FinalTask.main.LoginPage;

public class Steps {

	private WebDriver driver;

	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser() {
		driver = Singleton.getDriver();
	}

	public void closeDriver() {
		Singleton.closeDriver();
	}

	public void logInLibrary(String username, String password) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		Thread.sleep(4000);
		loginPage.logIn(username, password);
		logger.info("User page is opened");
	}

	public void order() throws InterruptedException {
		Thread.sleep(4000);
		WebElement order = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a"));
		order.click();
	}

	public void orderAdd() throws InterruptedException {
		Thread.sleep(4000);
		WebElement orderAdd = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/ul/li[2]/a"));
		orderAdd.click();
	}

	public void orderList() throws InterruptedException {
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/ul/li[1]/a"));
		profile.click();
	}
	
	public String header() throws InterruptedException {
		Thread.sleep(4000);
		WebElement header = driver.findElement(By.xpath("//*[@id=\"page-right-content\"]/div[1]/div[1]/div/h4"));
		String str = header.getText();
		return str;
	}
	
	public void bookTitle() throws InterruptedException {
		Thread.sleep(4000);
		WebElement bookTitle = driver.findElement(By.xpath("//*[@id=\"select2-selectBook-container\"]"));
		bookTitle.click();
		//Select selector = new Select(driver.findElement((By.xpath("//*[@id=\"select2-selectBook-container\"]"))));
	
	}

}
