package by.htp.lsn.FinalTask.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.lsn.FinalTask.steps.Steps;

public class AddNewOrderTest {
	
	private Steps st = new Steps();
	private WebDriver driver;
	
	@Test
	public void UserPageTest() throws InterruptedException {
		st.logInLibrary("test1", "1234");
		st.order();
		st.orderAdd();
		st.bookTitle();
	}
	@BeforeClass
	public void beforeTest() {
		st.initBrowser();
	}
	
	@AfterClass
	public void afterTest() {
		st.closeDriver();
	}
	

}