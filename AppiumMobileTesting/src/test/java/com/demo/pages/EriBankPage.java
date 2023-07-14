package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EriBankPage {
	public  WebDriver driver;
	By userName = By.xpath("//*[@text='Username']");
	By password = By.xpath("//*[@text='Password']");
	By loginButton = By.xpath("//*[@text='Login']");
	
	By makePaymentButton = By.id("com.experitest.ExperiBank:id/makePaymentButton");
	By phoneTextField = By.id("com.experitest.ExperiBank:id/phoneTextField");
	By nameTextField = By.id("com.experitest.ExperiBank:id/nameTextField");
	By amountTextField = By.id("com.experitest.ExperiBank:id/amountTextField");
	By countryButton = By.id("com.experitest.ExperiBank:id/countryButton");
	By countyName = By.xpath("//*[@text='USA']");
	By sendPaymentButton = By.id("com.experitest.ExperiBank:id/sendPaymentButton");
	By yesButton = By.id("android:id/button1");
	By balanceMsg = By.xpath("//*[contains(@text,'Your balance is:')]");
	
	public  EriBankPage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterUserName() {
		driver.findElement(userName).sendKeys("company");	
	}
	public void enterPassword() {
		driver.findElement(password).sendKeys("company");
	}
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void clickOnMakePayment() {
		driver.findElement(makePaymentButton).click();
	}
	public void enterPhone() {
		driver.findElement(phoneTextField).sendKeys("1234567890");
	}

	public void enterName() {

		driver.findElement(nameTextField).sendKeys("Srinivas");
	}

	public void enterAmount() {
		driver.findElement(amountTextField).sendKeys("10000");
	}

	public void clickOnCountryButton() {
		driver.findElement(countryButton).click();
	}

	public void clickOnCountry() {
		driver.findElement(countyName).click();
	}

	public void clickOnSendPayment() {
		driver.findElement(sendPaymentButton).click();
	}

	public void clickOnYes() throws InterruptedException {
		driver.findElement(yesButton).click();
	}
    public void verifyBalance() {
    	String balance =driver.findElement(balanceMsg).getText();
    	Assert.assertTrue(balance.contains("Your balance is:"));
    	System.out.println(balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
