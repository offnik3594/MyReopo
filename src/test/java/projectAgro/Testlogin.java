package projectAgro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testlogin extends BC {
	
	
	@Test
	void login() throws InterruptedException 
	{
		d.findElement(By.xpath("//android.view.View[@content-desc=\"\"]")).click();
		Thread.sleep(5000);
		WebElement e1 = d.findElement(By.xpath("//android.widget.EditText[@resource-id='mobileNo']"));
		e1.clear();
		e1.sendKeys("9096729266");
		WebElement e2 = d.findElement(By.xpath("//android.widget.EditText[@resource-id='password']"));
		e2.clear();
		e2.sendKeys("Nik@1234");
		d.findElement(By.xpath("//android.widget.Button[@text='LOGIN']")).click();
		String text = d.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals("LogIn Done Succefully!", text);
		d.findElement(By.id("android:id/button1")).click();
		
	}

}
