package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EriBankPage {
	public  WebDriver driver;
	
	
	public  EriBankPage(WebDriver driver) {
		this.driver = driver;
	}
	By userName = By.xpath("//*[@text='Username']");
	By password = By.xpath("//*[@text='Password']");
	By loginButton = By.xpath("//*[@text='Login']");
	By logoutButton = By.id("com.experitest.ExperiBank:id/logoutButton");
	
	By makePaymentButton = By.id("com.experitest.ExperiBank:id/makePaymentButton");
	By phoneTextField = By.id("com.experitest.ExperiBank:id/phoneTextField");
	By nameTextField = By.id("com.experitest.ExperiBank:id/nameTextField");
	By amountTextField = By.id("com.experitest.ExperiBank:id/amountTextField");
	By countryButton = By.id("com.experitest.ExperiBank:id/countryButton");
	By countyName = By.xpath("//*[@text='USA']");
	By sendPaymentButton = By.id("com.experitest.ExperiBank:id/sendPaymentButton");
	By yesButton = By.id("android:id/button1");
	By balanceMsg = By.xpath("//*[contains(@text,'Your balance is:')]");
	
	
	By mortagebutton = By.id("com.experitest.ExperiBank:id/mortageRequestButton");
	By firstName = By.id("com.experitest.ExperiBank:id/nameTextField");
	By lastName= By.id("com.experitest.ExperiBank:id/lastNameTextField");
	By age = By.id("com.experitest.ExperiBank:id/ageTextField");
	By add1 = By.id("com.experitest.ExperiBank:id/addressOneTextField");
	By add2 = By.id("com.experitest.ExperiBank:id/addressTwoTextField");
	By countryButton1 = By.id("com.experitest.ExperiBank:id/countryButton");
	By countryName1 = By.xpath("//*[@text='India']");
	By nextButton = By.id("com.experitest.ExperiBank:id/nextButton");
	By car = By.xpath("//*[@text='Car']");
	By noOfYears = By.xpath("//*[@text='2']");
	By jobType = By.xpath("//*[@text='Private Job']");
	By price =By.xpath("//*[@text='10,00,000']");
	By saveButton = By.xpath("//*[@text='Save']");
			
	
	
	
	
	
	public void enterUserName() {
		driver.findElement(userName).sendKeys("company");	
	}
	public void enterPassword() {
		driver.findElement(password).sendKeys("company");
	}
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	//======================================================
	
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
    
    public void clickOnLogoutButton() {
    	driver.findElement(logoutButton).click();
    }
    
    //=====================================================
    
    
	public void clickOnMortageButton() {
		driver.findElement(mortagebutton).click();
	}

	public void enterFirstName() {

		driver.findElement(firstName).sendKeys("Srinivas");
	}

	public void enterLastName() {

		driver.findElement(lastName).sendKeys("Rapelli");
		
	}

	public void enterAge() {
		driver.findElement(age).sendKeys("23");

	}

	public void enterAddress1() {

		driver.findElement(add1).sendKeys("hyderabad");
	}

	public void enterAddress2() {

		driver.findElement(add2).sendKeys("Telangana");
		}

	public void clickOnCountryButton1() {

		driver.findElement(countryButton1).click();
	}

	public void clickOnCountry1() {

		driver.findElement(countryName1).click();;
	}
	public void clickOnNextButton() {

		driver.findElement(nextButton).click();;
	}
	public void clickOnCar() {

		driver.findElement(car).click();
	}
	public void clickOnNumberOfYears() {

		driver.findElement(noOfYears).click();
	}
	public void clickOnPrivateJob() {

		driver.findElement(jobType).click();
	}
	public void clickOnPrice() {
		driver.findElement(price).click();
	}
	public void clickOnSave() {
		driver.findElement(saveButton).click();
	}
	
	
	
	
	
	
	
}
