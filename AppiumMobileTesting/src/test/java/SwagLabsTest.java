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

	@Test(priority = 1)
	public void getProductNamesAndPrices() throws InterruptedException {
		 Thread.sleep(5000);
		 swageLabs.printNamesandPricesOfTheProducts();
		 
		/*
		 * List<WebElement> names =
		 * driver.findElements(By.xpath("//*[@content-desc=\"test-Item title\"][1]"));
		 * List<WebElement> prices =
		 * driver.findElements(By.xpath("//*[@content-desc=\"test-Price\"]"));
		 * 
		 * for (WebElement webElement : names) {
		 * System.out.println(webElement.getText()); }
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(prices.get(i).getText());
		 * scrollDown();
		 * 
		 * }
		 */

	}

   @Test(priority = 2)
	public void addToCart() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   swageLabs.clickOnAddToCart();
	   Thread.sleep(2000);
	   swageLabs.verifyRemoveMsg();
	   Thread.sleep(3000);
	   swageLabs.clickOnCart();
	   Thread.sleep(3000);
	   swageLabs.verifyTheItemAddedToTheCart();
	   Thread.sleep(3000);
	  

		/*
		 * driver.findElement(By.xpath("//*[@content-desc=\"test-ADD TO CART\"][1]")).
		 * click(); Thread.sleep(2000); String remove =
		 * driver.findElement(By.xpath("//*[@content-desc=\"test-REMOVE\"]")).
		 * getAttribute("text"); System.out.println(remove); //
		 * Assert.assertEquals(remove, "REMOVE");
		 * driver.findElement(By.xpath("//*[@content-desc=\"test-Cart\"]")).click();
		 * Thread.sleep(3000); String item = driver.findElement(By.xpath(
		 * "//*[@content-desc=\"test-Description\"]/android.widget.TextView[1]")).
		 * getText(); System.out.println(item); Assert.assertEquals(item,
		 * "Sauce Labs Backpack");
		 */
		
		
	}
	
	//@Test(priority = 1)
	public void addMultipleItemsToCart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@content-desc=\"test-Toggle\"]")).click();
		Thread.sleep(3000);
		List<WebElement> multipleItems = driver.findElements(By.xpath("//*[@content-desc=\"test-ADD TO CART\"]"));
		
		for (int i =0; i<multipleItems.size();i++) {
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
