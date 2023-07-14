package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EriBankPage {

	By userName = By.xpath("//*[@text='Username']");
	By password = By.xpath("//*[@text='Password']");
	By loginButton = By.xpath("//*[@text='Login']");
	public  WebDriver driver;
	
	
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
}
