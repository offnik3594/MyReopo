package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Rotatations {
	
	
	@Test
	void rotaion() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Preference")).click();
	    d.rotate(ScreenOrientation.LANDSCAPE);
	    Thread.sleep(5000);
	    d.rotate(ScreenOrientation.PORTRAIT);
	    Thread.sleep(5000);
	    
	   
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
