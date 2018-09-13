package com.ddfw.punj.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ddfw.punj.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCaseB extends BaseTest {

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	
	
	
	
	
	@BeforeTest
	public void launch()
	{
		test = rep.startTest("Browser is Edge");
		
					System.setProperty("webdriver.edge.driver","C:\\Web_Drivers\\MicrosoftWebDriver.exe");
	
					driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() throws InterruptedException{
		test = rep.startTest("TestCase8");
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
	    takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test2() throws InterruptedException{
		test = rep.startTest("TestCase4");
		Thread.sleep(2000);
		driver.get("http://gmail.com");
		//Find user name
		WebElement userName = driver.findElement(By.xpath("//*[@id='identifierId']"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		WebElement password = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		Thread.sleep(2000);
		//Fill password
		password.click();
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	@Test
	public void test3() throws InterruptedException{
		test = rep.startTest("Test5");
		Thread.sleep(2000);
		driver.get("http://rediff.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test4() throws InterruptedException{
		test = rep.startTest("TestCase7");
		Thread.sleep(2000);
		driver.get("http://google.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	
	
	//@AfterTest
	//public void extentquit() {
		//rep.endTest(test);
		//rep.flush();
		// this.rep.close();
	//}

}
