import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.swag.pages.BasePage;

public class AjioApp extends BasePage {

	@Test
	public void regsiterToAjioApp() throws InterruptedException { 

		driver.findElement(By.id("com.ril.ajio:id/lsccmLayoutArc")).click();
	      driver.findElement(By.xpath("//*[@id='tab_icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Account']]]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@text='Sign in / Join']")).click();
	      Thread.sleep(3000); 
	     // driver.findElement(By.xpath("//*[@text='NONE OF THE ABOVE']")).click();
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@text='Use E-mail ID']")).click();
	      Thread.sleep(3000); 
	      driver.findElement(By.xpath("//*[@id='email_et']")).sendKeys("srinivas@gmail.com");
	      Thread.sleep(3000); 
	      driver.findElement(By.xpath("//*[@text='Continue']")).click();
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@id='login_new_user_mobile_tiet']")).sendKeys("15784126");
	      Thread.sleep(3000); 
	      driver.findElement(By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='key_pos_number_line3_3']]")).click();
	      Thread.sleep(3000);   
	      driver.findElement(By.xpath("//*[@id='login_new_user_name_tiet']")).sendKeys("srinivas");
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@text='Male']")).click();
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("(//*[@class='android.widget.FrameLayout' and ./parent::*[@id='key_pos_ime_action']]/*[@class='android.widget.ImageView'])[2]")).click();
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@text='Continue']")).click();
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@id='login_otp_tiet']")).sendKeys("123258");
	      Thread.sleep(3000);  
	      driver.findElement(By.xpath("//*[@text='Start Shopping']")).click();
	    }

}
