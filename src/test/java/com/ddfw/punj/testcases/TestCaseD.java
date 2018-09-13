package com.ddfw.punj.testcases;

import java.util.concurrent.TimeUnit;

//import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ddfw.punj.base.BaseTest;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.model.Log;

public class TestCaseD extends BaseTest {


	@BeforeTest
	public void launch()
	{
//		test = rep.startTest("Browser is FireFox");
			System.setProperty("webdriver.gecko.driver", "C:\\Web_Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
		
	@Test
	public void test1() throws InterruptedException{
		test = rep.startTest("Test20");
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
	    takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test2() throws InterruptedException{
		test = rep.startTest("Test21");
		Thread.sleep(2000);
		driver.get("http://gmail.com");
		//Find user name
		WebElement userName = driver.findElement(By.xpath("//*[@id='identifierId']"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		//Fill password
		Thread.sleep(2000);
		password.click();
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	@Test
	public void test3() throws InterruptedException{
		test = rep.startTest("Test22");
		Thread.sleep(2000);
		driver.get("http://rediff.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test4() throws InterruptedException{
		test = rep.startTest("Test24");
		Thread.sleep(2000);
		driver.get("http://google.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	
	
	@AfterTest
	public void extentquit() {
		rep.endTest(test);
		rep.flush();
		// this.rep.close();
	}
}

