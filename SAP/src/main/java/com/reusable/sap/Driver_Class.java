package com.reusable.sap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver_Class extends Constant{
	
	public Driver_Class() {
		super();
		}

		public static WebDriver driver;
		
		public static WebDriver getdriver(String browserName)
		{
		if("chrome".equalsIgnoreCase(Constant.BROWSER_NAME)) {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			System.setProperty("webdriver.chrome.driver", Constant.ChromeDriver);
			driver = new ChromeDriver(options);
			//return driver;

			}
		else {

			throw new WebDriverException("Please provide the proper browser name");

			}
driver.get(Constant.URL);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
		}
		
		

}
