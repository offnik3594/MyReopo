package projectAgro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TestRegesterFun extends BC {
	
	
	@Test
	void regesterfun() throws InterruptedException
	{  
		
		d.findElement(By.xpath("//android.view.View[@content-desc=\"\"]")).click();
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction(d);
		touchAction.tap(PointOption.point(360, 1174))
		           .perform();
		//android.widget.EditText
		d.findElement(By.xpath("//android.widget.EditText[@resource-id='name']")).sendKeys("Nikhil Kadam");
		d.findElement(By.xpath("//android.widget.EditText[@resource-id='u_mobileNo']")).sendKeys("9096729266");
		d.findElement(By.xpath("//android.widget.EditText[@resource-id='u_email']")).sendKeys("nik12@gmail.com");
		d.findElement(By.xpath("//android.widget.EditText[@resource-id='u_password']")).sendKeys("Nik@1233");
		d.findElement(By.xpath("//android.widget.EditText[@resource-id='confirmPassword']")).sendKeys("Nik@1233");
		
		d.findElement(By.xpath("//android.widget.Button[@text='REGISTER']")).click();
	    String text=d.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/message']")).getText();
	    
		Assert.assertEquals(text, "Registration Done Successfully!", "ok");
	    d.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
	}

}
