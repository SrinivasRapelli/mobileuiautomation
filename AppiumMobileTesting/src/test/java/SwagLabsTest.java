import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.pages.SwagLabsPage;
import com.swag.pages.BasePage;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends BasePage {

	SwagLabsPage swageLabs;
	@Test(priority = 0)
	public void loginTest() throws InterruptedException {

		swageLabs = new SwagLabsPage(driver);
		
		Thread.sleep(3000);
		swageLabs.enterUsername();
		swageLabs.enterPassword();
		swageLabs.clickOnLoginButton();
		 Thread.sleep(5000);
		/*
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys(
		 * "standard_user"); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys(
		 * "secret_sauce"); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
		 * Thread.sleep(5000);
		 */
	}
	

	public static void scrollDown() {
		try {
			int startY = 500;
			int endY = 400;
			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
			PointOption pointStart = PointOption.point(50, startY);
			PointOption pointEnd = PointOption.point(50, endY);
			WaitOptions waitOption = WaitOptions.waitOptions(Duration.ofMillis(500));
			touchAction.press(pointStart).waitAction(waitOption).moveTo(pointEnd).release().perform();
		} catch (Exception e) {

		}
	}
	public void scrollDown1() {
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
	

	@Test(priority = 1)
	public void getProductNamesAndPrices() throws InterruptedException {
		 Thread.sleep(5000);
		 swageLabs.printNamesandPricesOfTheProducts();
		  Thread.sleep(3000);
	}

   @Test(priority = 2)
	public void addToCart() throws InterruptedException {
	   swageLabs.clickOnAddToCart();
	   Thread.sleep(2000);
	   swageLabs.verifyRemoveMsg();
	   Thread.sleep(3000);
	   swageLabs.clickOnCart();
	   Thread.sleep(3000);
	   swageLabs.verifyTheItemAddedToTheCart();
	   Thread.sleep(3000);
	   swageLabs.clickOnCheckOutbutton();
	   Thread.sleep(3000);
	   swageLabs.enterFirstName();
	   swageLabs.enterLastName();
	   swageLabs.enterPinCode();
	   scrollDown();
	   swageLabs.clickOnContinueButton();
	   Thread.sleep(3000);
	   swageLabs.checkThePrice();
	   scrollDown1();
	   swageLabs.clickOnFinshButton();
	   Thread.sleep(3000);
	   swageLabs.checkthankYouMsg();
	   swageLabs.clickOnBackToHomeButton();
	   Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public void addMultipleItemsToCart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@content-desc=\"test-Toggle\"]")).click();
		Thread.sleep(3000);
		List<WebElement> multipleItems = driver.findElements(By.xpath("//*[@content-desc=\"test-ADD TO CART\"]"));
		
		for (int i =0; i<multipleItems.size(); i++) {
			multipleItems.get(i).click();
			
			Thread.sleep(2000);
			System.out.println(i + " item clicked");
		}
		driver.findElement(By.xpath("//*[@content-desc=\"test-Cart\"]")).click();
		Thread.sleep(3000);
		
		List<WebElement> names = driver.findElements(By.xpath("//*[@content-desc=\"test-Description\"]"));
		
		for (WebElement name : names) {
			Thread.sleep(2000);
			System.out.println(name.getText());
		}
		
	}

}
