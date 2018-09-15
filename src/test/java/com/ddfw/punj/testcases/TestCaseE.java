package com.ddfw.punj.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCaseE {

  public static final String USERNAME = "sel67";
  public static final String AUTOMATE_KEY = "7YqmcexiSNqJjLzEmJm3";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("os", "Windows");
	  caps.setCapability("os_version", "10");
	  caps.setCapability("browser", "Firefox");
	  caps.setCapability("browser_version", "60.0");
	  caps.setCapability("browserstack.local", "false");
	  caps.setCapability("browserstack.selenium_version", "3.12.0");
	  //caps.setCapability("browserstack.geckodriver", "0.18.0");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
	  
	    element.click();
	    WebElement element1 =driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
	    element1.click();

	    //element.sendKeys("Sandeep Punj");
	    //WebElement element1 = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
	    //element1.click();

	    System.out.println(driver.getTitle());
	    driver.quit();
	  
	    }
  
}