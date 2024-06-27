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

public class SweipeG {
	
	@Test
	void Swipping() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");
		
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver d=new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(AppiumBy.accessibilityId("API Demos")).click();
		d.findElement(AppiumBy.accessibilityId("Views")).click();
		
		WebElement ele = d.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Gallery\"))"));
		ele.click();
		
		d.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
		
		WebElement ele2 = d.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		String bswipe=ele2.getAttribute("focusable");
		System.out.println(bswipe);
		Assert.assertEquals(bswipe, "true");
		
	   ((JavascriptExecutor)d).executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)ele2).getId(),"direction", "left",
   		    "percent", 1.0));
	   Thread.sleep(3000);
	   
	   String aswipe=ele2.getAttribute("focusable");
	   System.out.println(aswipe);
	   
	   Assert.assertEquals(aswipe,"false");
	  
	
		
		
		
		
	}

}
