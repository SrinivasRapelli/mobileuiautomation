package com.demo.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SwagLabsPage {

	public WebDriver driver;

	public SwagLabsPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]");
	By password = By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");
	By loginbutton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");

	By name=By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])");
	By price=	By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])");
	By name1=By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])");
	By price1=	By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])");
	
    By add = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]");
    By remove = By.xpath("//*[@text='REMOVE']");
    By cart = By.xpath("//*[@content-desc=\"test-Cart\"]");
    By itemMsg = By.xpath("//*[@text='Sauce Labs Bolt T-Shirt']");
    
	
	
	
	
	public void enterUsername() {
        driver.findElement(username).sendKeys("standard_user");;
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys("secret_sauce");;
	}

	public void clickOnLoginButton() {
		driver.findElement(loginbutton).click();
	}
	
	

	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	public void scrollDown() {
		Dimension screenSize = driver.manage().window().getSize();

		// Define the start and end coordinates for the swipe action
		int startX = screenSize.getWidth() / 2;
		int startY = (int) (screenSize.getHeight() * 0.8);
		int endX = startX;
		int endY = (int) (screenSize.getHeight() * 0.2);

		// Perform the swipe action
		TouchAction touchAction = new TouchAction((PerformsTouchActions)driver);
		touchAction.press(PointOption.point(startX, startY))
		        .waitAction()
		        .moveTo(PointOption.point(endX, endY))
		        .release()
		        .perform();
			
	}
	
	
	
	public void printNamesandPricesOfTheProducts() throws InterruptedException {
		 
		List<WebElement> namesOfTheProduct= driver.findElements(name);
		List<WebElement> pricesOfTheProduct =driver.findElements(price);
		
		
			
			for (int i = 0; i <= 1; i++) {
				System.out.println(namesOfTheProduct.get(i).getText());
			}
			
			for (int j = 0; j<= 1; j++) {
				System.out.println(pricesOfTheProduct.get(j).getText());
			}
			
		Thread.sleep(3000);
		scrollDown();
		
		List<WebElement> namesOfTheProduct1= driver.findElements(name);
		List<WebElement> pricesOfTheProduct1 =driver.findElements(price);
		
		Thread.sleep(3000);
		
		for (int k = 0; k <= 1; k++) {
			System.out.println(namesOfTheProduct1.get(k).getText());
		}
		
		for (int l = 0; l<= 1; l++) {
			System.out.println(pricesOfTheProduct1.get(l).getText());
		}
		
		Thread.sleep(3000);
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	public void clickOnAddToCart() {
		driver.findElement(add).click();
	}
	
	public void verifyRemoveMsg() {
		String removeMsg = driver.findElement(remove).getText();
		System.out.println(removeMsg);
		Assert.assertEquals(removeMsg, "REMOVE");
	}
	
	public void clickOnCart() {
		driver.findElement(cart).click();
	}
	
	public void verifyTheItemAddedToTheCart() {
		String msg = driver.findElement(itemMsg).getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Sauce Labs Bolt T-Shirt");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
