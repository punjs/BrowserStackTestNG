package com.ddfw.punj.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ddfw.punj.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCaseC extends BaseTest {

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	@BeforeTest
	public void launch()
	{
		//test = rep.startTest("Browser is Chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Web_Drivers\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() throws InterruptedException{
		test = rep.startTest("Test12");
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
	    takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test2() throws InterruptedException{
		test = rep.startTest("Test9");
		Thread.sleep(2000);
		driver.get("http://gmail.com");
		//Find user name
		WebElement userName = driver.findElement(By.xpath("//*[@id='identifierId']"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		Thread.sleep(2000);
		//Fill password
		password.click();
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	@Test
	public void test3() throws InterruptedException{
		test = rep.startTest("Test10");
		Thread.sleep(2000);
		driver.get("http://rediff.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test4() throws InterruptedException{
		test = rep.startTest("Test11");
		Thread.sleep(2000);
		driver.get("http://google.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	
	
	@AfterSuite
	public void extentquit() {
		rep.endTest(test);
		rep.flush();
		// this.rep.close();
	}

}
