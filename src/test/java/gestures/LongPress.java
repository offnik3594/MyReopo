package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LongPress {
	
	@Test
	void longpress() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Views")).click();
	    d.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
	    d.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	   
	    WebElement ele = d.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	    
	    ((JavascriptExecutor) d).executeScript("mobile: longClickGesture", ImmutableMap.of(
	    	    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000));
	    	
	    Thread.sleep(5000);
	    
	    String t=d.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
	   
	    boolean ele2 = d.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).isDisplayed();
	    Assert.assertEquals("Sample menu", t);
	    Assert.assertTrue(ele2);
	
	
	
	}

}
