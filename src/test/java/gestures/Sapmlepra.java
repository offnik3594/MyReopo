package gestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Sapmlepra {
	
	@Test
	void asehi() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");
		
		URL url=new URL("http://127.0.0.1:4723");
		 
		AndroidDriver d=new AndroidDriver(url,u);
		d.findElement(AppiumBy.accessibilityId("API Demos"));
		WebElement ele = d.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WhatsApp (Clone)\"))"));
	    Thread.sleep(5000);
	    ele.click();
	    
	    d.findElement(By.xpath("//android.widget.LinearLayout[1]")).click();		
		d.findElement(By.id("com.whatsapp:id/entry")).sendKeys("I Love meri jaan");
		d.findElement(By.id("com.whatsapp:id/send")).click();

		
		
	}

}
