package com.ddfw.punj.testcases;

import java.util.concurrent.TimeUnit;

//import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ddfw.punj.base.BaseTest;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.model.Log;
import java.net.URL;
public class TestCaseA extends BaseTest {

	public WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	

	 //public static final String USERNAME = "sel67";
	  //public static final String AUTOMATE_KEY = "7YqmcexiSNqJjLzEmJm3";
	  //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	DesiredCapabilities caps = new DesiredCapabilities();
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
//		BaseTest.test = BaseTest.rep.startTest("Browser is "+browser);
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
			Thread.sleep(2000);
			test = rep.startTest("firefox");
			
		//create firefox instance
			//System.setProperty("webdriver.gecko.driver", "C:\\Web_Drivers\\geckodriver.exe");
			//driver = new FirefoxDriver();
			
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "8");
			caps.setCapability("browser", "Firefox");
			caps.setCapability("browser_version", "60.0");
			caps.setCapability("browserstack.local", "false");
			caps.setCapability("browserstack.selenium_version", "3.5.2");
			caps.setCapability("browserstack.debug", "true");
			driver = new RemoteWebDriver(
				    new URL("https://sel67:7YqmcexiSNqJjLzEmJm3@hub-cloud.browserstack.com/wd/hub"),
				    DesiredCapabilities.firefox()
				  );
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			Thread.sleep(1000);
			//set path to chromedriver.exe
			test = rep.startTest("chrome");
			//System.setProperty("webdriver.chrome.driver","C:\\Web_Drivers\\chromedriver.exe");
			//create chrome instance
			
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "7");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "65.0");
			caps.setCapability("browserstack.local", "false");
			caps.setCapability("browserstack.selenium_version", "3.5.2");
			caps.setCapability("browserstack.debug", "true");

			driver = new RemoteWebDriver(
				    new URL("https://sel67:7YqmcexiSNqJjLzEmJm3@hub-cloud.browserstack.com/wd/hub"),
				    DesiredCapabilities.chrome()
				  );
			//driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					Thread.sleep(3000);
					test = rep.startTest("Edge");
					//set path to Edge.exe
					//System.setProperty("webdriver.edge.driver","C:\\Web_Drivers\\MicrosoftWebDriver.exe");
					//create Edge instance
					//driver = new EdgeDriver();
					caps.setCapability("os", "Windows");
					caps.setCapability("os_version", "10");
					caps.setCapability("browser", "Edge");
					caps.setCapability("browser_version", "16.0");
					caps.setCapability("browserstack.local", "false");
					caps.setCapability("browserstack.selenium_version", "3.5.2");
					caps.setCapability("browserstack.debug", "true");
					

					driver = new RemoteWebDriver(
						    new URL("https://sel67:7YqmcexiSNqJjLzEmJm3@hub-cloud.browserstack.com/wd/hub"),
						    DesiredCapabilities.edge()
						  );
					
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void test1() throws InterruptedException{
		//test = rep.startTest("Test1");
		Thread.sleep(4000);
		Thread.sleep(4000);
		driver.get("http://demo.guru99.com/V4/");
		//Find user name
	    //takeScreenShot();
		
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test2() throws InterruptedException{
		//BaseTest.test = BaseTest.rep.startTest("Test1");
		Thread.sleep(4000);
		driver.get("http://gmail.com");
		//Find user name
		//WebElement userName = driver.findElement(By.xpath("//*[@id='identifierId']"));
		//Fill user name
		Thread.sleep(4000);
		//userName.sendKeys("guru99");
		//Find password
		Thread.sleep(4000);
		//WebElement password = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		//Fill password
		//password.click();
		//takeScreenShot();
		test.log(LogStatus.PASS, "Passed");
	}

	@Test
	public void test3() throws InterruptedException{
		//BaseTest.test = BaseTest.rep.startTest("TestCase2");
		Thread.sleep(4000);
		driver.get("http://rediff.com");
		//Find user name
	//	takeScreenShot();
		test.log(LogStatus.PASS, "Passed");
	}
	
	@Test
	public void test4() throws InterruptedException{
		//BaseTest.test = BaseTest.rep.startTest("TestCase3");
		Thread.sleep(4000);
		driver.get("http://google.com");
		//Find user name
		takeScreenShot(driver);
		test.log(LogStatus.PASS, "Passed");
	}

	@AfterTest
	public void terminate()
	{
		driver.quit();
	}
	
	
	@AfterSuite
	public void extentquit() {
		rep.endTest(test);
		rep.flush();
		// this.rep.close();
	}
	
}

