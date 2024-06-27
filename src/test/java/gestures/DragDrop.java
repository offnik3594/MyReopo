package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

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

public class DragDrop {
	
	@Test
	void dragandDrop() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Views")).click();
	    
	    WebElement ele = d.findElement(AppiumBy.androidUIAutomator
	    		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"))"));
	    
	    ele.click();
	    
	    WebElement ele2 = d.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	    ((JavascriptExecutor)d).executeScript("mobile:dragGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele2).getId(),"endX",619,"endY",560));
	    Thread.sleep(10000);
	    String text = d.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	    Assert.assertEquals("Dropped!", text);
	    
	}

}
