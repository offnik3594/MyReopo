package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CopyPaste {
    public static String text="Kadams Classes";
	public static void main(String[] args) throws MalformedURLException {

		UiAutomator2Options u = new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.findElement(AppiumBy.accessibilityId("API Demos")).click();
	    d.findElement(AppiumBy.accessibilityId("Preference")).click();
	    d.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
   
	    d.findElement(By.id("android:id/checkbox")).click();
	   
	    
	    d.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();	
	    String AlertTitle = d.findElement(By.id("android:id/alertTitle")).getText();
	    System.out.println(AlertTitle);
	    Assert.assertEquals(AlertTitle,"WiFi settings");
	    
	    //stopp hardcoding data
	    
	    d.setClipboardText(text);
	    String textC=d.getClipboardText();
	    d.findElement(By.id("android:id/edit")).sendKeys(textC);
	    d.findElement(By.id("android:id/button1")).click();
	    
	}

}
