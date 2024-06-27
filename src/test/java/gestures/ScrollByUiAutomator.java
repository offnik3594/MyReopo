package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ScrollByUiAutomator {

	@Test
	void scrollBy() throws MalformedURLException
	{
		
		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("Pixel");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Views")).click();
	    boolean canScrollMore;
	    do
	    {
	    	canScrollMore = (Boolean) ((JavascriptExecutor) d).executeScript("mobile: scrollGesture", ImmutableMap.of(
	    		    "left", 100, "top", 100, "width", 200, "height", 200,
	    		    "direction", "down",
	    		    "percent", 5.0
	    		));
	    }
	    while(canScrollMore);
	    
		
		
		
		
	}
	
	
	
	
}
