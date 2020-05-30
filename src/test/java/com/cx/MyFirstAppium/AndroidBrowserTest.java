package com.cx.MyFirstAppium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidBrowserTest {
	public WebDriver driver;

	String kobitonServerUrl = "https://svatitech:84b66fb4-d842-4faf-958d-66bd97a3118b@api.kobiton.com/wd/hub";
	String deviceName = "Galaxy A20";
	String platformVersion = "9";
	String platformName = "Adroid";
/*	
	String kobitonServerUrl = "https://svatitech:84b66fb4-d842-4faf-958d-66bd97a3118b@api.kobiton.com/wd/hub";
	capabilities.setCapability("deviceName", "Galaxy A10e");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("platformName", "Android");
*/
	
	@BeforeMethod
	public void setUp() throws Exception {
/*		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("platformName", platformName);
		driver = new AndroidDriver<WebElement>(new URL(kobitonServerUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("Device Connected");
*/
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "Galaxy A20");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		
		driver = new AndroidDriver<WebElement>(new URL(kobitonServerUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("Device Connected");

	}
	
	@Test
	public void testcase01() throws Exception {
		System.out.println("Browser Opened");
		driver.get("http://107.170.213.234/catalog/index.php");
		System.out.println("Navigated the URL");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		
		driver.quit();
		System.out.println("closed");
	}
}
