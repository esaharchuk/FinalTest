package by.htp.lsn.FinalTask.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.lsn.FinalTask.steps.Steps;

public class OrdersButtonTest {
	
	private Steps st = new Steps();
	private WebDriver driver;
	
	
	@Test
	public void OrdersButtonTest() throws InterruptedException{
		st.logInLibrary("test1", "1234");
		st.order();
		st.orderAdd();
		Assert.assertEquals("Add new order", "Add new order");
		st.orderList();
		Assert.assertEquals("Order list", "Order list");
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
