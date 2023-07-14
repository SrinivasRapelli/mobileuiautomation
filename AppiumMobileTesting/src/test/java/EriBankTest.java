import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pages.EriBankPage;
import com.swag.pages.BasePage;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class EriBankTest extends BasePage{

	public EriBankPage eriBank; 
	
	@Test(priority = 0)
	public void loginToEriBank() throws InterruptedException {
		
		eriBank = new EriBankPage(driver);
		
		Thread.sleep(5000);
		eriBank.enterUserName();
		eriBank.enterPassword();
		eriBank.clickOnLoginButton();
		
			/*
			 * driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).
			 * sendKeys("company");
			 * driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).
			 * sendKeys("company");
			 * driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click()
			 * ;
			 */
		 
       Thread.sleep(5000);
      // driver.findElement(By.id("android:id/autofill_save_yes")).click();
		/*
		 * Thread.sleep(3000); String balance =
		 * driver.findElement(By.xpath("//*[contains(@text,'Your balance is:')]")).
		 * getText(); System.out.println(balance);
		 * Assert.assertTrue(balance.contains("Your balance is:"));
		 */
	}
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
	
	@Test(priority = 1)
	public void makePayment() throws InterruptedException {
		
		driver.findElement(By.id("com.experitest.ExperiBank:id/makePaymentButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/phoneTextField")).sendKeys("123456789");
		driver.findElement(By.id("com.experitest.ExperiBank:id/nameTextField")).sendKeys("Srinivas");
		driver.findElement(By.id("com.experitest.ExperiBank:id/amountTextField")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/countryButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='USA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/sendPaymentButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		String checkBalance = driver.findElement(By.xpath("//*[contains(@text,'Your balance is:')]")).getText();
	    System.out.println(checkBalance);
	    Assert.assertTrue(checkBalance.contains("Your balance is:"));
		
		
	
	}
	
	//@Test(priority = 1)
	public void mortgageRequest() throws InterruptedException {
		
		driver.findElement(By.id("com.experitest.ExperiBank:id/mortageRequestButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/nameTextField")).sendKeys("srinivas");
		driver.findElement(By.id("com.experitest.ExperiBank:id/lastNameTextField")).sendKeys("rapelli");
		driver.findElement(By.id("com.experitest.ExperiBank:id/ageTextField")).sendKeys("23");
		driver.findElement(By.id("com.experitest.ExperiBank:id/addressOneTextField")).sendKeys("hyderabad");
		driver.findElement(By.id("com.experitest.ExperiBank:id/addressTwoTextField")).sendKeys("telangana");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/countryButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Italy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/nextButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Car']")).click();
		driver.findElement(By.xpath("//*[@text='2']")).click();
		
		scrollDown();
		
		
		driver.findElement(By.xpath("//*[@text='Private Job']")).click();
		driver.findElement(By.xpath("//*[@text='10,00,000']")).click();
 
		scrollDown();
		
		driver.findElement(By.xpath("//*[@text='Save']")).click();
		Thread.sleep(2000);		
	}
	
}
