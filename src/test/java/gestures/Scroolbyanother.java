package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Scroolbyanother {
	
	@Test
	public void scroll() throws MalformedURLException, InterruptedException {
//		UiAutomator2Options u = new UiAutomator2Options();
//		u.setPlatformName("Android");
//		u.setDeviceName("Pixel");
//
//		URL url = new URL("http://127.0.0.1:4723");
//		
//		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	    WebElement ele = d.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	    Thread.sleep(5000);
	    ele.click();
	    
	
	   UiAutomator2Options u=new UiAutomator2Options();
	    
	   
	   URL url=new URL("http://127.0.0.1:4723");
	   AndroidDriver d=new AndroidDriver(url,u);
	    
d.findElement(AppiumBy
.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"kkka\"))"));
	    
	 
	 
	}

}
