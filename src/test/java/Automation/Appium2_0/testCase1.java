package Automation.Appium2_0;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class testCase1 {
	
	//	 peforme operaation
	//	 find locator of preference element perform clik
	//	 click on dependencies
	//	 click on wifi 
	//	 wifi setting click
	//	 handle pop up with sendkeys
	//   click ok
	//   Extract text


	@Test
	void verifyingWifiSetting() throws MalformedURLException
	{
		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Preference")).click();
	    d.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
   
	    d.findElement(By.id("android:id/checkbox")).click();
	   
	    
	    d.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();	
	    String AlertTitle = d.findElement(By.id("android:id/alertTitle")).getText();
	    System.out.println(AlertTitle);
	    Assert.assertEquals(AlertTitle,"WiFi settings");
	    
	    d.findElement(By.id("android:id/edit")).sendKeys("KadamsClasses");
	    d.findElement(By.id("android:id/button1")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	

}
