import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.swag.pages.BasePage;

public class FlipkartHealth  extends BasePage{

	@Test(priority = 0)
	public void addMedicineToCart() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("fever tablets");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Dolo 650 mg 15 Tablets']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Go to Cart']")).click();
		Thread.sleep(3000);
		String msg =driver.findElement(By.xpath("//*[@text='Sign up / Sign in for the best experience']")).getText();
		System.out.println(msg);
		
	}
}
