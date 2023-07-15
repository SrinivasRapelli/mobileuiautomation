package com.swag.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {
 public 	static DesiredCapabilities  capabilities;
	public static WebDriver driver;
	
   @BeforeSuite
	public  void launchApp() throws MalformedURLException {
			
			capabilities = new DesiredCapabilities();
		   	capabilities.setCapability ("deviceName", "emulator-5554");
			capabilities.setCapability ("platformName", "Android") ;
			capabilities.setCapability ("platformVersion","13");
			capabilities.setCapability ("appPackage", "com.swaglabsmobileapp") ;
			capabilities.setCapability ("appActivity", "com.swaglabsmobileapp.MainActivity") ;
			capabilities.setCapability ("automationName", "uiautomator2");
			capabilities.setCapability ("skipUnlock",	"true");
			capabilities.setCapability ("noReset","true");
			capabilities.setCapability ("senserInstrument", true);
			driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"),	capabilities);
					
	}
	
	//@BeforeSuite
	public  void launchAjioApp() throws MalformedURLException {
		
		capabilities = new DesiredCapabilities();
	   	capabilities.setCapability ("deviceName", "emulator-5554");
		capabilities.setCapability ("platformName", "Android") ;
		capabilities.setCapability ("platformVersion","13");
		capabilities.setCapability ("appPackage", "com.ril.ajio") ;
		capabilities.setCapability ("appActivity", "com.ril.ajio.launch.activity.SplashScreenActivity") ;
		capabilities.setCapability ("automationName", "uiautomator2");
		capabilities.setCapability ("skipUnlock",	"true");
		capabilities.setCapability ("noReTet","true");
		capabilities.setCapability ("senserInstrument", true);
		driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"),	capabilities);
				
}
	
	//@BeforeSuite
	public void launchEriBank() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("plaformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
		capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("skipUnlock", "true");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("senerInstrument", true);
		driver= new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	//@BeforeSuite
	public void launchFlipkartMedicineApp() throws MalformedURLException {
		
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("appPackage", "com.mhbl.sastasundar");
		capabilities.setCapability("appActivity", "com.mhbl.sastasundar.MainActivity");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("skipUnlock", "true");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("senerInstrument", true);
		driver= new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	
	
	
	
	
	
	
}
